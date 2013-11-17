package edu.yangsheng.service;

import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.Medicine;
import edu.yangsheng.domain.Pathogenesis;
import edu.yangsheng.domain.Question;
import edu.yangsheng.domain.Symptom;
import edu.yangsheng.domain.UserCategory;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Category entities
 * 
 */
public interface CategoryService {

	/**
	 * Return a count of all Category entity
	 * 
	 */
	public Integer countCategorys();

	/**
	 */
	public Category findCategoryByPrimaryKey(Integer id);

	/**
	 * Save an existing Category entity
	 * 
	 */
	public void saveCategory(Category category);

	/**
	 * Delete an existing Symptom entity
	 * 
	 */
	public Category deleteCategorySymptoms(Integer category_id, Integer related_symptoms_id);

	/**
	 * Load an existing Category entity
	 * 
	 */
	public Set<Category> loadCategorys();

	/**
	 * Delete an existing Question entity
	 * 
	 */
	public Category deleteCategoryQuestions(Integer category_id_1, Integer related_questions_id);

	/**
	 * Save an existing Medicine entity
	 * 
	 */
	public Category saveCategoryMedicines(Integer id_1, Medicine related_medicines);

	/**
	 * Save an existing Pathogenesis entity
	 * 
	 */
	public Category saveCategoryPathogenesises(Integer id_2, Pathogenesis related_pathogenesises);

	/**
	 * Return all Category entity
	 * 
	 */
	public List<Category> findAllCategorys(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Medicine entity
	 * 
	 */
	public Category deleteCategoryMedicines(Integer category_id_2, Integer related_medicines_id);

	/**
	 * Save an existing Symptom entity
	 * 
	 */
	public Category saveCategorySymptoms(Integer id_3, Symptom related_symptoms);

	/**
	 * Save an existing UserCategory entity
	 * 
	 */
	public Category saveCategoryUserCategories(Integer id_4, UserCategory related_usercategories);

	/**
	 * Save an existing Question entity
	 * 
	 */
	public Category saveCategoryQuestions(Integer id_5, Question related_questions);

	/**
	 * Delete an existing Category entity
	 * 
	 */
	public void deleteCategory(Category category_1);

	/**
	 * Delete an existing UserCategory entity
	 * 
	 */
	public Category deleteCategoryUserCategories(Integer category_id_3, Integer related_usercategories_id);

	/**
	 * Delete an existing Pathogenesis entity
	 * 
	 */
	public Category deleteCategoryPathogenesises(Integer category_id_4, Integer related_pathogenesises_id);
}