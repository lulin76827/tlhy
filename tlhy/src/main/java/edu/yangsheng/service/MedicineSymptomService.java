package edu.yangsheng.service;

import edu.yangsheng.domain.Medicine;
import edu.yangsheng.domain.MedicineSymptom;
import edu.yangsheng.domain.Symptom;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for MedicineSymptom entities
 * 
 */
public interface MedicineSymptomService {

	/**
	 * Save an existing Symptom entity
	 * 
	 */
	public MedicineSymptom saveMedicineSymptomSymptom(Integer id, Symptom related_symptom);

	/**
	 * Load an existing MedicineSymptom entity
	 * 
	 */
	public Set<MedicineSymptom> loadMedicineSymptoms();

	/**
	 * Return all MedicineSymptom entity
	 * 
	 */
	public List<MedicineSymptom> findAllMedicineSymptoms(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Medicine entity
	 * 
	 */
	public MedicineSymptom saveMedicineSymptomMedicine(Integer id_1, Medicine related_medicine);

	/**
	 * Delete an existing MedicineSymptom entity
	 * 
	 */
	public void deleteMedicineSymptom(MedicineSymptom medicinesymptom);

	/**
	 * Return a count of all MedicineSymptom entity
	 * 
	 */
	public Integer countMedicineSymptoms();

	/**
	 */
	public MedicineSymptom findMedicineSymptomByPrimaryKey(Integer id_2);

	/**
	 * Save an existing MedicineSymptom entity
	 * 
	 */
	public void saveMedicineSymptom(MedicineSymptom medicinesymptom_1);

	/**
	 * Delete an existing Medicine entity
	 * 
	 */
	public MedicineSymptom deleteMedicineSymptomMedicine(Integer medicinesymptom_id, Integer related_medicine_id);

	/**
	 * Delete an existing Symptom entity
	 * 
	 */
	public MedicineSymptom deleteMedicineSymptomSymptom(Integer medicinesymptom_id_1, Integer related_symptom_id);
}