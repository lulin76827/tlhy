package edu.yangsheng.web;

import edu.yangsheng.dao.AccountDAO;
import edu.yangsheng.dao.UserDAO;

import edu.yangsheng.domain.Account;
import edu.yangsheng.domain.User;

import edu.yangsheng.service.AccountService;

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
 * Spring MVC controller that handles CRUD requests for Account entities
 * 
 */

@Controller("AccountController")
public class AccountController {

	/**
	 * DAO injected by Spring that manages Account entities
	 * 
	 */
	@Autowired
	private AccountDAO accountDAO;

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

	/**
	 * Delete an existing Account entity
	 * 
	 */
	@RequestMapping("/deleteAccount")
	public String deleteAccount(@RequestParam Integer idKey) {
		Account account = accountDAO.findAccountByPrimaryKey(idKey);
		accountService.deleteAccount(account);
		return "forward:/indexAccount";
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
	 * Show all User entities by Account
	 * 
	 */
	@RequestMapping("/listAccountUser")
	public ModelAndView listAccountUser(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("account", accountDAO.findAccountByPrimaryKey(idKey));
		mav.setViewName("account/user/listUser.jsp");

		return mav;
	}

	/**
	 * Delete an existing User entity
	 * 
	 */
	@RequestMapping("/deleteAccountUser")
	public ModelAndView deleteAccountUser(@RequestParam Integer account_id, @RequestParam Integer related_user_id) {
		ModelAndView mav = new ModelAndView();

		Account account = accountService.deleteAccountUser(account_id, related_user_id);

		mav.addObject("account_id", account_id);
		mav.addObject("account", account);
		mav.setViewName("account/viewAccount.jsp");

		return mav;
	}

	/**
	 * Save an existing Account entity
	 * 
	 */
	@RequestMapping("/saveAccount")
	public String saveAccount(@ModelAttribute Account account) {
		accountService.saveAccount(account);
		return "forward:/indexAccount";
	}

	/**
	 * Entry point to show all Account entities
	 * 
	 */
	public String indexAccount() {
		return "redirect:/indexAccount";
	}

	/**
	 * Create a new User entity
	 * 
	 */
	@RequestMapping("/newAccountUser")
	public ModelAndView newAccountUser(@RequestParam Integer account_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("account_id", account_id);
		mav.addObject("user", new User());
		mav.addObject("newFlag", true);
		mav.setViewName("account/user/editUser.jsp");

		return mav;
	}

	/**
	 * View an existing User entity
	 * 
	 */
	@RequestMapping("/selectAccountUser")
	public ModelAndView selectAccountUser(@RequestParam Integer account_id, @RequestParam Integer user_id) {
		User user = userDAO.findUserByPrimaryKey(user_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("account_id", account_id);
		mav.addObject("user", user);
		mav.setViewName("account/user/viewUser.jsp");

		return mav;
	}

	/**
	 * Edit an existing User entity
	 * 
	 */
	@RequestMapping("/editAccountUser")
	public ModelAndView editAccountUser(@RequestParam Integer account_id, @RequestParam Integer user_id) {
		User user = userDAO.findUserByPrimaryKey(user_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("account_id", account_id);
		mav.addObject("user", user);
		mav.setViewName("account/user/editUser.jsp");

		return mav;
	}

	/**
	 * Save an existing User entity
	 * 
	 */
	@RequestMapping("/saveAccountUser")
	public ModelAndView saveAccountUser(@RequestParam Integer account_id, @ModelAttribute User user) {
		Account parent_account = accountService.saveAccountUser(account_id, user);

		ModelAndView mav = new ModelAndView();
		mav.addObject("account_id", account_id);
		mav.addObject("account", parent_account);
		mav.setViewName("account/viewAccount.jsp");

		return mav;
	}

	/**
	 * Select the child User entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteAccountUser")
	public ModelAndView confirmDeleteAccountUser(@RequestParam Integer account_id, @RequestParam Integer related_user_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("user", userDAO.findUserByPrimaryKey(related_user_id));
		mav.addObject("account_id", account_id);
		mav.setViewName("account/user/deleteUser.jsp");

		return mav;
	}

	/**
	 * Select an existing Account entity
	 * 
	 */
	@RequestMapping("/selectAccount")
	public ModelAndView selectAccount(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("account", accountDAO.findAccountByPrimaryKey(idKey));
		mav.setViewName("account/viewAccount.jsp");

		return mav;
	}

	/**
	 * Select the Account entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteAccount")
	public ModelAndView confirmDeleteAccount(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("account", accountDAO.findAccountByPrimaryKey(idKey));
		mav.setViewName("account/deleteAccount.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/accountController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Create a new Account entity
	 * 
	 */
	@RequestMapping("/newAccount")
	public ModelAndView newAccount() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("account", new Account());
		mav.addObject("newFlag", true);
		mav.setViewName("account/editAccount.jsp");

		return mav;
	}

	/**
	 * Edit an existing Account entity
	 * 
	 */
	@RequestMapping("/editAccount")
	public ModelAndView editAccount(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("account", accountDAO.findAccountByPrimaryKey(idKey));
		mav.setViewName("account/editAccount.jsp");

		return mav;
	}

	/**
	 * Show all Account entities
	 * 
	 */
	@RequestMapping("/indexAccount")
	public ModelAndView listAccounts() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accounts", accountService.loadAccounts());

		mav.setViewName("account/listAccounts.jsp");

		return mav;
	}
}