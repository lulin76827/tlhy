package edu.yangsheng.web;

import edu.yangsheng.dao.CategoryDAO;
import edu.yangsheng.dao.MedicineDAO;
import edu.yangsheng.dao.PathogenesisDAO;
import edu.yangsheng.dao.QuestionDAO;
import edu.yangsheng.dao.SymptomDAO;
import edu.yangsheng.dao.UserCategoryDAO;

import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.Medicine;
import edu.yangsheng.domain.Pathogenesis;
import edu.yangsheng.domain.Question;
import edu.yangsheng.domain.Symptom;
import edu.yangsheng.domain.UserCategory;

import edu.yangsheng.service.CategoryService;

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
 * Spring MVC controller that handles CRUD requests for Category entities
 * 
 */

@Controller("CategoryController")
public class CategoryController {

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
	 * DAO injected by Spring that manages Pathogenesis entities
	 * 
	 */
	@Autowired
	private PathogenesisDAO pathogenesisDAO;

	/**
	 * DAO injected by Spring that manages Question entities
	 * 
	 */
	@Autowired
	private QuestionDAO questionDAO;

	/**
	 * DAO injected by Spring that manages Symptom entities
	 * 
	 */
	@Autowired
	private SymptomDAO symptomDAO;

	/**
	 * DAO injected by Spring that manages UserCategory entities
	 * 
	 */
	@Autowired
	private UserCategoryDAO userCategoryDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Category entities
	 * 
	 */
	@Autowired
	private CategoryService categoryService;

	/**
	 * Entry point to show all Category entities
	 * 
	 */
	public String indexCategory() {
		return "redirect:/indexCategory";
	}

	/**
	 * Edit an existing Medicine entity
	 * 
	 */
	@RequestMapping("/editCategoryMedicines")
	public ModelAndView editCategoryMedicines(@RequestParam Integer category_id, @RequestParam Integer medicines_id) {
		Medicine medicine = medicineDAO.findMedicineByPrimaryKey(medicines_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("medicine", medicine);
		mav.setViewName("category/medicines/editMedicines.jsp");

		return mav;
	}

	/**
	 * Select the child Medicine entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCategoryMedicines")
	public ModelAndView confirmDeleteCategoryMedicines(@RequestParam Integer category_id, @RequestParam Integer related_medicines_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("medicine", medicineDAO.findMedicineByPrimaryKey(related_medicines_id));
		mav.addObject("category_id", category_id);
		mav.setViewName("category/medicines/deleteMedicines.jsp");

		return mav;
	}

	/**
	 * Show all Category entities
	 * 
	 */
	@RequestMapping("/indexCategory")
	public ModelAndView listCategorys() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("categorys", categoryService.loadCategorys());

		mav.setViewName("category/listCategorys.jsp");

		return mav;
	}

	/**
	 * Select an existing Category entity
	 * 
	 */
	@RequestMapping("/selectCategory")
	public ModelAndView selectCategory(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("category", categoryDAO.findCategoryByPrimaryKey(idKey));
		mav.setViewName("category/viewCategory.jsp");

		return mav;
	}

	/**
	 * Edit an existing Question entity
	 * 
	 */
	@RequestMapping("/editCategoryQuestions")
	public ModelAndView editCategoryQuestions(@RequestParam Integer category_id, @RequestParam Integer questions_id) {
		Question question = questionDAO.findQuestionByPrimaryKey(questions_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("question", question);
		mav.setViewName("category/questions/editQuestions.jsp");

		return mav;
	}

	/**
	 * Edit an existing Pathogenesis entity
	 * 
	 */
	@RequestMapping("/editCategoryPathogenesises")
	public ModelAndView editCategoryPathogenesises(@RequestParam Integer category_id, @RequestParam Integer pathogenesises_id) {
		Pathogenesis pathogenesis = pathogenesisDAO.findPathogenesisByPrimaryKey(pathogenesises_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("pathogenesis", pathogenesis);
		mav.setViewName("category/pathogenesises/editPathogenesises.jsp");

		return mav;
	}

	/**
	 * Create a new Pathogenesis entity
	 * 
	 */
	@RequestMapping("/newCategoryPathogenesises")
	public ModelAndView newCategoryPathogenesises(@RequestParam Integer category_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("pathogenesis", new Pathogenesis());
		mav.addObject("newFlag", true);
		mav.setViewName("category/pathogenesises/editPathogenesises.jsp");

		return mav;
	}

	/**
	 * Create a new Category entity
	 * 
	 */
	@RequestMapping("/newCategory")
	public ModelAndView newCategory() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("category", new Category());
		mav.addObject("newFlag", true);
		mav.setViewName("category/editCategory.jsp");

		return mav;
	}

	/**
	 * Delete an existing Symptom entity
	 * 
	 */
	@RequestMapping("/deleteCategorySymptoms")
	public ModelAndView deleteCategorySymptoms(@RequestParam Integer category_id, @RequestParam Integer related_symptoms_id) {
		ModelAndView mav = new ModelAndView();

		Category category = categoryService.deleteCategorySymptoms(category_id, related_symptoms_id);

		mav.addObject("category_id", category_id);
		mav.addObject("category", category);
		mav.setViewName("category/viewCategory.jsp");

		return mav;
	}

	/**
	 * Show all Symptom entities by Category
	 * 
	 */
	@RequestMapping("/listCategorySymptoms")
	public ModelAndView listCategorySymptoms(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("category", categoryDAO.findCategoryByPrimaryKey(idKey));
		mav.setViewName("category/symptoms/listSymptoms.jsp");

		return mav;
	}

	/**
	 * Create a new Question entity
	 * 
	 */
	@RequestMapping("/newCategoryQuestions")
	public ModelAndView newCategoryQuestions(@RequestParam Integer category_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("question", new Question());
		mav.addObject("newFlag", true);
		mav.setViewName("category/questions/editQuestions.jsp");

		return mav;
	}

	/**
	 * Create a new UserCategory entity
	 * 
	 */
	@RequestMapping("/newCategoryUserCategories")
	public ModelAndView newCategoryUserCategories(@RequestParam Integer category_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("usercategory", new UserCategory());
		mav.addObject("newFlag", true);
		mav.setViewName("category/usercategories/editUserCategories.jsp");

		return mav;
	}

	/**
	 * Edit an existing Category entity
	 * 
	 */
	@RequestMapping("/editCategory")
	public ModelAndView editCategory(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("category", categoryDAO.findCategoryByPrimaryKey(idKey));
		mav.setViewName("category/editCategory.jsp");

		return mav;
	}

	/**
	 * Delete an existing Pathogenesis entity
	 * 
	 */
	@RequestMapping("/deleteCategoryPathogenesises")
	public ModelAndView deleteCategoryPathogenesises(@RequestParam Integer category_id, @RequestParam Integer related_pathogenesises_id) {
		ModelAndView mav = new ModelAndView();

		Category category = categoryService.deleteCategoryPathogenesises(category_id, related_pathogenesises_id);

		mav.addObject("category_id", category_id);
		mav.addObject("category", category);
		mav.setViewName("category/viewCategory.jsp");

		return mav;
	}

	/**
	 * Show all Medicine entities by Category
	 * 
	 */
	@RequestMapping("/listCategoryMedicines")
	public ModelAndView listCategoryMedicines(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("category", categoryDAO.findCategoryByPrimaryKey(idKey));
		mav.setViewName("category/medicines/listMedicines.jsp");

		return mav;
	}

	/**
	 * Save an existing Pathogenesis entity
	 * 
	 */
	@RequestMapping("/saveCategoryPathogenesises")
	public ModelAndView saveCategoryPathogenesises(@RequestParam Integer category_id, @ModelAttribute Pathogenesis pathogenesises) {
		Category parent_category = categoryService.saveCategoryPathogenesises(category_id, pathogenesises);

		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("category", parent_category);
		mav.setViewName("category/viewCategory.jsp");

		return mav;
	}

	/**
	 * Show all Question entities by Category
	 * 
	 */
	@RequestMapping("/listCategoryQuestions")
	public ModelAndView listCategoryQuestions(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("category", categoryDAO.findCategoryByPrimaryKey(idKey));
		mav.setViewName("category/questions/listQuestions.jsp");

		return mav;
	}

	/**
	 * Create a new Medicine entity
	 * 
	 */
	@RequestMapping("/newCategoryMedicines")
	public ModelAndView newCategoryMedicines(@RequestParam Integer category_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("medicine", new Medicine());
		mav.addObject("newFlag", true);
		mav.setViewName("category/medicines/editMedicines.jsp");

		return mav;
	}

	/**
	 * Save an existing Category entity
	 * 
	 */
	@RequestMapping("/saveCategory")
	public String saveCategory(@ModelAttribute Category category) {
		categoryService.saveCategory(category);
		return "forward:/indexCategory";
	}

	/**
	 * View an existing Pathogenesis entity
	 * 
	 */
	@RequestMapping("/selectCategoryPathogenesises")
	public ModelAndView selectCategoryPathogenesises(@RequestParam Integer category_id, @RequestParam Integer pathogenesises_id) {
		Pathogenesis pathogenesis = pathogenesisDAO.findPathogenesisByPrimaryKey(pathogenesises_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("pathogenesis", pathogenesis);
		mav.setViewName("category/pathogenesises/viewPathogenesises.jsp");

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
	 * Select the child Symptom entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCategorySymptoms")
	public ModelAndView confirmDeleteCategorySymptoms(@RequestParam Integer category_id, @RequestParam Integer related_symptoms_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("symptom", symptomDAO.findSymptomByPrimaryKey(related_symptoms_id));
		mav.addObject("category_id", category_id);
		mav.setViewName("category/symptoms/deleteSymptoms.jsp");

		return mav;
	}

	/**
	 * Show all UserCategory entities by Category
	 * 
	 */
	@RequestMapping("/listCategoryUserCategories")
	public ModelAndView listCategoryUserCategories(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("category", categoryDAO.findCategoryByPrimaryKey(idKey));
		mav.setViewName("category/usercategories/listUserCategories.jsp");

		return mav;
	}

	/**
	 * Select the child Pathogenesis entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCategoryPathogenesises")
	public ModelAndView confirmDeleteCategoryPathogenesises(@RequestParam Integer category_id, @RequestParam Integer related_pathogenesises_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("pathogenesis", pathogenesisDAO.findPathogenesisByPrimaryKey(related_pathogenesises_id));
		mav.addObject("category_id", category_id);
		mav.setViewName("category/pathogenesises/deletePathogenesises.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/categoryController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * View an existing Question entity
	 * 
	 */
	@RequestMapping("/selectCategoryQuestions")
	public ModelAndView selectCategoryQuestions(@RequestParam Integer category_id, @RequestParam Integer questions_id) {
		Question question = questionDAO.findQuestionByPrimaryKey(questions_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("question", question);
		mav.setViewName("category/questions/viewQuestions.jsp");

		return mav;
	}

	/**
	 * Select the Category entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCategory")
	public ModelAndView confirmDeleteCategory(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("category", categoryDAO.findCategoryByPrimaryKey(idKey));
		mav.setViewName("category/deleteCategory.jsp");

		return mav;
	}

	/**
	 * Save an existing Medicine entity
	 * 
	 */
	@RequestMapping("/saveCategoryMedicines")
	public ModelAndView saveCategoryMedicines(@RequestParam Integer category_id, @ModelAttribute Medicine medicines) {
		Category parent_category = categoryService.saveCategoryMedicines(category_id, medicines);

		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("category", parent_category);
		mav.setViewName("category/viewCategory.jsp");

		return mav;
	}

	/**
	 * Save an existing Symptom entity
	 * 
	 */
	@RequestMapping("/saveCategorySymptoms")
	public ModelAndView saveCategorySymptoms(@RequestParam Integer category_id, @ModelAttribute Symptom symptoms) {
		Category parent_category = categoryService.saveCategorySymptoms(category_id, symptoms);

		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("category", parent_category);
		mav.setViewName("category/viewCategory.jsp");

		return mav;
	}

	/**
	 * Delete an existing Medicine entity
	 * 
	 */
	@RequestMapping("/deleteCategoryMedicines")
	public ModelAndView deleteCategoryMedicines(@RequestParam Integer category_id, @RequestParam Integer related_medicines_id) {
		ModelAndView mav = new ModelAndView();

		Category category = categoryService.deleteCategoryMedicines(category_id, related_medicines_id);

		mav.addObject("category_id", category_id);
		mav.addObject("category", category);
		mav.setViewName("category/viewCategory.jsp");

		return mav;
	}

	/**
	 * Edit an existing UserCategory entity
	 * 
	 */
	@RequestMapping("/editCategoryUserCategories")
	public ModelAndView editCategoryUserCategories(@RequestParam Integer category_id, @RequestParam Integer usercategories_id) {
		UserCategory usercategory = userCategoryDAO.findUserCategoryByPrimaryKey(usercategories_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("usercategory", usercategory);
		mav.setViewName("category/usercategories/editUserCategories.jsp");

		return mav;
	}

	/**
	 * Save an existing Question entity
	 * 
	 */
	@RequestMapping("/saveCategoryQuestions")
	public ModelAndView saveCategoryQuestions(@RequestParam Integer category_id, @ModelAttribute Question questions) {
		Category parent_category = categoryService.saveCategoryQuestions(category_id, questions);

		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("category", parent_category);
		mav.setViewName("category/viewCategory.jsp");

		return mav;
	}

	/**
	 * View an existing Symptom entity
	 * 
	 */
	@RequestMapping("/selectCategorySymptoms")
	public ModelAndView selectCategorySymptoms(@RequestParam Integer category_id, @RequestParam Integer symptoms_id) {
		Symptom symptom = symptomDAO.findSymptomByPrimaryKey(symptoms_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("symptom", symptom);
		mav.setViewName("category/symptoms/viewSymptoms.jsp");

		return mav;
	}

	/**
	 * Delete an existing Category entity
	 * 
	 */
	@RequestMapping("/deleteCategory")
	public String deleteCategory(@RequestParam Integer idKey) {
		Category category = categoryDAO.findCategoryByPrimaryKey(idKey);
		categoryService.deleteCategory(category);
		return "forward:/indexCategory";
	}

	/**
	 * View an existing Medicine entity
	 * 
	 */
	@RequestMapping("/selectCategoryMedicines")
	public ModelAndView selectCategoryMedicines(@RequestParam Integer category_id, @RequestParam Integer medicines_id) {
		Medicine medicine = medicineDAO.findMedicineByPrimaryKey(medicines_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("medicine", medicine);
		mav.setViewName("category/medicines/viewMedicines.jsp");

		return mav;
	}

	/**
	 * Select the child Question entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCategoryQuestions")
	public ModelAndView confirmDeleteCategoryQuestions(@RequestParam Integer category_id, @RequestParam Integer related_questions_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("question", questionDAO.findQuestionByPrimaryKey(related_questions_id));
		mav.addObject("category_id", category_id);
		mav.setViewName("category/questions/deleteQuestions.jsp");

		return mav;
	}

	/**
	 * View an existing UserCategory entity
	 * 
	 */
	@RequestMapping("/selectCategoryUserCategories")
	public ModelAndView selectCategoryUserCategories(@RequestParam Integer category_id, @RequestParam Integer usercategories_id) {
		UserCategory usercategory = userCategoryDAO.findUserCategoryByPrimaryKey(usercategories_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("usercategory", usercategory);
		mav.setViewName("category/usercategories/viewUserCategories.jsp");

		return mav;
	}

	/**
	 * Delete an existing Question entity
	 * 
	 */
	@RequestMapping("/deleteCategoryQuestions")
	public ModelAndView deleteCategoryQuestions(@RequestParam Integer category_id, @RequestParam Integer related_questions_id) {
		ModelAndView mav = new ModelAndView();

		Category category = categoryService.deleteCategoryQuestions(category_id, related_questions_id);

		mav.addObject("category_id", category_id);
		mav.addObject("category", category);
		mav.setViewName("category/viewCategory.jsp");

		return mav;
	}

	/**
	 * Edit an existing Symptom entity
	 * 
	 */
	@RequestMapping("/editCategorySymptoms")
	public ModelAndView editCategorySymptoms(@RequestParam Integer category_id, @RequestParam Integer symptoms_id) {
		Symptom symptom = symptomDAO.findSymptomByPrimaryKey(symptoms_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("symptom", symptom);
		mav.setViewName("category/symptoms/editSymptoms.jsp");

		return mav;
	}

	/**
	 * Select the child UserCategory entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCategoryUserCategories")
	public ModelAndView confirmDeleteCategoryUserCategories(@RequestParam Integer category_id, @RequestParam Integer related_usercategories_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usercategory", userCategoryDAO.findUserCategoryByPrimaryKey(related_usercategories_id));
		mav.addObject("category_id", category_id);
		mav.setViewName("category/usercategories/deleteUserCategories.jsp");

		return mav;
	}

	/**
	 * Delete an existing UserCategory entity
	 * 
	 */
	@RequestMapping("/deleteCategoryUserCategories")
	public ModelAndView deleteCategoryUserCategories(@RequestParam Integer category_id, @RequestParam Integer related_usercategories_id) {
		ModelAndView mav = new ModelAndView();

		Category category = categoryService.deleteCategoryUserCategories(category_id, related_usercategories_id);

		mav.addObject("category_id", category_id);
		mav.addObject("category", category);
		mav.setViewName("category/viewCategory.jsp");

		return mav;
	}

	/**
	 * Create a new Symptom entity
	 * 
	 */
	@RequestMapping("/newCategorySymptoms")
	public ModelAndView newCategorySymptoms(@RequestParam Integer category_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("symptom", new Symptom());
		mav.addObject("newFlag", true);
		mav.setViewName("category/symptoms/editSymptoms.jsp");

		return mav;
	}

	/**
	 * Save an existing UserCategory entity
	 * 
	 */
	@RequestMapping("/saveCategoryUserCategories")
	public ModelAndView saveCategoryUserCategories(@RequestParam Integer category_id, @ModelAttribute UserCategory usercategories) {
		Category parent_category = categoryService.saveCategoryUserCategories(category_id, usercategories);

		ModelAndView mav = new ModelAndView();
		mav.addObject("category_id", category_id);
		mav.addObject("category", parent_category);
		mav.setViewName("category/viewCategory.jsp");

		return mav;
	}

	/**
	 * Show all Pathogenesis entities by Category
	 * 
	 */
	@RequestMapping("/listCategoryPathogenesises")
	public ModelAndView listCategoryPathogenesises(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("category", categoryDAO.findCategoryByPrimaryKey(idKey));
		mav.setViewName("category/pathogenesises/listPathogenesises.jsp");

		return mav;
	}
}