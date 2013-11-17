package edu.yangsheng.web;

import edu.yangsheng.dao.CategoryDAO;
import edu.yangsheng.dao.UserCategoryDAO;
import edu.yangsheng.dao.UserDAO;

import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.User;
import edu.yangsheng.domain.UserCategory;

import edu.yangsheng.service.UserCategoryService;

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
 * Spring MVC controller that handles CRUD requests for UserCategory entities
 * 
 */

@Controller("UserCategoryController")
public class UserCategoryController {

	/**
	 * DAO injected by Spring that manages Category entities
	 * 
	 */
	@Autowired
	private CategoryDAO categoryDAO;

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
	 * Service injected by Spring that provides CRUD operations for UserCategory entities
	 * 
	 */
	@Autowired
	private UserCategoryService userCategoryService;

	/**
	 * Delete an existing UserCategory entity
	 * 
	 */
	@RequestMapping("/deleteUserCategory")
	public String deleteUserCategory(@RequestParam Integer idKey) {
		UserCategory usercategory = userCategoryDAO.findUserCategoryByPrimaryKey(idKey);
		userCategoryService.deleteUserCategory(usercategory);
		return "forward:/indexUserCategory";
	}

	/**
	 * Save an existing UserCategory entity
	 * 
	 */
	@RequestMapping("/saveUserCategory")
	public String saveUserCategory(@ModelAttribute UserCategory usercategory) {
		userCategoryService.saveUserCategory(usercategory);
		return "forward:/indexUserCategory";
	}

	/**
	 * Create a new User entity
	 * 
	 */
	@RequestMapping("/newUserCategoryUser")
	public ModelAndView newUserCategoryUser(@RequestParam Integer usercategory_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("usercategory_id", usercategory_id);
		mav.addObject("user", new User());
		mav.addObject("newFlag", true);
		mav.setViewName("usercategory/user/editUser.jsp");

		return mav;
	}

	/**
	 * View an existing Category entity
	 * 
	 */
	@RequestMapping("/selectUserCategoryCategory")
	public ModelAndView selectUserCategoryCategory(@RequestParam Integer usercategory_id, @RequestParam Integer category_id) {
		Category category = categoryDAO.findCategoryByPrimaryKey(category_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usercategory_id", usercategory_id);
		mav.addObject("category", category);
		mav.setViewName("usercategory/category/viewCategory.jsp");

		return mav;
	}

	/**
	 * Edit an existing UserCategory entity
	 * 
	 */
	@RequestMapping("/editUserCategory")
	public ModelAndView editUserCategory(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("categorys", categoryDAO.findAllCategorys());
		mav.addObject("usercategory", userCategoryDAO.findUserCategoryByPrimaryKey(idKey));
		mav.setViewName("usercategory/editUserCategory.jsp");

		return mav;
	}

	/**
	 * Show all UserCategory entities
	 * 
	 */
	@RequestMapping("/indexUserCategory")
	public ModelAndView listUserCategorys() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usercategorys", userCategoryService.loadUserCategorys());

		mav.setViewName("usercategory/listUserCategorys.jsp");

		return mav;
	}

	/**
	 * Entry point to show all UserCategory entities
	 * 
	 */
	public String indexUserCategory() {
		return "redirect:/indexUserCategory";
	}

	/**
	 * Save an existing User entity
	 * 
	 */
	@RequestMapping("/saveUserCategoryUser")
	public ModelAndView saveUserCategoryUser(@RequestParam Integer usercategory_id, @ModelAttribute User user) {
		UserCategory parent_usercategory = userCategoryService.saveUserCategoryUser(usercategory_id, user);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usercategory_id", usercategory_id);
		mav.addObject("usercategory", parent_usercategory);
		mav.setViewName("usercategory/viewUserCategory.jsp");

		return mav;
	}

	/**
	 * Select the UserCategory entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUserCategory")
	public ModelAndView confirmDeleteUserCategory(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usercategory", userCategoryDAO.findUserCategoryByPrimaryKey(idKey));
		mav.setViewName("usercategory/deleteUserCategory.jsp");

		return mav;
	}

	/**
	 * Edit an existing User entity
	 * 
	 */
	@RequestMapping("/editUserCategoryUser")
	public ModelAndView editUserCategoryUser(@RequestParam Integer usercategory_id, @RequestParam Integer user_id) {
		User user = userDAO.findUserByPrimaryKey(user_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usercategory_id", usercategory_id);
		mav.addObject("user", user);
		mav.setViewName("usercategory/user/editUser.jsp");

		return mav;
	}

	/**
	 * Create a new UserCategory entity
	 * 
	 */
	@RequestMapping("/newUserCategory")
	public ModelAndView newUserCategory() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usercategory", new UserCategory());
		mav.addObject("newFlag", true);
		mav.addObject("categorys", categoryDAO.findAllCategorys());
		mav.setViewName("usercategory/editUserCategory.jsp");

		return mav;
	}

	/**
	 * Delete an existing User entity
	 * 
	 */
	@RequestMapping("/deleteUserCategoryUser")
	public ModelAndView deleteUserCategoryUser(@RequestParam Integer usercategory_id, @RequestParam Integer related_user_id) {
		ModelAndView mav = new ModelAndView();

		UserCategory usercategory = userCategoryService.deleteUserCategoryUser(usercategory_id, related_user_id);

		mav.addObject("usercategory_id", usercategory_id);
		mav.addObject("usercategory", usercategory);
		mav.setViewName("usercategory/viewUserCategory.jsp");

		return mav;
	}

	/**
	 * Edit an existing Category entity
	 * 
	 */
	@RequestMapping("/editUserCategoryCategory")
	public ModelAndView editUserCategoryCategory(@RequestParam Integer usercategory_id, @RequestParam Integer category_id) {
		Category category = categoryDAO.findCategoryByPrimaryKey(category_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usercategory_id", usercategory_id);
		mav.addObject("category", category);
		mav.setViewName("usercategory/category/editCategory.jsp");

		return mav;
	}

	/**
	 * Save an existing Category entity
	 * 
	 */
	@RequestMapping("/saveUserCategoryCategory")
	public ModelAndView saveUserCategoryCategory(@RequestParam Integer usercategory_id, @ModelAttribute Category category) {
		UserCategory parent_usercategory = userCategoryService.saveUserCategoryCategory(usercategory_id, category);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usercategory_id", usercategory_id);
		mav.addObject("usercategory", parent_usercategory);
		mav.setViewName("usercategory/viewUserCategory.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/usercategoryController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Show all User entities by UserCategory
	 * 
	 */
	@RequestMapping("/listUserCategoryUser")
	public ModelAndView listUserCategoryUser(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usercategory", userCategoryDAO.findUserCategoryByPrimaryKey(idKey));
		mav.setViewName("usercategory/user/listUser.jsp");

		return mav;
	}

	/**
	 * Create a new Category entity
	 * 
	 */
	@RequestMapping("/newUserCategoryCategory")
	public ModelAndView newUserCategoryCategory(@RequestParam Integer usercategory_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("usercategory_id", usercategory_id);
		mav.addObject("category", new Category());
		mav.addObject("newFlag", true);
		mav.setViewName("usercategory/category/editCategory.jsp");

		return mav;
	}

	/**
	 * Delete an existing Category entity
	 * 
	 */
	@RequestMapping("/deleteUserCategoryCategory")
	public ModelAndView deleteUserCategoryCategory(@RequestParam Integer usercategory_id, @RequestParam Integer related_category_id) {
		ModelAndView mav = new ModelAndView();

		UserCategory usercategory = userCategoryService.deleteUserCategoryCategory(usercategory_id, related_category_id);

		mav.addObject("usercategory_id", usercategory_id);
		mav.addObject("usercategory", usercategory);
		mav.setViewName("usercategory/viewUserCategory.jsp");

		return mav;
	}

	/**
	 * View an existing User entity
	 * 
	 */
	@RequestMapping("/selectUserCategoryUser")
	public ModelAndView selectUserCategoryUser(@RequestParam Integer usercategory_id, @RequestParam Integer user_id) {
		User user = userDAO.findUserByPrimaryKey(user_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usercategory_id", usercategory_id);
		mav.addObject("user", user);
		mav.setViewName("usercategory/user/viewUser.jsp");

		return mav;
	}

	/**
	 * Select the child User entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUserCategoryUser")
	public ModelAndView confirmDeleteUserCategoryUser(@RequestParam Integer usercategory_id, @RequestParam Integer related_user_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("user", userDAO.findUserByPrimaryKey(related_user_id));
		mav.addObject("usercategory_id", usercategory_id);
		mav.setViewName("usercategory/user/deleteUser.jsp");

		return mav;
	}

	/**
	 * Show all Category entities by UserCategory
	 * 
	 */
	@RequestMapping("/listUserCategoryCategory")
	public ModelAndView listUserCategoryCategory(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usercategory", userCategoryDAO.findUserCategoryByPrimaryKey(idKey));
		mav.setViewName("usercategory/category/listCategory.jsp");

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
	 * Select an existing UserCategory entity
	 * 
	 */
	@RequestMapping("/selectUserCategory")
	public ModelAndView selectUserCategory(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usercategory", userCategoryDAO.findUserCategoryByPrimaryKey(idKey));
		mav.setViewName("usercategory/viewUserCategory.jsp");

		return mav;
	}

	/**
	 * Select the child Category entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUserCategoryCategory")
	public ModelAndView confirmDeleteUserCategoryCategory(@RequestParam Integer usercategory_id, @RequestParam Integer related_category_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("category", categoryDAO.findCategoryByPrimaryKey(related_category_id));
		mav.addObject("usercategory_id", usercategory_id);
		mav.setViewName("usercategory/category/deleteCategory.jsp");

		return mav;
	}
}