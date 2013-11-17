package edu.yangsheng.web;

import edu.yangsheng.dao.AccountDAO;
import edu.yangsheng.dao.AnswerDAO;
import edu.yangsheng.dao.UserCategoryDAO;
import edu.yangsheng.dao.UserDAO;

import edu.yangsheng.domain.Account;
import edu.yangsheng.domain.Answer;
import edu.yangsheng.domain.User;
import edu.yangsheng.domain.UserCategory;

import edu.yangsheng.service.UserService;

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
 * Spring MVC controller that handles CRUD requests for User entities
 * 
 */

@Controller("UserController")
public class UserController {

	/**
	 * DAO injected by Spring that manages Account entities
	 * 
	 */
	@Autowired
	private AccountDAO accountDAO;

	/**
	 * DAO injected by Spring that manages Answer entities
	 * 
	 */
	@Autowired
	private AnswerDAO answerDAO;

	/**
	 * DAO injected by Spring that manages UserCategory entities
	 * 
	 */
	@Autowired
	private UserCategoryDAO userCategoryDAO;

	/**
	 * DAO injected by Spring that manages User entities
	 * 
	 */
	@Autowired
	private UserDAO userDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for User entities
	 * 
	 */
	@Autowired
	private UserService userService;

	/**
	 * View an existing UserCategory entity
	 * 
	 */
	@RequestMapping("/selectUserUserCategories")
	public ModelAndView selectUserUserCategories(@RequestParam Integer user_id, @RequestParam Integer usercategories_id) {
		UserCategory usercategory = userCategoryDAO.findUserCategoryByPrimaryKey(usercategories_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("user_id", user_id);
		mav.addObject("usercategory", usercategory);
		mav.setViewName("user/usercategories/viewUserCategories.jsp");

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
	 * Edit an existing Answer entity
	 * 
	 */
	@RequestMapping("/editUserAnswers")
	public ModelAndView editUserAnswers(@RequestParam Integer user_id, @RequestParam Integer answers_id) {
		Answer answer = answerDAO.findAnswerByPrimaryKey(answers_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("user_id", user_id);
		mav.addObject("answer", answer);
		mav.setViewName("user/answers/editAnswers.jsp");

		return mav;
	}

	/**
	 * View an existing Account entity
	 * 
	 */
	@RequestMapping("/selectUserAccounts")
	public ModelAndView selectUserAccounts(@RequestParam Integer user_id, @RequestParam Integer accounts_id) {
		Account account = accountDAO.findAccountByPrimaryKey(accounts_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("user_id", user_id);
		mav.addObject("account", account);
		mav.setViewName("user/accounts/viewAccounts.jsp");

		return mav;
	}

	/**
	 * Edit an existing UserCategory entity
	 * 
	 */
	@RequestMapping("/editUserUserCategories")
	public ModelAndView editUserUserCategories(@RequestParam Integer user_id, @RequestParam Integer usercategories_id) {
		UserCategory usercategory = userCategoryDAO.findUserCategoryByPrimaryKey(usercategories_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("user_id", user_id);
		mav.addObject("usercategory", usercategory);
		mav.setViewName("user/usercategories/editUserCategories.jsp");

		return mav;
	}

	/**
	 * Select the User entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUser")
	public ModelAndView confirmDeleteUser(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("user", userDAO.findUserByPrimaryKey(idKey));
		mav.setViewName("user/deleteUser.jsp");

		return mav;
	}

	/**
	 * Delete an existing User entity
	 * 
	 */
	@RequestMapping("/deleteUser")
	public String deleteUser(@RequestParam Integer idKey) {
		User user = userDAO.findUserByPrimaryKey(idKey);
		userService.deleteUser(user);
		return "forward:/indexUser";
	}

	/**
	 */
	@RequestMapping("/userController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Save an existing Answer entity
	 * 
	 */
	@RequestMapping("/saveUserAnswers")
	public ModelAndView saveUserAnswers(@RequestParam Integer user_id, @ModelAttribute Answer answers) {
		User parent_user = userService.saveUserAnswers(user_id, answers);

		ModelAndView mav = new ModelAndView();
		mav.addObject("user_id", user_id);
		mav.addObject("user", parent_user);
		mav.setViewName("user/viewUser.jsp");

		return mav;
	}

	/**
	 * View an existing Answer entity
	 * 
	 */
	@RequestMapping("/selectUserAnswers")
	public ModelAndView selectUserAnswers(@RequestParam Integer user_id, @RequestParam Integer answers_id) {
		Answer answer = answerDAO.findAnswerByPrimaryKey(answers_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("user_id", user_id);
		mav.addObject("answer", answer);
		mav.setViewName("user/answers/viewAnswers.jsp");

		return mav;
	}

	/**
	 * Show all Answer entities by User
	 * 
	 */
	@RequestMapping("/listUserAnswers")
	public ModelAndView listUserAnswers(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("user", userDAO.findUserByPrimaryKey(idKey));
		mav.setViewName("user/answers/listAnswers.jsp");

		return mav;
	}

	/**
	 * Create a new UserCategory entity
	 * 
	 */
	@RequestMapping("/newUserUserCategories")
	public ModelAndView newUserUserCategories(@RequestParam Integer user_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("user_id", user_id);
		mav.addObject("usercategory", new UserCategory());
		mav.addObject("newFlag", true);
		mav.setViewName("user/usercategories/editUserCategories.jsp");

		return mav;
	}

	/**
	 * Select the child Account entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUserAccounts")
	public ModelAndView confirmDeleteUserAccounts(@RequestParam Integer user_id, @RequestParam Integer related_accounts_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("account", accountDAO.findAccountByPrimaryKey(related_accounts_id));
		mav.addObject("user_id", user_id);
		mav.setViewName("user/accounts/deleteAccounts.jsp");

		return mav;
	}

	/**
	 * Show all User entities
	 * 
	 */
	@RequestMapping("/indexUser")
	public ModelAndView listUsers() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", userService.loadUsers());

		mav.setViewName("user/listUsers.jsp");

		return mav;
	}

	/**
	 * Create a new Account entity
	 * 
	 */
	@RequestMapping("/newUserAccounts")
	public ModelAndView newUserAccounts(@RequestParam Integer user_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("user_id", user_id);
		mav.addObject("account", new Account());
		mav.addObject("newFlag", true);
		mav.setViewName("user/accounts/editAccounts.jsp");

		return mav;
	}

	/**
	 * Create a new Answer entity
	 * 
	 */
	@RequestMapping("/newUserAnswers")
	public ModelAndView newUserAnswers(@RequestParam Integer user_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("user_id", user_id);
		mav.addObject("answer", new Answer());
		mav.addObject("newFlag", true);
		mav.setViewName("user/answers/editAnswers.jsp");

		return mav;
	}

	/**
	 * Delete an existing Answer entity
	 * 
	 */
	@RequestMapping("/deleteUserAnswers")
	public ModelAndView deleteUserAnswers(@RequestParam Integer user_id, @RequestParam Integer related_answers_id) {
		ModelAndView mav = new ModelAndView();

		User user = userService.deleteUserAnswers(user_id, related_answers_id);

		mav.addObject("user_id", user_id);
		mav.addObject("user", user);
		mav.setViewName("user/viewUser.jsp");

		return mav;
	}

	/**
	 * Save an existing UserCategory entity
	 * 
	 */
	@RequestMapping("/saveUserUserCategories")
	public ModelAndView saveUserUserCategories(@RequestParam Integer user_id, @ModelAttribute UserCategory usercategories) {
		User parent_user = userService.saveUserUserCategories(user_id, usercategories);

		ModelAndView mav = new ModelAndView();
		mav.addObject("user_id", user_id);
		mav.addObject("user", parent_user);
		mav.setViewName("user/viewUser.jsp");

		return mav;
	}

	/**
	 * Select the child Answer entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUserAnswers")
	public ModelAndView confirmDeleteUserAnswers(@RequestParam Integer user_id, @RequestParam Integer related_answers_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("answer", answerDAO.findAnswerByPrimaryKey(related_answers_id));
		mav.addObject("user_id", user_id);
		mav.setViewName("user/answers/deleteAnswers.jsp");

		return mav;
	}

	/**
	 * Save an existing User entity
	 * 
	 */
	@RequestMapping("/saveUser")
	public String saveUser(@ModelAttribute User user) {
		userService.saveUser(user);
		return "forward:/indexUser";
	}

	/**
	 * Create a new User entity
	 * 
	 */
	@RequestMapping("/newUser")
	public ModelAndView newUser() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("user", new User());
		mav.addObject("newFlag", true);
		mav.setViewName("user/editUser.jsp");

		return mav;
	}

	/**
	 * Select the child UserCategory entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUserUserCategories")
	public ModelAndView confirmDeleteUserUserCategories(@RequestParam Integer user_id, @RequestParam Integer related_usercategories_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usercategory", userCategoryDAO.findUserCategoryByPrimaryKey(related_usercategories_id));
		mav.addObject("user_id", user_id);
		mav.setViewName("user/usercategories/deleteUserCategories.jsp");

		return mav;
	}

	/**
	 * Edit an existing User entity
	 * 
	 */
	@RequestMapping("/editUser")
	public ModelAndView editUser(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("user", userDAO.findUserByPrimaryKey(idKey));
		mav.setViewName("user/editUser.jsp");

		return mav;
	}

	/**
	 * Show all Account entities by User
	 * 
	 */
	@RequestMapping("/listUserAccounts")
	public ModelAndView listUserAccounts(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("user", userDAO.findUserByPrimaryKey(idKey));
		mav.setViewName("user/accounts/listAccounts.jsp");

		return mav;
	}

	/**
	 * Delete an existing Account entity
	 * 
	 */
	@RequestMapping("/deleteUserAccounts")
	public ModelAndView deleteUserAccounts(@RequestParam Integer user_id, @RequestParam Integer related_accounts_id) {
		ModelAndView mav = new ModelAndView();

		User user = userService.deleteUserAccounts(user_id, related_accounts_id);

		mav.addObject("user_id", user_id);
		mav.addObject("user", user);
		mav.setViewName("user/viewUser.jsp");

		return mav;
	}

	/**
	 * Select an existing User entity
	 * 
	 */
	@RequestMapping("/selectUser")
	public ModelAndView selectUser(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("user", userDAO.findUserByPrimaryKey(idKey));
		mav.setViewName("user/viewUser.jsp");

		return mav;
	}

	/**
	 * Entry point to show all User entities
	 * 
	 */
	public String indexUser() {
		return "redirect:/indexUser";
	}

	/**
	 * Save an existing Account entity
	 * 
	 */
	@RequestMapping("/saveUserAccounts")
	public ModelAndView saveUserAccounts(@RequestParam Integer user_id, @ModelAttribute Account accounts) {
		User parent_user = userService.saveUserAccounts(user_id, accounts);

		ModelAndView mav = new ModelAndView();
		mav.addObject("user_id", user_id);
		mav.addObject("user", parent_user);
		mav.setViewName("user/viewUser.jsp");

		return mav;
	}

	/**
	 * Edit an existing Account entity
	 * 
	 */
	@RequestMapping("/editUserAccounts")
	public ModelAndView editUserAccounts(@RequestParam Integer user_id, @RequestParam Integer accounts_id) {
		Account account = accountDAO.findAccountByPrimaryKey(accounts_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("user_id", user_id);
		mav.addObject("account", account);
		mav.setViewName("user/accounts/editAccounts.jsp");

		return mav;
	}

	/**
	 * Show all UserCategory entities by User
	 * 
	 */
	@RequestMapping("/listUserUserCategories")
	public ModelAndView listUserUserCategories(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("user", userDAO.findUserByPrimaryKey(idKey));
		mav.setViewName("user/usercategories/listUserCategories.jsp");

		return mav;
	}

	/**
	 * Delete an existing UserCategory entity
	 * 
	 */
	@RequestMapping("/deleteUserUserCategories")
	public ModelAndView deleteUserUserCategories(@RequestParam Integer user_id, @RequestParam Integer related_usercategories_id) {
		ModelAndView mav = new ModelAndView();

		User user = userService.deleteUserUserCategories(user_id, related_usercategories_id);

		mav.addObject("user_id", user_id);
		mav.addObject("user", user);
		mav.setViewName("user/viewUser.jsp");

		return mav;
	}
}