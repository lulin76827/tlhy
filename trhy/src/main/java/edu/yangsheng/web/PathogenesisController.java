package edu.yangsheng.web;

import edu.yangsheng.dao.CategoryDAO;
import edu.yangsheng.dao.PathogenesisDAO;

import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.Pathogenesis;

import edu.yangsheng.service.PathogenesisService;

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
 * Spring MVC controller that handles CRUD requests for Pathogenesis entities
 * 
 */

@Controller("PathogenesisController")
public class PathogenesisController {

	/**
	 * DAO injected by Spring that manages Category entities
	 * 
	 */
	@Autowired
	private CategoryDAO categoryDAO;

	/**
	 * DAO injected by Spring that manages Pathogenesis entities
	 * 
	 */
	@Autowired
	private PathogenesisDAO pathogenesisDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Pathogenesis entities
	 * 
	 */
	@Autowired
	private PathogenesisService pathogenesisService;

	/**
	 * Show all Pathogenesis entities
	 * 
	 */
	@RequestMapping("/indexPathogenesis")
	public ModelAndView listPathogenesiss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("pathogenesiss", pathogenesisService.loadPathogenesiss());

		mav.setViewName("pathogenesis/listPathogenesiss.jsp");

		return mav;
	}

	/**
	 * View an existing Category entity
	 * 
	 */
	@RequestMapping("/selectPathogenesisCategory")
	public ModelAndView selectPathogenesisCategory(@RequestParam Integer pathogenesis_id, @RequestParam Integer category_id) {
		Category category = categoryDAO.findCategoryByPrimaryKey(category_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("pathogenesis_id", pathogenesis_id);
		mav.addObject("category", category);
		mav.setViewName("pathogenesis/category/viewCategory.jsp");

		return mav;
	}

	/**
	 * Create a new Category entity
	 * 
	 */
	@RequestMapping("/newPathogenesisCategory")
	public ModelAndView newPathogenesisCategory(@RequestParam Integer pathogenesis_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("pathogenesis_id", pathogenesis_id);
		mav.addObject("category", new Category());
		mav.addObject("newFlag", true);
		mav.setViewName("pathogenesis/category/editCategory.jsp");

		return mav;
	}

	/**
	 * Show all Category entities by Pathogenesis
	 * 
	 */
	@RequestMapping("/listPathogenesisCategory")
	public ModelAndView listPathogenesisCategory(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("pathogenesis", pathogenesisDAO.findPathogenesisByPrimaryKey(idKey));
		mav.setViewName("pathogenesis/category/listCategory.jsp");

		return mav;
	}

	/**
	 * Select an existing Pathogenesis entity
	 * 
	 */
	@RequestMapping("/selectPathogenesis")
	public ModelAndView selectPathogenesis(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("pathogenesis", pathogenesisDAO.findPathogenesisByPrimaryKey(idKey));
		mav.setViewName("pathogenesis/viewPathogenesis.jsp");

		return mav;
	}

	/**
	 * Edit an existing Category entity
	 * 
	 */
	@RequestMapping("/editPathogenesisCategory")
	public ModelAndView editPathogenesisCategory(@RequestParam Integer pathogenesis_id, @RequestParam Integer category_id) {
		Category category = categoryDAO.findCategoryByPrimaryKey(category_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("pathogenesis_id", pathogenesis_id);
		mav.addObject("category", category);
		mav.setViewName("pathogenesis/category/editCategory.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Pathogenesis entities
	 * 
	 */
	public String indexPathogenesis() {
		return "redirect:/indexPathogenesis";
	}

	/**
	 * Select the Pathogenesis entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeletePathogenesis")
	public ModelAndView confirmDeletePathogenesis(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("pathogenesis", pathogenesisDAO.findPathogenesisByPrimaryKey(idKey));
		mav.setViewName("pathogenesis/deletePathogenesis.jsp");

		return mav;
	}

	/**
	 * Edit an existing Pathogenesis entity
	 * 
	 */
	@RequestMapping("/editPathogenesis")
	public ModelAndView editPathogenesis(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("pathogenesis", pathogenesisDAO.findPathogenesisByPrimaryKey(idKey));
		mav.setViewName("pathogenesis/editPathogenesis.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/pathogenesisController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing Pathogenesis entity
	 * 
	 */
	@RequestMapping("/deletePathogenesis")
	public String deletePathogenesis(@RequestParam Integer idKey) {
		Pathogenesis pathogenesis = pathogenesisDAO.findPathogenesisByPrimaryKey(idKey);
		pathogenesisService.deletePathogenesis(pathogenesis);
		return "forward:/indexPathogenesis";
	}

	/**
	 * Save an existing Pathogenesis entity
	 * 
	 */
	@RequestMapping("/savePathogenesis")
	public String savePathogenesis(@ModelAttribute Pathogenesis pathogenesis) {
		pathogenesisService.savePathogenesis(pathogenesis);
		return "forward:/indexPathogenesis";
	}

	/**
	 * Select the child Category entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeletePathogenesisCategory")
	public ModelAndView confirmDeletePathogenesisCategory(@RequestParam Integer pathogenesis_id, @RequestParam Integer related_category_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("category", categoryDAO.findCategoryByPrimaryKey(related_category_id));
		mav.addObject("pathogenesis_id", pathogenesis_id);
		mav.setViewName("pathogenesis/category/deleteCategory.jsp");

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
	@RequestMapping("/deletePathogenesisCategory")
	public ModelAndView deletePathogenesisCategory(@RequestParam Integer pathogenesis_id, @RequestParam Integer related_category_id) {
		ModelAndView mav = new ModelAndView();

		Pathogenesis pathogenesis = pathogenesisService.deletePathogenesisCategory(pathogenesis_id, related_category_id);

		mav.addObject("pathogenesis_id", pathogenesis_id);
		mav.addObject("pathogenesis", pathogenesis);
		mav.setViewName("pathogenesis/viewPathogenesis.jsp");

		return mav;
	}

	/**
	 * Save an existing Category entity
	 * 
	 */
	@RequestMapping("/savePathogenesisCategory")
	public ModelAndView savePathogenesisCategory(@RequestParam Integer pathogenesis_id, @ModelAttribute Category category) {
		Pathogenesis parent_pathogenesis = pathogenesisService.savePathogenesisCategory(pathogenesis_id, category);

		ModelAndView mav = new ModelAndView();
		mav.addObject("pathogenesis_id", pathogenesis_id);
		mav.addObject("pathogenesis", parent_pathogenesis);
		mav.setViewName("pathogenesis/viewPathogenesis.jsp");

		return mav;
	}

	/**
	 * Create a new Pathogenesis entity
	 * 
	 */
	@RequestMapping("/newPathogenesis")
	public ModelAndView newPathogenesis() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("pathogenesis", new Pathogenesis());
		mav.addObject("newFlag", true);
		mav.setViewName("pathogenesis/editPathogenesis.jsp");

		return mav;
	}
}