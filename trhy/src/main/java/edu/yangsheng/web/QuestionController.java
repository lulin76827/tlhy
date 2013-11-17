package edu.yangsheng.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.yangsheng.dao.AnswerDAO;
import edu.yangsheng.dao.CategoryDAO;
import edu.yangsheng.dao.QuestionDAO;
import edu.yangsheng.domain.Answer;
import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.Question;
import edu.yangsheng.service.QuestionService;

/**
 * Spring MVC controller that handles CRUD requests for Question entities
 * 
 */

@Controller("QuestionController")
public class QuestionController {

	/**
	 * DAO injected by Spring that manages Answer entities
	 * 
	 */
	@Autowired
	private AnswerDAO answerDAO;

	/**
	 * DAO injected by Spring that manages Category entities
	 * 
	 */
	@Autowired
	private CategoryDAO categoryDAO;

	/**
	 * DAO injected by Spring that manages Question entities
	 * 
	 */
	@Autowired
	private QuestionDAO questionDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Question entities
	 * 
	 */
	@Autowired
	private QuestionService questionService;

	/**
	 * Create a new Category entity
	 * 
	 */
	@RequestMapping("/newQuestionCategory")
	public ModelAndView newQuestionCategory(@RequestParam Integer question_id) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("question_id", question_id);
		mav.addObject("category", new Category());
		mav.addObject("newFlag", true);
		mav.setViewName("question/category/editCategory.jsp");

		return mav;
	}

	/**
	 * Select the child Answer entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteQuestionAnswers")
	public ModelAndView confirmDeleteQuestionAnswers(@RequestParam Integer question_id, @RequestParam Integer related_answers_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("answer", answerDAO.findAnswerByPrimaryKey(related_answers_id));
		mav.addObject("question_id", question_id);
		mav.setViewName("question/answers/deleteAnswers.jsp");

		return mav;
	}

	/**
	 * Create a new Answer entity
	 * 
	 */
	@RequestMapping("/newQuestionAnswers")
	public ModelAndView newQuestionAnswers(@RequestParam Integer question_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("question_id", question_id);
		mav.addObject("answer", new Answer());
		mav.addObject("newFlag", true);
		mav.setViewName("question/answers/editAnswers.jsp");

		return mav;
	}

	/**
	 * View an existing Answer entity
	 * 
	 */
	@RequestMapping("/selectQuestionAnswers")
	public ModelAndView selectQuestionAnswers(@RequestParam Integer question_id, @RequestParam Integer answers_id) {
		Answer answer = answerDAO.findAnswerByPrimaryKey(answers_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("question_id", question_id);
		mav.addObject("answer", answer);
		mav.setViewName("question/answers/viewAnswers.jsp");

		return mav;
	}

	/**
	 * Create a new Question entity
	 * 
	 */
	@RequestMapping("/newQuestion")
	public ModelAndView newQuestion() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("question", new Question());
		mav.addObject("newFlag", true);
		mav.addObject("categorys", categoryDAO.findAllCategorys());
		mav.setViewName("question/editQuestion.jsp");

		return mav;
	}

	/**
	 * Show all Question entities
	 * 
	 */
	@RequestMapping("/indexQuestion")
	public ModelAndView listQuestions() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("questions", questionService.loadQuestions());

		mav.setViewName("question/listQuestions.jsp");

		return mav;
	}

	/**
	 * Show all Answer entities by Question
	 * 
	 */
	@RequestMapping("/listQuestionAnswers")
	public ModelAndView listQuestionAnswers(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("question", questionDAO.findQuestionByPrimaryKey(idKey));
		mav.setViewName("question/answers/listAnswers.jsp");

		return mav;
	}

	/**
	 * Edit an existing Answer entity
	 * 
	 */
	@RequestMapping("/editQuestionAnswers")
	public ModelAndView editQuestionAnswers(@RequestParam Integer question_id, @RequestParam Integer answers_id) {
		Answer answer = answerDAO.findAnswerByPrimaryKey(answers_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("question_id", question_id);
		mav.addObject("answer", answer);
		mav.setViewName("question/answers/editAnswers.jsp");

		return mav;
	}

	/**
	 * Select the child Category entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteQuestionCategory")
	public ModelAndView confirmDeleteQuestionCategory(@RequestParam Integer question_id, @RequestParam Integer related_category_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("category", categoryDAO.findCategoryByPrimaryKey(related_category_id));
		mav.addObject("question_id", question_id);
		mav.setViewName("question/category/deleteCategory.jsp");

		return mav;
	}

	/**
	 * Save an existing Answer entity
	 * 
	 */
	@RequestMapping("/saveQuestionAnswers")
	public ModelAndView saveQuestionAnswers(@RequestParam Integer question_id, @ModelAttribute Answer answers) {
		Question parent_question = questionService.saveQuestionAnswers(question_id, answers);

		ModelAndView mav = new ModelAndView();
		mav.addObject("question_id", question_id);
		mav.addObject("question", parent_question);
		mav.setViewName("question/viewQuestion.jsp");

		return mav;
	}

	/**
	 * Edit an existing Question entity
	 * 
	 */
	@RequestMapping("/editQuestion")
	public ModelAndView editQuestion(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("categorys", categoryDAO.findAllCategorys());
		mav.addObject("question", questionDAO.findQuestionByPrimaryKey(idKey));
		mav.setViewName("question/editQuestion.jsp");

		return mav;
	}

	/**
	 * Select an existing Question entity
	 * 
	 */
	@RequestMapping("/selectQuestion")
	public ModelAndView selectQuestion(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("question", questionDAO.findQuestionByPrimaryKey(idKey));
		mav.setViewName("question/viewQuestion.jsp");

		return mav;
	}

	/**
	 * Delete an existing Answer entity
	 * 
	 */
	@RequestMapping("/deleteQuestionAnswers")
	public ModelAndView deleteQuestionAnswers(@RequestParam Integer question_id, @RequestParam Integer related_answers_id) {
		ModelAndView mav = new ModelAndView();

		Question question = questionService.deleteQuestionAnswers(question_id, related_answers_id);

		mav.addObject("question_id", question_id);
		mav.addObject("question", question);
		mav.setViewName("question/viewQuestion.jsp");

		return mav;
	}

	/**
	 * Delete an existing Question entity
	 * 
	 */
	@RequestMapping("/deleteQuestion")
	public String deleteQuestion(@RequestParam Integer idKey) {
		Question question = questionDAO.findQuestionByPrimaryKey(idKey);
		questionService.deleteQuestion(question);
		return "forward:/indexQuestion";
	}

	/**
	 * Entry point to show all Question entities
	 * 
	 */
	public String indexQuestion() {
		return "redirect:/indexQuestion";
	}

	/**
	 * Save an existing Question entity
	 * 
	 */
	@RequestMapping("/saveQuestion")
	public String saveQuestion(@ModelAttribute Question question) {
		questionService.saveQuestion(question);
		return "forward:/indexQuestion";
	}

	/**
	 * Show all Category entities by Question
	 * 
	 */
	@RequestMapping("/listQuestionCategory")
	public ModelAndView listQuestionCategory(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("question", questionDAO.findQuestionByPrimaryKey(idKey));
		mav.setViewName("question/category/listCategory.jsp");

		return mav;
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * Delete an existing Category entity
	 * 
	 */
	@RequestMapping("/deleteQuestionCategory")
	public ModelAndView deleteQuestionCategory(@RequestParam Integer question_id, @RequestParam Integer related_category_id) {
		ModelAndView mav = new ModelAndView();

		Question question = questionService.deleteQuestionCategory(question_id, related_category_id);

		mav.addObject("question_id", question_id);
		mav.addObject("question", question);
		mav.setViewName("question/viewQuestion.jsp");

		return mav;
	}

	/**
	 * Edit an existing Category entity
	 * 
	 */
	@RequestMapping("/editQuestionCategory")
	public ModelAndView editQuestionCategory(@RequestParam Integer question_id, @RequestParam Integer category_id) {
		Category category = categoryDAO.findCategoryByPrimaryKey(category_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("question_id", question_id);
		mav.addObject("category", category);
		mav.setViewName("question/category/editCategory.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/questionController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select the Question entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteQuestion")
	public ModelAndView confirmDeleteQuestion(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("question", questionDAO.findQuestionByPrimaryKey(idKey));
		mav.setViewName("question/deleteQuestion.jsp");

		return mav;
	}

	/**
	 * Save an existing Category entity
	 * 
	 */
	@RequestMapping("/saveQuestionCategory")
	public ModelAndView saveQuestionCategory(@RequestParam Integer question_id, @ModelAttribute Category category) {
		Question parent_question = questionService.saveQuestionCategory(question_id, category);

		ModelAndView mav = new ModelAndView();
		mav.addObject("question_id", question_id);
		mav.addObject("question", parent_question);
		mav.setViewName("question/viewQuestion.jsp");

		return mav;
	}

	/**
	 * View an existing Category entity
	 * 
	 */
	@RequestMapping("/selectQuestionCategory")
	public ModelAndView selectQuestionCategory(@RequestParam Integer question_id, @RequestParam Integer category_id) {
		Category category = categoryDAO.findCategoryByPrimaryKey(category_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("question_id", question_id);
		mav.addObject("category", category);
		mav.setViewName("question/category/viewCategory.jsp");

		return mav;
	}
}