package edu.yangsheng.service;

import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.MedicineSymptom;
import edu.yangsheng.domain.Symptom;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Symptom entities
 * 
 */
public interface SymptomService {

	/**
	 * Delete an existing Category entity
	 * 
	 */
	public Symptom deleteSymptomCategory(Integer symptom_id, Integer related_category_id);

	/**
	 * Load an existing Symptom entity
	 * 
	 */
	public Set<Symptom> loadSymptoms();

	/**
	 * Save an existing Symptom entity
	 * 
	 */
	public void saveSymptom(Symptom symptom);

	/**
	 */
	public Symptom findSymptomByPrimaryKey(Integer id);

	/**
	 * Return a count of all Symptom entity
	 * 
	 */
	public Integer countSymptoms();

	/**
	 * Delete an existing MedicineSymptom entity
	 * 
	 */
	public Symptom deleteSymptomMedicineSymptoms(Integer symptom_id_1, Integer related_medicinesymptoms_id);

	/**
	 * Return all Symptom entity
	 * 
	 */
	public List<Symptom> findAllSymptoms(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Category entity
	 * 
	 */
	public Symptom saveSymptomCategory(Integer id_1, Category related_category);

	/**
	 * Save an existing MedicineSymptom entity
	 * 
	 */
	public Symptom saveSymptomMedicineSymptoms(Integer id_2, MedicineSymptom related_medicinesymptoms);

	/**
	 * Delete an existing Symptom entity
	 * 
	 */
	public void deleteSymptom(Symptom symptom_1);
}