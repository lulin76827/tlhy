package edu.yangsheng.web;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.yangsheng.dao.AnswerDAO;
import edu.yangsheng.dao.CategoryDAO;
import edu.yangsheng.dao.QuestionDAO;
import edu.yangsheng.dao.UserDAO;
import edu.yangsheng.domain.Account;
import edu.yangsheng.domain.Answer;
import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.Question;
import edu.yangsheng.domain.UserCategory;
import edu.yangsheng.service.AccountService;
import edu.yangsheng.service.AnswerService;
import edu.yangsheng.service.QuestionService;
import edu.yangsheng.service.UserCategoryService;
import edu.yangsheng.vo.TraitDetection;

@Controller("TraitDetectionController")
public class TraitDetectionController {
	/**
	 * DAO injected by Spring that manages Question entities
	 * 
	 */
	@Autowired
	private QuestionDAO questionDAO;
	/**
	 * DAO injected by Spring that manages Answer entities
	 * 
	 */
	@Autowired
	private AnswerDAO answerDAO;
	/**
	 * DAO injected by Spring that manages User entities
	 * 
	 */
	@Autowired
	private UserDAO userDAO;
	/**
	 * Service injected by Spring that provides CRUD operations for Account entities
	 * 
	 */
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private CategoryDAO categoryDAO;
	/**
	 * Service injected by Spring that provides CRUD operations for UserCategory
	 * entities
	 * 
	 */
	@Autowired
	private UserCategoryService userCategoryService;
	/**
	 * Service injected by Spring that provides CRUD operations for Question
	 * entities
	 * 
	 */
	@Autowired
	private QuestionService questionService;
	/**
	 * Service injected by Spring that provides CRUD operations for Answer
	 * entities
	 * 
	 */
	@Autowired
	private AnswerService answerService;

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register
																				// static
																				// property
																				// editors.
		binder.registerCustomEditor(java.util.Calendar.class,
				new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(
				byte[].class,
				new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class,
				new org.skyway.spring.util.databinding.EnhancedBooleanEditor(
						false));
		binder.registerCustomEditor(Boolean.class,
				new org.skyway.spring.util.databinding.EnhancedBooleanEditor(
						true));
		binder.registerCustomEditor(java.math.BigDecimal.class,
				new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(
						java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class,
				new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(
						Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class,
				new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class,
				new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class,
				new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(
						Long.class, true));
		binder.registerCustomEditor(Double.class,
				new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(
						Double.class, true));
	}

	/**
	 * Entry point to show all Account entities
	 * 
	 */
	public String indexTraitDetection() {
		return "redirect:/indexTraitDetection";
	}
	/**
	 * Show all Account entities
	 * 
	 */
	@RequestMapping("/indexTraitDetection")
	public ModelAndView showTraitDetection() {
		ModelAndView mav = new ModelAndView();

		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
			    .getAuthentication()
			    .getPrincipal();
		String username = userDetails.getUsername();
		Account account = accountService.findAccountByUsername(username);
		Integer user = account.getUser().getId();
		
		List<Question> questions = questionService.findNextGroupQuestions(user);
		if (questions.isEmpty()) {
			List<Answer> answers = answerService.findAllAnswersByUser(user);
			Set<Category> categorys = categoryDAO.findAllCategorys();
			for (Category category : categorys) {
				UserCategory usercategory_1 = new UserCategory();
				usercategory_1.setUser(userDAO.findUserById(user));
				usercategory_1.setCreateTime(Calendar.getInstance());
				Integer score = countScore(category, answers);
				usercategory_1.setScore(score);
				usercategory_1.setCategory(category);
				userCategoryService.saveUserCategory(usercategory_1);
			}
			mav.setViewName("forward:/indexUserCategory");
			return mav;
		} else {
			mav.addObject("questions", questions);
			mav.addObject("traitdetection", new TraitDetection());

			mav.setViewName("traitdetection/traitDetection.jsp");
			return mav;
		}
	}

	private Integer countScore(Category category, List<Answer> answers) {
		Integer score = 0;
		for (Answer answer : answers) {
			if (category.equals(answer.getQuestion().getCategory())) {
				score += answer.getRecord();
			}
		}
		return score;
	}

	/**
	 * Save an existing Account entity
	 * 
	 */
	@RequestMapping("/saveResult")
	public String saveResult(@ModelAttribute TraitDetection traitDetection) {
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
			    .getAuthentication()
			    .getPrincipal();
		String username = userDetails.getUsername();
		Account account = accountService.findAccountByUsername(username);
		Integer user = account.getUser().getId();
		
		Integer[] totalResult = traitDetection.getTotalResult();
		for (int i = 0; i < totalResult.length; i++) {
			Answer obj = new Answer();
			obj.setQuestion(questionDAO.findQuestionById(totalResult[i]));
			obj.setUser(userDAO.findUserById(user));
			if (contains(totalResult[i], traitDetection.getResult())) {
				obj.setRecord(1);
			} else {
				obj.setRecord(0);
			}
			obj.setCreateTime(Calendar.getInstance());
			answerService.saveAnswer(obj);
		}
		return "forward:/indexTraitDetection";
	}

	private boolean contains(Integer source, Integer[] result) {
		for (int i = 0; i < result.length; i++) {
			if (source.intValue() == result[i].intValue()) {
				return true;
			}
		}
		return false;
	}
}
