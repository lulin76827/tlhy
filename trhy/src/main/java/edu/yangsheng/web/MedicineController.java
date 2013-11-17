package edu.yangsheng.web;

import edu.yangsheng.dao.CategoryDAO;
import edu.yangsheng.dao.MedicineDAO;
import edu.yangsheng.dao.MedicineSymptomDAO;

import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.Medicine;
import edu.yangsheng.domain.MedicineSymptom;

import edu.yangsheng.service.MedicineService;

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
 * Spring MVC controller that handles CRUD requests for Medicine entities
 * 
 */

@Controller("MedicineController")
public class MedicineController {

	/**
	 * DAO injected by Spring that manages Category entities
	 * 
	 */
	@Autowired
	private CategoryDAO categoryDAO;

	/**
	 * DAO injected by Spring that manages Medicine entities
	 * 
	 */
	@Autowired
	private MedicineDAO medicineDAO;

	/**
	 * DAO injected by Spring that manages MedicineSymptom entities
	 * 
	 */
	@Autowired
	private MedicineSymptomDAO medicineSymptomDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Medicine entities
	 * 
	 */
	@Autowired
	private MedicineService medicineService;

	/**
	 * Edit an existing MedicineSymptom entity
	 * 
	 */
	@RequestMapping("/editMedicineMedicineSymptoms")
	public ModelAndView editMedicineMedicineSymptoms(@RequestParam Integer medicine_id, @RequestParam Integer medicinesymptoms_id) {
		MedicineSymptom medicinesymptom = medicineSymptomDAO.findMedicineSymptomByPrimaryKey(medicinesymptoms_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("medicine_id", medicine_id);
		mav.addObject("medicinesymptom", medicinesymptom);
		mav.setViewName("medicine/medicinesymptoms/editMedicineSymptoms.jsp");

		return mav;
	}

	/**
	 * Create a new Category entity
	 * 
	 */
	@RequestMapping("/newMedicineCategory")
	public ModelAndView newMedicineCategory(@RequestParam Integer medicine_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("medicine_id", medicine_id);
		mav.addObject("category", new Category());
		mav.addObject("newFlag", true);
		mav.setViewName("medicine/category/editCategory.jsp");

		return mav;
	}

	/**
	 * Delete an existing MedicineSymptom entity
	 * 
	 */
	@RequestMapping("/deleteMedicineMedicineSymptoms")
	public ModelAndView deleteMedicineMedicineSymptoms(@RequestParam Integer medicine_id, @RequestParam Integer related_medicinesymptoms_id) {
		ModelAndView mav = new ModelAndView();

		Medicine medicine = medicineService.deleteMedicineMedicineSymptoms(medicine_id, related_medicinesymptoms_id);

		mav.addObject("medicine_id", medicine_id);
		mav.addObject("medicine", medicine);
		mav.setViewName("medicine/viewMedicine.jsp");

		return mav;
	}

	/**
	 * Delete an existing Category entity
	 * 
	 */
	@RequestMapping("/deleteMedicineCategory")
	public ModelAndView deleteMedicineCategory(@RequestParam Integer medicine_id, @RequestParam Integer related_category_id) {
		ModelAndView mav = new ModelAndView();

		Medicine medicine = medicineService.deleteMedicineCategory(medicine_id, related_category_id);

		mav.addObject("medicine_id", medicine_id);
		mav.addObject("medicine", medicine);
		mav.setViewName("medicine/viewMedicine.jsp");

		return mav;
	}

	/**
	 * Select an existing Medicine entity
	 * 
	 */
	@RequestMapping("/selectMedicine")
	public ModelAndView selectMedicine(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("medicine", medicineDAO.findMedicineByPrimaryKey(idKey));
		mav.setViewName("medicine/viewMedicine.jsp");

		return mav;
	}

	/**
	 * Create a new MedicineSymptom entity
	 * 
	 */
	@RequestMapping("/newMedicineMedicineSymptoms")
	public ModelAndView newMedicineMedicineSymptoms(@RequestParam Integer medicine_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("medicine_id", medicine_id);
		mav.addObject("medicinesymptom", new MedicineSymptom());
		mav.addObject("newFlag", true);
		mav.setViewName("medicine/medicinesymptoms/editMedicineSymptoms.jsp");

		return mav;
	}

	/**
	 * View an existing Category entity
	 * 
	 */
	@RequestMapping("/selectMedicineCategory")
	public ModelAndView selectMedicineCategory(@RequestParam Integer medicine_id, @RequestParam Integer category_id) {
		Category category = categoryDAO.findCategoryByPrimaryKey(category_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("medicine_id", medicine_id);
		mav.addObject("category", category);
		mav.setViewName("medicine/category/viewCategory.jsp");

		return mav;
	}

	/**
	 * Show all MedicineSymptom entities by Medicine
	 * 
	 */
	@RequestMapping("/listMedicineMedicineSymptoms")
	public ModelAndView listMedicineMedicineSymptoms(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("medicine", medicineDAO.findMedicineByPrimaryKey(idKey));
		mav.setViewName("medicine/medicinesymptoms/listMedicineSymptoms.jsp");

		return mav;
	}

	/**
	 * Create a new Medicine entity
	 * 
	 */
	@RequestMapping("/newMedicine")
	public ModelAndView newMedicine() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("medicine", new Medicine());
		mav.addObject("newFlag", true);
		mav.addObject("categorys", categoryDAO.findAllCategorys());
		mav.setViewName("medicine/editMedicine.jsp");

		return mav;
	}

	/**
	 * Show all Category entities by Medicine
	 * 
	 */
	@RequestMapping("/listMedicineCategory")
	public ModelAndView listMedicineCategory(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("medicine", medicineDAO.findMedicineByPrimaryKey(idKey));
		mav.setViewName("medicine/category/listCategory.jsp");

		return mav;
	}

	/**
	 * Select the Medicine entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteMedicine")
	public ModelAndView confirmDeleteMedicine(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("medicine", medicineDAO.findMedicineByPrimaryKey(idKey));
		mav.setViewName("medicine/deleteMedicine.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Medicine entities
	 * 
	 */
	public String indexMedicine() {
		return "redirect:/indexMedicine";
	}

	/**
	 * Edit an existing Medicine entity
	 * 
	 */
	@RequestMapping("/editMedicine")
	public ModelAndView editMedicine(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("categorys", categoryDAO.findAllCategorys());
		mav.addObject("medicine", medicineDAO.findMedicineByPrimaryKey(idKey));
		mav.setViewName("medicine/editMedicine.jsp");

		return mav;
	}

	/**
	 * Show all Medicine entities
	 * 
	 */
	@RequestMapping("/indexMedicine")
	public ModelAndView listMedicines() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("medicines", medicineService.loadMedicines());

		mav.setViewName("medicine/listMedicines.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/medicineController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Save an existing Medicine entity
	 * 
	 */
	@RequestMapping("/saveMedicine")
	public String saveMedicine(@ModelAttribute Medicine medicine) {
		medicineService.saveMedicine(medicine);
		return "forward:/indexMedicine";
	}

	/**
	 * Save an existing Category entity
	 * 
	 */
	@RequestMapping("/saveMedicineCategory")
	public ModelAndView saveMedicineCategory(@RequestParam Integer medicine_id, @ModelAttribute Category category) {
		Medicine parent_medicine = medicineService.saveMedicineCategory(medicine_id, category);

		ModelAndView mav = new ModelAndView();
		mav.addObject("medicine_id", medicine_id);
		mav.addObject("medicine", parent_medicine);
		mav.setViewName("medicine/viewMedicine.jsp");

		return mav;
	}

	/**
	 * Delete an existing Medicine entity
	 * 
	 */
	@RequestMapping("/deleteMedicine")
	public String deleteMedicine(@RequestParam Integer idKey) {
		Medicine medicine = medicineDAO.findMedicineByPrimaryKey(idKey);
		medicineService.deleteMedicine(medicine);
		return "forward:/indexMedicine";
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
	 * Save an existing MedicineSymptom entity
	 * 
	 */
	@RequestMapping("/saveMedicineMedicineSymptoms")
	public ModelAndView saveMedicineMedicineSymptoms(@RequestParam Integer medicine_id, @ModelAttribute MedicineSymptom medicinesymptoms) {
		Medicine parent_medicine = medicineService.saveMedicineMedicineSymptoms(medicine_id, medicinesymptoms);

		ModelAndView mav = new ModelAndView();
		mav.addObject("medicine_id", medicine_id);
		mav.addObject("medicine", parent_medicine);
		mav.setViewName("medicine/viewMedicine.jsp");

		return mav;
	}

	/**
	 * View an existing MedicineSymptom entity
	 * 
	 */
	@RequestMapping("/selectMedicineMedicineSymptoms")
	public ModelAndView selectMedicineMedicineSymptoms(@RequestParam Integer medicine_id, @RequestParam Integer medicinesymptoms_id) {
		MedicineSymptom medicinesymptom = medicineSymptomDAO.findMedicineSymptomByPrimaryKey(medicinesymptoms_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("medicine_id", medicine_id);
		mav.addObject("medicinesymptom", medicinesymptom);
		mav.setViewName("medicine/medicinesymptoms/viewMedicineSymptoms.jsp");

		return mav;
	}

	/**
	 * Select the child Category entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteMedicineCategory")
	public ModelAndView confirmDeleteMedicineCategory(@RequestParam Integer medicine_id, @RequestParam Integer related_category_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("category", categoryDAO.findCategoryByPrimaryKey(related_category_id));
		mav.addObject("medicine_id", medicine_id);
		mav.setViewName("medicine/category/deleteCategory.jsp");

		return mav;
	}

	/**
	 * Select the child MedicineSymptom entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteMedicineMedicineSymptoms")
	public ModelAndView confirmDeleteMedicineMedicineSymptoms(@RequestParam Integer medicine_id, @RequestParam Integer related_medicinesymptoms_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("medicinesymptom", medicineSymptomDAO.findMedicineSymptomByPrimaryKey(related_medicinesymptoms_id));
		mav.addObject("medicine_id", medicine_id);
		mav.setViewName("medicine/medicinesymptoms/deleteMedicineSymptoms.jsp");

		return mav;
	}

	/**
	 * Edit an existing Category entity
	 * 
	 */
	@RequestMapping("/editMedicineCategory")
	public ModelAndView editMedicineCategory(@RequestParam Integer medicine_id, @RequestParam Integer category_id) {
		Category category = categoryDAO.findCategoryByPrimaryKey(category_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("medicine_id", medicine_id);
		mav.addObject("category", category);
		mav.setViewName("medicine/category/editCategory.jsp");

		return mav;
	}
}