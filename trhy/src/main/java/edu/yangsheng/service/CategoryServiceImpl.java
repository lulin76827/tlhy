package edu.yangsheng.service;

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

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Category entities
 * 
 */

@Service("CategoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService {

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
	 * Instantiates a new CategoryServiceImpl.
	 *
	 */
	public CategoryServiceImpl() {
	}

	/**
	 * Return a count of all Category entity
	 * 
	 */
	@Transactional
	public Integer countCategorys() {
		return ((Long) categoryDAO.createQuerySingleResult("select count(o) from Category o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public Category findCategoryByPrimaryKey(Integer id) {
		return categoryDAO.findCategoryByPrimaryKey(id);
	}

	/**
	 * Save an existing Category entity
	 * 
	 */
	@Transactional
	public void saveCategory(Category category) {
		Category existingCategory = categoryDAO.findCategoryByPrimaryKey(category.getId());

		if (existingCategory != null) {
			if (existingCategory != category) {
				existingCategory.setId(category.getId());
				existingCategory.setCategoryField(category.getCategoryField());
				existingCategory.setDescrib(category.getDescrib());
			}
			category = categoryDAO.store(existingCategory);
		} else {
			category = categoryDAO.store(category);
		}
		categoryDAO.flush();
	}

	/**
	 * Delete an existing Symptom entity
	 * 
	 */
	@Transactional
	public Category deleteCategorySymptoms(Integer category_id, Integer related_symptoms_id) {
		Symptom related_symptoms = symptomDAO.findSymptomByPrimaryKey(related_symptoms_id, -1, -1);

		Category category = categoryDAO.findCategoryByPrimaryKey(category_id, -1, -1);

		related_symptoms.setCategory(null);
		category.getSymptoms().remove(related_symptoms);

		symptomDAO.remove(related_symptoms);
		symptomDAO.flush();

		return category;
	}

	/**
	 * Load an existing Category entity
	 * 
	 */
	@Transactional
	public Set<Category> loadCategorys() {
		return categoryDAO.findAllCategorys();
	}

	/**
	 * Delete an existing Question entity
	 * 
	 */
	@Transactional
	public Category deleteCategoryQuestions(Integer category_id, Integer related_questions_id) {
		Question related_questions = questionDAO.findQuestionByPrimaryKey(related_questions_id, -1, -1);

		Category category = categoryDAO.findCategoryByPrimaryKey(category_id, -1, -1);

		related_questions.setCategory(null);
		category.getQuestions().remove(related_questions);

		questionDAO.remove(related_questions);
		questionDAO.flush();

		return category;
	}

	/**
	 * Save an existing Medicine entity
	 * 
	 */
	@Transactional
	public Category saveCategoryMedicines(Integer id, Medicine related_medicines) {
		Category category = categoryDAO.findCategoryByPrimaryKey(id, -1, -1);
		Medicine existingmedicines = medicineDAO.findMedicineByPrimaryKey(related_medicines.getId());

		// copy into the existing record to preserve existing relationships
		if (existingmedicines != null) {
			existingmedicines.setId(related_medicines.getId());
			existingmedicines.setDescrib(related_medicines.getDescrib());
			existingmedicines.setMedicineField(related_medicines.getMedicineField());
			existingmedicines.setType(related_medicines.getType());
			related_medicines = existingmedicines;
		}

		related_medicines.setCategory(category);
		category.getMedicines().add(related_medicines);
		related_medicines = medicineDAO.store(related_medicines);
		medicineDAO.flush();

		category = categoryDAO.store(category);
		categoryDAO.flush();

		return category;
	}

	/**
	 * Save an existing Pathogenesis entity
	 * 
	 */
	@Transactional
	public Category saveCategoryPathogenesises(Integer id, Pathogenesis related_pathogenesises) {
		Category category = categoryDAO.findCategoryByPrimaryKey(id, -1, -1);
		Pathogenesis existingpathogenesises = pathogenesisDAO.findPathogenesisByPrimaryKey(related_pathogenesises.getId());

		// copy into the existing record to preserve existing relationships
		if (existingpathogenesises != null) {
			existingpathogenesises.setId(related_pathogenesises.getId());
			existingpathogenesises.setDescrib(related_pathogenesises.getDescrib());
			existingpathogenesises.setPathogenesisField(related_pathogenesises.getPathogenesisField());
			existingpathogenesises.setType(related_pathogenesises.getType());
			related_pathogenesises = existingpathogenesises;
		}

		related_pathogenesises.setCategory(category);
		category.getPathogenesises().add(related_pathogenesises);
		related_pathogenesises = pathogenesisDAO.store(related_pathogenesises);
		pathogenesisDAO.flush();

		category = categoryDAO.store(category);
		categoryDAO.flush();

		return category;
	}

	/**
	 * Return all Category entity
	 * 
	 */
	@Transactional
	public List<Category> findAllCategorys(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Category>(categoryDAO.findAllCategorys(startResult, maxRows));
	}

	/**
	 * Delete an existing Medicine entity
	 * 
	 */
	@Transactional
	public Category deleteCategoryMedicines(Integer category_id, Integer related_medicines_id) {
		Medicine related_medicines = medicineDAO.findMedicineByPrimaryKey(related_medicines_id, -1, -1);

		Category category = categoryDAO.findCategoryByPrimaryKey(category_id, -1, -1);

		related_medicines.setCategory(null);
		category.getMedicines().remove(related_medicines);

		medicineDAO.remove(related_medicines);
		medicineDAO.flush();

		return category;
	}

	/**
	 * Save an existing Symptom entity
	 * 
	 */
	@Transactional
	public Category saveCategorySymptoms(Integer id, Symptom related_symptoms) {
		Category category = categoryDAO.findCategoryByPrimaryKey(id, -1, -1);
		Symptom existingsymptoms = symptomDAO.findSymptomByPrimaryKey(related_symptoms.getId());

		// copy into the existing record to preserve existing relationships
		if (existingsymptoms != null) {
			existingsymptoms.setId(related_symptoms.getId());
			existingsymptoms.setDescrib(related_symptoms.getDescrib());
			existingsymptoms.setSymptomField(related_symptoms.getSymptomField());
			existingsymptoms.setNormal(related_symptoms.getNormal());
			existingsymptoms.setType(related_symptoms.getType());
			related_symptoms = existingsymptoms;
		}

		related_symptoms.setCategory(category);
		category.getSymptoms().add(related_symptoms);
		related_symptoms = symptomDAO.store(related_symptoms);
		symptomDAO.flush();

		category = categoryDAO.store(category);
		categoryDAO.flush();

		return category;
	}

	/**
	 * Save an existing UserCategory entity
	 * 
	 */
	@Transactional
	public Category saveCategoryUserCategories(Integer id, UserCategory related_usercategories) {
		Category category = categoryDAO.findCategoryByPrimaryKey(id, -1, -1);
		UserCategory existinguserCategories = userCategoryDAO.findUserCategoryByPrimaryKey(related_usercategories.getId());

		// copy into the existing record to preserve existing relationships
		if (existinguserCategories != null) {
			existinguserCategories.setId(related_usercategories.getId());
			existinguserCategories.setScore(related_usercategories.getScore());
			existinguserCategories.setCreateTime(related_usercategories.getCreateTime());
			related_usercategories = existinguserCategories;
		}

		related_usercategories.setCategory(category);
		category.getUserCategories().add(related_usercategories);
		related_usercategories = userCategoryDAO.store(related_usercategories);
		userCategoryDAO.flush();

		category = categoryDAO.store(category);
		categoryDAO.flush();

		return category;
	}

	/**
	 * Save an existing Question entity
	 * 
	 */
	@Transactional
	public Category saveCategoryQuestions(Integer id, Question related_questions) {
		Category category = categoryDAO.findCategoryByPrimaryKey(id, -1, -1);
		Question existingquestions = questionDAO.findQuestionByPrimaryKey(related_questions.getId());

		// copy into the existing record to preserve existing relationships
		if (existingquestions != null) {
			existingquestions.setId(related_questions.getId());
			existingquestions.setQuestionField(related_questions.getQuestionField());
			related_questions = existingquestions;
		}

		related_questions.setCategory(category);
		category.getQuestions().add(related_questions);
		related_questions = questionDAO.store(related_questions);
		questionDAO.flush();

		category = categoryDAO.store(category);
		categoryDAO.flush();

		return category;
	}

	/**
	 * Delete an existing Category entity
	 * 
	 */
	@Transactional
	public void deleteCategory(Category category) {
		categoryDAO.remove(category);
		categoryDAO.flush();
	}

	/**
	 * Delete an existing UserCategory entity
	 * 
	 */
	@Transactional
	public Category deleteCategoryUserCategories(Integer category_id, Integer related_usercategories_id) {
		UserCategory related_usercategories = userCategoryDAO.findUserCategoryByPrimaryKey(related_usercategories_id, -1, -1);

		Category category = categoryDAO.findCategoryByPrimaryKey(category_id, -1, -1);

		related_usercategories.setCategory(null);
		category.getUserCategories().remove(related_usercategories);

		userCategoryDAO.remove(related_usercategories);
		userCategoryDAO.flush();

		return category;
	}

	/**
	 * Delete an existing Pathogenesis entity
	 * 
	 */
	@Transactional
	public Category deleteCategoryPathogenesises(Integer category_id, Integer related_pathogenesises_id) {
		Pathogenesis related_pathogenesises = pathogenesisDAO.findPathogenesisByPrimaryKey(related_pathogenesises_id, -1, -1);

		Category category = categoryDAO.findCategoryByPrimaryKey(category_id, -1, -1);

		related_pathogenesises.setCategory(null);
		category.getPathogenesises().remove(related_pathogenesises);

		pathogenesisDAO.remove(related_pathogenesises);
		pathogenesisDAO.flush();

		return category;
	}
}
