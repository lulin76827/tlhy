package edu.yangsheng.service;

import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.Medicine;
import edu.yangsheng.domain.MedicineSymptom;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Medicine entities
 * 
 */
public interface MedicineService {

	/**
	 * Save an existing Medicine entity
	 * 
	 */
	public void saveMedicine(Medicine medicine);

	/**
	 * Delete an existing MedicineSymptom entity
	 * 
	 */
	public Medicine deleteMedicineMedicineSymptoms(Integer medicine_id, Integer related_medicinesymptoms_id);

	/**
	 * Delete an existing Medicine entity
	 * 
	 */
	public void deleteMedicine(Medicine medicine_1);

	/**
	 * Delete an existing Category entity
	 * 
	 */
	public Medicine deleteMedicineCategory(Integer medicine_id_1, Integer related_category_id);

	/**
	 * Save an existing Category entity
	 * 
	 */
	public Medicine saveMedicineCategory(Integer id, Category related_category);

	/**
	 * Load an existing Medicine entity
	 * 
	 */
	public Set<Medicine> loadMedicines();

	/**
	 * Save an existing MedicineSymptom entity
	 * 
	 */
	public Medicine saveMedicineMedicineSymptoms(Integer id_1, MedicineSymptom related_medicinesymptoms);

	/**
	 * Return a count of all Medicine entity
	 * 
	 */
	public Integer countMedicines();

	/**
	 */
	public Medicine findMedicineByPrimaryKey(Integer id_2);

	/**
	 * Return all Medicine entity
	 * 
	 */
	public List<Medicine> findAllMedicines(Integer startResult, Integer maxRows);
}