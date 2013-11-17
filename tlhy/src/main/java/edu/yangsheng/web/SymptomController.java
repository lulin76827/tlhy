package edu.yangsheng.web;

import edu.yangsheng.dao.CategoryDAO;
import edu.yangsheng.dao.MedicineSymptomDAO;
import edu.yangsheng.dao.SymptomDAO;

import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.MedicineSymptom;
import edu.yangsheng.domain.Symptom;

import edu.yangsheng.service.SymptomService;

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
 * Spring MVC controller that handles CRUD requests for Symptom entities
 * 
 */

@Controller("SymptomController")
public class SymptomController {

	/**
	 * DAO injected by Spring that manages Category entities
	 * 
	 */
	@Autowired
	private CategoryDAO categoryDAO;

	/**
	 * DAO injected by Spring that manages MedicineSymptom entities
	 * 
	 */
	@Autowired
	private MedicineSymptomDAO medicineSymptomDAO;

	/**
	 * DAO injected by Spring that manages Symptom entities
	 * 
	 */
	@Autowired
	private SymptomDAO symptomDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Symptom entities
	 * 
	 */
	@Autowired
	private SymptomService symptomService;

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
	 * Select the child Category entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteSymptomCategory")
	public ModelAndView confirmDeleteSymptomCategory(@RequestParam Integer symptom_id, @RequestParam Integer related_category_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("category", categoryDAO.findCategoryByPrimaryKey(related_category_id));
		mav.addObject("symptom_id", symptom_id);
		mav.setViewName("symptom/category/deleteCategory.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/symptomController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select the Symptom entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteSymptom")
	public ModelAndView confirmDeleteSymptom(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("symptom", symptomDAO.findSymptomByPrimaryKey(idKey));
		mav.setViewName("symptom/deleteSymptom.jsp");

		return mav;
	}

	/**
	 * Show all Category entities by Symptom
	 * 
	 */
	@RequestMapping("/listSymptomCategory")
	public ModelAndView listSymptomCategory(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("symptom", symptomDAO.findSymptomByPrimaryKey(idKey));
		mav.setViewName("symptom/category/listCategory.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Symptom entities
	 * 
	 */
	public String indexSymptom() {
		return "redirect:/indexSymptom";
	}

	/**
	 * Edit an existing MedicineSymptom entity
	 * 
	 */
	@RequestMapping("/editSymptomMedicineSymptoms")
	public ModelAndView editSymptomMedicineSymptoms(@RequestParam Integer symptom_id, @RequestParam Integer medicinesymptoms_id) {
		MedicineSymptom medicinesymptom = medicineSymptomDAO.findMedicineSymptomByPrimaryKey(medicinesymptoms_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("symptom_id", symptom_id);
		mav.addObject("medicinesymptom", medicinesymptom);
		mav.setViewName("symptom/medicinesymptoms/editMedicineSymptoms.jsp");

		return mav;
	}

	/**
	 * Select an existing Symptom entity
	 * 
	 */
	@RequestMapping("/selectSymptom")
	public ModelAndView selectSymptom(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("symptom", symptomDAO.findSymptomByPrimaryKey(idKey));
		mav.setViewName("symptom/viewSymptom.jsp");

		return mav;
	}

	/**
	 * Save an existing Category entity
	 * 
	 */
	@RequestMapping("/saveSymptomCategory")
	public ModelAndView saveSymptomCategory(@RequestParam Integer symptom_id, @ModelAttribute Category category) {
		Symptom parent_symptom = symptomService.saveSymptomCategory(symptom_id, category);

		ModelAndView mav = new ModelAndView();
		mav.addObject("symptom_id", symptom_id);
		mav.addObject("symptom", parent_symptom);
		mav.setViewName("symptom/viewSymptom.jsp");

		return mav;
	}

	/**
	 * View an existing Category entity
	 * 
	 */
	@RequestMapping("/selectSymptomCategory")
	public ModelAndView selectSymptomCategory(@RequestParam Integer symptom_id, @RequestParam Integer category_id) {
		Category category = categoryDAO.findCategoryByPrimaryKey(category_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("symptom_id", symptom_id);
		mav.addObject("category", category);
		mav.setViewName("symptom/category/viewCategory.jsp");

		return mav;
	}

	/**
	 * Delete an existing Category entity
	 * 
	 */
	@RequestMapping("/deleteSymptomCategory")
	public ModelAndView deleteSymptomCategory(@RequestParam Integer symptom_id, @RequestParam Integer related_category_id) {
		ModelAndView mav = new ModelAndView();

		Symptom symptom = symptomService.deleteSymptomCategory(symptom_id, related_category_id);

		mav.addObject("symptom_id", symptom_id);
		mav.addObject("symptom", symptom);
		mav.setViewName("symptom/viewSymptom.jsp");

		return mav;
	}

	/**
	 * Edit an existing Category entity
	 * 
	 */
	@RequestMapping("/editSymptomCategory")
	public ModelAndView editSymptomCategory(@RequestParam Integer symptom_id, @RequestParam Integer category_id) {
		Category category = categoryDAO.findCategoryByPrimaryKey(category_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("symptom_id", symptom_id);
		mav.addObject("category", category);
		mav.setViewName("symptom/category/editCategory.jsp");

		return mav;
	}

	/**
	 * Select the child MedicineSymptom entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteSymptomMedicineSymptoms")
	public ModelAndView confirmDeleteSymptomMedicineSymptoms(@RequestParam Integer symptom_id, @RequestParam Integer related_medicinesymptoms_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("medicinesymptom", medicineSymptomDAO.findMedicineSymptomByPrimaryKey(related_medicinesymptoms_id));
		mav.addObject("symptom_id", symptom_id);
		mav.setViewName("symptom/medicinesymptoms/deleteMedicineSymptoms.jsp");

		return mav;
	}

	/**
	 * View an existing MedicineSymptom entity
	 * 
	 */
	@RequestMapping("/selectSymptomMedicineSymptoms")
	public ModelAndView selectSymptomMedicineSymptoms(@RequestParam Integer symptom_id, @RequestParam Integer medicinesymptoms_id) {
		MedicineSymptom medicinesymptom = medicineSymptomDAO.findMedicineSymptomByPrimaryKey(medicinesymptoms_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("symptom_id", symptom_id);
		mav.addObject("medicinesymptom", medicinesymptom);
		mav.setViewName("symptom/medicinesymptoms/viewMedicineSymptoms.jsp");

		return mav;
	}

	/**
	 * Delete an existing MedicineSymptom entity
	 * 
	 */
	@RequestMapping("/deleteSymptomMedicineSymptoms")
	public ModelAndView deleteSymptomMedicineSymptoms(@RequestParam Integer symptom_id, @RequestParam Integer related_medicinesymptoms_id) {
		ModelAndView mav = new ModelAndView();

		Symptom symptom = symptomService.deleteSymptomMedicineSymptoms(symptom_id, related_medicinesymptoms_id);

		mav.addObject("symptom_id", symptom_id);
		mav.addObject("symptom", symptom);
		mav.setViewName("symptom/viewSymptom.jsp");

		return mav;
	}

	/**
	 * Delete an existing Symptom entity
	 * 
	 */
	@RequestMapping("/deleteSymptom")
	public String deleteSymptom(@RequestParam Integer idKey) {
		Symptom symptom = symptomDAO.findSymptomByPrimaryKey(idKey);
		symptomService.deleteSymptom(symptom);
		return "forward:/indexSymptom";
	}

	/**
	 * Show all Symptom entities
	 * 
	 */
	@RequestMapping("/indexSymptom")
	public ModelAndView listSymptoms() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("symptoms", symptomService.loadSymptoms());

		mav.setViewName("symptom/listSymptoms.jsp");

		return mav;
	}

	/**
	 * Edit an existing Symptom entity
	 * 
	 */
	@RequestMapping("/editSymptom")
	public ModelAndView editSymptom(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("symptom", symptomDAO.findSymptomByPrimaryKey(idKey));
		mav.setViewName("symptom/editSymptom.jsp");

		return mav;
	}

	/**
	 * Create a new Category entity
	 * 
	 */
	@RequestMapping("/newSymptomCategory")
	public ModelAndView newSymptomCategory(@RequestParam Integer symptom_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("symptom_id", symptom_id);
		mav.addObject("category", new Category());
		mav.addObject("newFlag", true);
		mav.setViewName("symptom/category/editCategory.jsp");

		return mav;
	}

	/**
	 * Create a new Symptom entity
	 * 
	 */
	@RequestMapping("/newSymptom")
	public ModelAndView newSymptom() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("symptom", new Symptom());
		mav.addObject("newFlag", true);
		mav.setViewName("symptom/editSymptom.jsp");

		return mav;
	}

	/**
	 * Save an existing MedicineSymptom entity
	 * 
	 */
	@RequestMapping("/saveSymptomMedicineSymptoms")
	public ModelAndView saveSymptomMedicineSymptoms(@RequestParam Integer symptom_id, @ModelAttribute MedicineSymptom medicinesymptoms) {
		Symptom parent_symptom = symptomService.saveSymptomMedicineSymptoms(symptom_id, medicinesymptoms);

		ModelAndView mav = new ModelAndView();
		mav.addObject("symptom_id", symptom_id);
		mav.addObject("symptom", parent_symptom);
		mav.setViewName("symptom/viewSymptom.jsp");

		return mav;
	}

	/**
	 * Save an existing Symptom entity
	 * 
	 */
	@RequestMapping("/saveSymptom")
	public String saveSymptom(@ModelAttribute Symptom symptom) {
		symptomService.saveSymptom(symptom);
		return "forward:/indexSymptom";
	}

	/**
	 * Show all MedicineSymptom entities by Symptom
	 * 
	 */
	@RequestMapping("/listSymptomMedicineSymptoms")
	public ModelAndView listSymptomMedicineSymptoms(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("symptom", symptomDAO.findSymptomByPrimaryKey(idKey));
		mav.setViewName("symptom/medicinesymptoms/listMedicineSymptoms.jsp");

		return mav;
	}

	/**
	 * Create a new MedicineSymptom entity
	 * 
	 */
	@RequestMapping("/newSymptomMedicineSymptoms")
	public ModelAndView newSymptomMedicineSymptoms(@RequestParam Integer symptom_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("symptom_id", symptom_id);
		mav.addObject("medicinesymptom", new MedicineSymptom());
		mav.addObject("newFlag", true);
		mav.setViewName("symptom/medicinesymptoms/editMedicineSymptoms.jsp");

		return mav;
	}
}