package edu.yangsheng.web;

import edu.yangsheng.dao.AnswerDAO;
import edu.yangsheng.dao.QuestionDAO;
import edu.yangsheng.dao.UserDAO;

import edu.yangsheng.domain.Answer;
import edu.yangsheng.domain.Question;
import edu.yangsheng.domain.User;

import edu.yangsheng.service.AnswerService;

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

/**
 * Spring MVC controller that handles CRUD requests for Answer entities
 * 
 */

@Controller("AnswerController")
public class AnswerController {

	/**
	 * DAO injected by Spring that manages Answer entities
	 * 
	 */
	@Autowired
	private AnswerDAO answerDAO;

	/**
	 * DAO injected by Spring that manages Question entities
	 * 
	 */
	@Autowired
	private QuestionDAO questionDAO;

	/**
	 * DAO injected by Spring that manages User entities
	 * 
	 */
	@Autowired
	private UserDAO userDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Answer entities
	 * 
	 */
	@Autowired
	private AnswerService answerService;

	/**
	 * Create a new User entity
	 * 
	 */
	@RequestMapping("/newAnswerUser")
	public ModelAndView newAnswerUser(@RequestParam Integer answer_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("answer_id", answer_id);
		mav.addObject("user", new User());
		mav.addObject("newFlag", true);
		mav.setViewName("answer/user/editUser.jsp");

		return mav;
	}

	/**
	 * Save an existing User entity
	 * 
	 */
	@RequestMapping("/saveAnswerUser")
	public ModelAndView saveAnswerUser(@RequestParam Integer answer_id, @ModelAttribute User user) {
		Answer parent_answer = answerService.saveAnswerUser(answer_id, user);

		ModelAndView mav = new ModelAndView();
		mav.addObject("answer_id", answer_id);
		mav.addObject("answer", parent_answer);
		mav.setViewName("answer/viewAnswer.jsp");

		return mav;
	}

	/**
	 * Delete an existing Answer entity
	 * 
	 */
	@RequestMapping("/deleteAnswer")
	public String deleteAnswer(@RequestParam Integer idKey) {
		Answer answer = answerDAO.findAnswerByPrimaryKey(idKey);
		answerService.deleteAnswer(answer);
		return "forward:/indexAnswer";
	}

	/**
	 * Show all User entities by Answer
	 * 
	 */
	@RequestMapping("/listAnswerUser")
	public ModelAndView listAnswerUser(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("answer", answerDAO.findAnswerByPrimaryKey(idKey));
		mav.setViewName("answer/user/listUser.jsp");

		return mav;
	}

	/**
	 * Save an existing Answer entity
	 * 
	 */
	@RequestMapping("/saveAnswer")
	public String saveAnswer(@ModelAttribute Answer answer) {
		answerService.saveAnswer(answer);
		return "forward:/indexAnswer";
	}

	/**
	 * Select the Answer entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteAnswer")
	public ModelAndView confirmDeleteAnswer(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("answer", answerDAO.findAnswerByPrimaryKey(idKey));
		mav.setViewName("answer/deleteAnswer.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/answerController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Create a new Question entity
	 * 
	 */
	@RequestMapping("/newAnswerQuestion")
	public ModelAndView newAnswerQuestion(@RequestParam Integer answer_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("answer_id", answer_id);
		mav.addObject("question", new Question());
		mav.addObject("newFlag", true);
		mav.setViewName("answer/question/editQuestion.jsp");

		return mav;
	}

	/**
	 * Select an existing Answer entity
	 * 
	 */
	@RequestMapping("/selectAnswer")
	public ModelAndView selectAnswer(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("answer", answerDAO.findAnswerByPrimaryKey(idKey));
		mav.setViewName("answer/viewAnswer.jsp");

		return mav;
	}

	/**
	 * Edit an existing Answer entity
	 * 
	 */
	@RequestMapping("/editAnswer")
	public ModelAndView editAnswer(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", userDAO.findAllUsers());
		mav.addObject("questions", questionDAO.findAllQuestions());
		mav.addObject("answer", answerDAO.findAnswerByPrimaryKey(idKey));
		mav.setViewName("answer/editAnswer.jsp");

		return mav;
	}

	/**
	 * Show all Answer entities
	 * 
	 */
	@RequestMapping("/indexAnswer")
	public ModelAndView listAnswers() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("answers", answerService.loadAnswers());

		mav.setViewName("answer/listAnswers.jsp");

		return mav;
	}

	/**
	 * Create a new Answer entity
	 * 
	 */
	@RequestMapping("/newAnswer")
	public ModelAndView newAnswer() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("answer", new Answer());
		mav.addObject("newFlag", true);
		mav.addObject("users", userDAO.findAllUsers());
		mav.addObject("questions", questionDAO.findAllQuestions());
		mav.setViewName("answer/editAnswer.jsp");

		return mav;
	}

	/**
	 * Delete an existing User entity
	 * 
	 */
	@RequestMapping("/deleteAnswerUser")
	public ModelAndView deleteAnswerUser(@RequestParam Integer answer_id, @RequestParam Integer related_user_id) {
		ModelAndView mav = new ModelAndView();

		Answer answer = answerService.deleteAnswerUser(answer_id, related_user_id);

		mav.addObject("answer_id", answer_id);
		mav.addObject("answer", answer);
		mav.setViewName("answer/viewAnswer.jsp");

		return mav;
	}

	/**
	 * View an existing User entity
	 * 
	 */
	@RequestMapping("/selectAnswerUser")
	public ModelAndView selectAnswerUser(@RequestParam Integer answer_id, @RequestParam Integer user_id) {
		User user = userDAO.findUserByPrimaryKey(user_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("answer_id", answer_id);
		mav.addObject("user", user);
		mav.setViewName("answer/user/viewUser.jsp");

		return mav;
	}

	/**
	 * Select the child User entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteAnswerUser")
	public ModelAndView confirmDeleteAnswerUser(@RequestParam Integer answer_id, @RequestParam Integer related_user_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("user", userDAO.findUserByPrimaryKey(related_user_id));
		mav.addObject("answer_id", answer_id);
		mav.setViewName("answer/user/deleteUser.jsp");

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
	 * Save an existing Question entity
	 * 
	 */
	@RequestMapping("/saveAnswerQuestion")
	public ModelAndView saveAnswerQuestion(@RequestParam Integer answer_id, @ModelAttribute Question question) {
		Answer parent_answer = answerService.saveAnswerQuestion(answer_id, question);

		ModelAndView mav = new ModelAndView();
		mav.addObject("answer_id", answer_id);
		mav.addObject("answer", parent_answer);
		mav.setViewName("answer/viewAnswer.jsp");

		return mav;
	}

	/**
	 * Show all Question entities by Answer
	 * 
	 */
	@RequestMapping("/listAnswerQuestion")
	public ModelAndView listAnswerQuestion(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("answer", answerDAO.findAnswerByPrimaryKey(idKey));
		mav.setViewName("answer/question/listQuestion.jsp");

		return mav;
	}

	/**
	 * Delete an existing Question entity
	 * 
	 */
	@RequestMapping("/deleteAnswerQuestion")
	public ModelAndView deleteAnswerQuestion(@RequestParam Integer answer_id, @RequestParam Integer related_question_id) {
		ModelAndView mav = new ModelAndView();

		Answer answer = answerService.deleteAnswerQuestion(answer_id, related_question_id);

		mav.addObject("answer_id", answer_id);
		mav.addObject("answer", answer);
		mav.setViewName("answer/viewAnswer.jsp");

		return mav;
	}

	/**
	 * Edit an existing Question entity
	 * 
	 */
	@RequestMapping("/editAnswerQuestion")
	public ModelAndView editAnswerQuestion(@RequestParam Integer answer_id, @RequestParam Integer question_id) {
		Question question = questionDAO.findQuestionByPrimaryKey(question_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("answer_id", answer_id);
		mav.addObject("question", question);
		mav.setViewName("answer/question/editQuestion.jsp");

		return mav;
	}

	/**
	 * Edit an existing User entity
	 * 
	 */
	@RequestMapping("/editAnswerUser")
	public ModelAndView editAnswerUser(@RequestParam Integer answer_id, @RequestParam Integer user_id) {
		User user = userDAO.findUserByPrimaryKey(user_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("answer_id", answer_id);
		mav.addObject("user", user);
		mav.setViewName("answer/user/editUser.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Answer entities
	 * 
	 */
	public String indexAnswer() {
		return "redirect:/indexAnswer";
	}

	/**
	 * View an existing Question entity
	 * 
	 */
	@RequestMapping("/selectAnswerQuestion")
	public ModelAndView selectAnswerQuestion(@RequestParam Integer answer_id, @RequestParam Integer question_id) {
		Question question = questionDAO.findQuestionByPrimaryKey(question_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("answer_id", answer_id);
		mav.addObject("question", question);
		mav.setViewName("answer/question/viewQuestion.jsp");

		return mav;
	}

	/**
	 * Select the child Question entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteAnswerQuestion")
	public ModelAndView confirmDeleteAnswerQuestion(@RequestParam Integer answer_id, @RequestParam Integer related_question_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("question", questionDAO.findQuestionByPrimaryKey(related_question_id));
		mav.addObject("answer_id", answer_id);
		mav.setViewName("answer/question/deleteQuestion.jsp");

		return mav;
	}
}