package edu.yangsheng.web;

import edu.yangsheng.dao.MedicineDAO;
import edu.yangsheng.dao.MedicineSymptomDAO;
import edu.yangsheng.dao.SymptomDAO;

import edu.yangsheng.domain.Medicine;
import edu.yangsheng.domain.MedicineSymptom;
import edu.yangsheng.domain.Symptom;

import edu.yangsheng.service.MedicineSymptomService;

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
 * Spring MVC controller that handles CRUD requests for MedicineSymptom entities
 * 
 */

@Controller("MedicineSymptomController")
public class MedicineSymptomController {

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
	 * DAO injected by Spring that manages Symptom entities
	 * 
	 */
	@Autowired
	private SymptomDAO symptomDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for MedicineSymptom entities
	 * 
	 */
	@Autowired
	private MedicineSymptomService medicineSymptomService;

	/**
	 * Show all MedicineSymptom entities
	 * 
	 */
	@RequestMapping("/indexMedicineSymptom")
	public ModelAndView listMedicineSymptoms() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("medicinesymptoms", medicineSymptomService.loadMedicineSymptoms());

		mav.setViewName("medicinesymptom/listMedicineSymptoms.jsp");

		return mav;
	}

	/**
	 * Show all Symptom entities by MedicineSymptom
	 * 
	 */
	@RequestMapping("/listMedicineSymptomSymptom")
	public ModelAndView listMedicineSymptomSymptom(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("medicinesymptom", medicineSymptomDAO.findMedicineSymptomByPrimaryKey(idKey));
		mav.setViewName("medicinesymptom/symptom/listSymptom.jsp");

		return mav;
	}

	/**
	 * Select the child Symptom entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteMedicineSymptomSymptom")
	public ModelAndView confirmDeleteMedicineSymptomSymptom(@RequestParam Integer medicinesymptom_id, @RequestParam Integer related_symptom_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("symptom", symptomDAO.findSymptomByPrimaryKey(related_symptom_id));
		mav.addObject("medicinesymptom_id", medicinesymptom_id);
		mav.setViewName("medicinesymptom/symptom/deleteSymptom.jsp");

		return mav;
	}

	/**
	 * Create a new Symptom entity
	 * 
	 */
	@RequestMapping("/newMedicineSymptomSymptom")
	public ModelAndView newMedicineSymptomSymptom(@RequestParam Integer medicinesymptom_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("medicinesymptom_id", medicinesymptom_id);
		mav.addObject("symptom", new Symptom());
		mav.addObject("newFlag", true);
		mav.setViewName("medicinesymptom/symptom/editSymptom.jsp");

		return mav;
	}

	/**
	 * Show all Medicine entities by MedicineSymptom
	 * 
	 */
	@RequestMapping("/listMedicineSymptomMedicine")
	public ModelAndView listMedicineSymptomMedicine(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("medicinesymptom", medicineSymptomDAO.findMedicineSymptomByPrimaryKey(idKey));
		mav.setViewName("medicinesymptom/medicine/listMedicine.jsp");

		return mav;
	}

	/**
	 * Edit an existing Medicine entity
	 * 
	 */
	@RequestMapping("/editMedicineSymptomMedicine")
	public ModelAndView editMedicineSymptomMedicine(@RequestParam Integer medicinesymptom_id, @RequestParam Integer medicine_id) {
		Medicine medicine = medicineDAO.findMedicineByPrimaryKey(medicine_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("medicinesymptom_id", medicinesymptom_id);
		mav.addObject("medicine", medicine);
		mav.setViewName("medicinesymptom/medicine/editMedicine.jsp");

		return mav;
	}

	/**
	 * Delete an existing Symptom entity
	 * 
	 */
	@RequestMapping("/deleteMedicineSymptomSymptom")
	public ModelAndView deleteMedicineSymptomSymptom(@RequestParam Integer medicinesymptom_id, @RequestParam Integer related_symptom_id) {
		ModelAndView mav = new ModelAndView();

		MedicineSymptom medicinesymptom = medicineSymptomService.deleteMedicineSymptomSymptom(medicinesymptom_id, related_symptom_id);

		mav.addObject("medicinesymptom_id", medicinesymptom_id);
		mav.addObject("medicinesymptom", medicinesymptom);
		mav.setViewName("medicinesymptom/viewMedicineSymptom.jsp");

		return mav;
	}

	/**
	 * View an existing Symptom entity
	 * 
	 */
	@RequestMapping("/selectMedicineSymptomSymptom")
	public ModelAndView selectMedicineSymptomSymptom(@RequestParam Integer medicinesymptom_id, @RequestParam Integer symptom_id) {
		Symptom symptom = symptomDAO.findSymptomByPrimaryKey(symptom_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("medicinesymptom_id", medicinesymptom_id);
		mav.addObject("symptom", symptom);
		mav.setViewName("medicinesymptom/symptom/viewSymptom.jsp");

		return mav;
	}

	/**
	 * Select an existing MedicineSymptom entity
	 * 
	 */
	@RequestMapping("/selectMedicineSymptom")
	public ModelAndView selectMedicineSymptom(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("medicinesymptom", medicineSymptomDAO.findMedicineSymptomByPrimaryKey(idKey));
		mav.setViewName("medicinesymptom/viewMedicineSymptom.jsp");

		return mav;
	}

	/**
	 * Edit an existing MedicineSymptom entity
	 * 
	 */
	@RequestMapping("/editMedicineSymptom")
	public ModelAndView editMedicineSymptom(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("medicines", medicineDAO.findAllMedicines());
		mav.addObject("symptoms", symptomDAO.findAllSymptoms());
		mav.addObject("medicinesymptom", medicineSymptomDAO.findMedicineSymptomByPrimaryKey(idKey));
		mav.setViewName("medicinesymptom/editMedicineSymptom.jsp");

		return mav;
	}

	/**
	 * Save an existing Symptom entity
	 * 
	 */
	@RequestMapping("/saveMedicineSymptomSymptom")
	public ModelAndView saveMedicineSymptomSymptom(@RequestParam Integer medicinesymptom_id, @ModelAttribute Symptom symptom) {
		MedicineSymptom parent_medicinesymptom = medicineSymptomService.saveMedicineSymptomSymptom(medicinesymptom_id, symptom);

		ModelAndView mav = new ModelAndView();
		mav.addObject("medicinesymptom_id", medicinesymptom_id);
		mav.addObject("medicinesymptom", parent_medicinesymptom);
		mav.setViewName("medicinesymptom/viewMedicineSymptom.jsp");

		return mav;
	}

	/**
	 * Select the child Medicine entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteMedicineSymptomMedicine")
	public ModelAndView confirmDeleteMedicineSymptomMedicine(@RequestParam Integer medicinesymptom_id, @RequestParam Integer related_medicine_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("medicine", medicineDAO.findMedicineByPrimaryKey(related_medicine_id));
		mav.addObject("medicinesymptom_id", medicinesymptom_id);
		mav.setViewName("medicinesymptom/medicine/deleteMedicine.jsp");

		return mav;
	}

	/**
	 * Select the MedicineSymptom entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteMedicineSymptom")
	public ModelAndView confirmDeleteMedicineSymptom(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("medicinesymptom", medicineSymptomDAO.findMedicineSymptomByPrimaryKey(idKey));
		mav.setViewName("medicinesymptom/deleteMedicineSymptom.jsp");

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
	 * Delete an existing Medicine entity
	 * 
	 */
	@RequestMapping("/deleteMedicineSymptomMedicine")
	public ModelAndView deleteMedicineSymptomMedicine(@RequestParam Integer medicinesymptom_id, @RequestParam Integer related_medicine_id) {
		ModelAndView mav = new ModelAndView();

		MedicineSymptom medicinesymptom = medicineSymptomService.deleteMedicineSymptomMedicine(medicinesymptom_id, related_medicine_id);

		mav.addObject("medicinesymptom_id", medicinesymptom_id);
		mav.addObject("medicinesymptom", medicinesymptom);
		mav.setViewName("medicinesymptom/viewMedicineSymptom.jsp");

		return mav;
	}

	/**
	 * View an existing Medicine entity
	 * 
	 */
	@RequestMapping("/selectMedicineSymptomMedicine")
	public ModelAndView selectMedicineSymptomMedicine(@RequestParam Integer medicinesymptom_id, @RequestParam Integer medicine_id) {
		Medicine medicine = medicineDAO.findMedicineByPrimaryKey(medicine_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("medicinesymptom_id", medicinesymptom_id);
		mav.addObject("medicine", medicine);
		mav.setViewName("medicinesymptom/medicine/viewMedicine.jsp");

		return mav;
	}

	/**
	 * Entry point to show all MedicineSymptom entities
	 * 
	 */
	public String indexMedicineSymptom() {
		return "redirect:/indexMedicineSymptom";
	}

	/**
	 * Create a new Medicine entity
	 * 
	 */
	@RequestMapping("/newMedicineSymptomMedicine")
	public ModelAndView newMedicineSymptomMedicine(@RequestParam Integer medicinesymptom_id) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("medicinesymptom_id", medicinesymptom_id);
		mav.addObject("medicine", new Medicine());
		mav.addObject("newFlag", true);
		mav.setViewName("medicinesymptom/medicine/editMedicine.jsp");

		return mav;
	}

	/**
	 * Save an existing MedicineSymptom entity
	 * 
	 */
	@RequestMapping("/saveMedicineSymptom")
	public String saveMedicineSymptom(@ModelAttribute MedicineSymptom medicinesymptom) {
		medicineSymptomService.saveMedicineSymptom(medicinesymptom);
		return "forward:/indexMedicineSymptom";
	}

	/**
	 * Edit an existing Symptom entity
	 * 
	 */
	@RequestMapping("/editMedicineSymptomSymptom")
	public ModelAndView editMedicineSymptomSymptom(@RequestParam Integer medicinesymptom_id, @RequestParam Integer symptom_id) {
		Symptom symptom = symptomDAO.findSymptomByPrimaryKey(symptom_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("medicinesymptom_id", medicinesymptom_id);
		mav.addObject("symptom", symptom);
		mav.setViewName("medicinesymptom/symptom/editSymptom.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/medicinesymptomController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing MedicineSymptom entity
	 * 
	 */
	@RequestMapping("/deleteMedicineSymptom")
	public String deleteMedicineSymptom(@RequestParam Integer idKey) {
		MedicineSymptom medicinesymptom = medicineSymptomDAO.findMedicineSymptomByPrimaryKey(idKey);
		medicineSymptomService.deleteMedicineSymptom(medicinesymptom);
		return "forward:/indexMedicineSymptom";
	}

	/**
	 * Create a new MedicineSymptom entity
	 * 
	 */
	@RequestMapping("/newMedicineSymptom")
	public ModelAndView newMedicineSymptom() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("medicines", medicineDAO.findAllMedicines());
		mav.addObject("symptoms", symptomDAO.findAllSymptoms());
		mav.addObject("medicinesymptom", new MedicineSymptom());
		mav.addObject("newFlag", true);
		mav.setViewName("medicinesymptom/editMedicineSymptom.jsp");

		return mav;
	}

	/**
	 * Save an existing Medicine entity
	 * 
	 */
	@RequestMapping("/saveMedicineSymptomMedicine")
	public ModelAndView saveMedicineSymptomMedicine(@RequestParam Integer medicinesymptom_id, @ModelAttribute Medicine medicine) {
		MedicineSymptom parent_medicinesymptom = medicineSymptomService.saveMedicineSymptomMedicine(medicinesymptom_id, medicine);

		ModelAndView mav = new ModelAndView();
		mav.addObject("medicinesymptom_id", medicinesymptom_id);
		mav.addObject("medicinesymptom", parent_medicinesymptom);
		mav.setViewName("medicinesymptom/viewMedicineSymptom.jsp");

		return mav;
	}
}