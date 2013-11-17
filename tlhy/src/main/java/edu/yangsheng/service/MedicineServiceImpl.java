package edu.yangsheng.service;

import edu.yangsheng.dao.CategoryDAO;
import edu.yangsheng.dao.MedicineDAO;
import edu.yangsheng.dao.MedicineSymptomDAO;

import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.Medicine;
import edu.yangsheng.domain.MedicineSymptom;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Medicine entities
 * 
 */

@Service("MedicineService")
@Transactional
public class MedicineServiceImpl implements MedicineService {

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
	 * Instantiates a new MedicineServiceImpl.
	 *
	 */
	public MedicineServiceImpl() {
	}

	/**
	 * Save an existing Medicine entity
	 * 
	 */
	@Transactional
	public void saveMedicine(Medicine medicine) {
		Medicine existingMedicine = medicineDAO.findMedicineByPrimaryKey(medicine.getId());

		if (existingMedicine != null) {
			if (existingMedicine != medicine) {
				existingMedicine.setId(medicine.getId());
				existingMedicine.setDescrib(medicine.getDescrib());
				existingMedicine.setMedicineField(medicine.getMedicineField());
				existingMedicine.setType(medicine.getType());
			}
			medicine = medicineDAO.store(existingMedicine);
		} else {
			medicine = medicineDAO.store(medicine);
		}
		medicineDAO.flush();
	}

	/**
	 * Delete an existing MedicineSymptom entity
	 * 
	 */
	@Transactional
	public Medicine deleteMedicineMedicineSymptoms(Integer medicine_id, Integer related_medicinesymptoms_id) {
		MedicineSymptom related_medicinesymptoms = medicineSymptomDAO.findMedicineSymptomByPrimaryKey(related_medicinesymptoms_id, -1, -1);

		Medicine medicine = medicineDAO.findMedicineByPrimaryKey(medicine_id, -1, -1);

		related_medicinesymptoms.setMedicine(null);
		medicine.getMedicineSymptoms().remove(related_medicinesymptoms);

		medicineSymptomDAO.remove(related_medicinesymptoms);
		medicineSymptomDAO.flush();

		return medicine;
	}

	/**
	 * Delete an existing Medicine entity
	 * 
	 */
	@Transactional
	public void deleteMedicine(Medicine medicine) {
		medicineDAO.remove(medicine);
		medicineDAO.flush();
	}

	/**
	 * Delete an existing Category entity
	 * 
	 */
	@Transactional
	public Medicine deleteMedicineCategory(Integer medicine_id, Integer related_category_id) {
		Medicine medicine = medicineDAO.findMedicineByPrimaryKey(medicine_id, -1, -1);
		Category related_category = categoryDAO.findCategoryByPrimaryKey(related_category_id, -1, -1);

		medicine.setCategory(null);
		related_category.getMedicines().remove(medicine);
		medicine = medicineDAO.store(medicine);
		medicineDAO.flush();

		related_category = categoryDAO.store(related_category);
		categoryDAO.flush();

		categoryDAO.remove(related_category);
		categoryDAO.flush();

		return medicine;
	}

	/**
	 * Save an existing Category entity
	 * 
	 */
	@Transactional
	public Medicine saveMedicineCategory(Integer id, Category related_category) {
		Medicine medicine = medicineDAO.findMedicineByPrimaryKey(id, -1, -1);
		Category existingcategory = categoryDAO.findCategoryByPrimaryKey(related_category.getId());

		// copy into the existing record to preserve existing relationships
		if (existingcategory != null) {
			existingcategory.setId(related_category.getId());
			existingcategory.setCategoryField(related_category.getCategoryField());
			existingcategory.setDescrib(related_category.getDescrib());
			related_category = existingcategory;
		}

		medicine.setCategory(related_category);
		related_category.getMedicines().add(medicine);
		medicine = medicineDAO.store(medicine);
		medicineDAO.flush();

		related_category = categoryDAO.store(related_category);
		categoryDAO.flush();

		return medicine;
	}

	/**
	 * Load an existing Medicine entity
	 * 
	 */
	@Transactional
	public Set<Medicine> loadMedicines() {
		return medicineDAO.findAllMedicines();
	}

	/**
	 * Save an existing MedicineSymptom entity
	 * 
	 */
	@Transactional
	public Medicine saveMedicineMedicineSymptoms(Integer id, MedicineSymptom related_medicinesymptoms) {
		Medicine medicine = medicineDAO.findMedicineByPrimaryKey(id, -1, -1);
		MedicineSymptom existingmedicineSymptoms = medicineSymptomDAO.findMedicineSymptomByPrimaryKey(related_medicinesymptoms.getId());

		// copy into the existing record to preserve existing relationships
		if (existingmedicineSymptoms != null) {
			existingmedicineSymptoms.setId(related_medicinesymptoms.getId());
			related_medicinesymptoms = existingmedicineSymptoms;
		}

		related_medicinesymptoms.setMedicine(medicine);
		medicine.getMedicineSymptoms().add(related_medicinesymptoms);
		related_medicinesymptoms = medicineSymptomDAO.store(related_medicinesymptoms);
		medicineSymptomDAO.flush();

		medicine = medicineDAO.store(medicine);
		medicineDAO.flush();

		return medicine;
	}

	/**
	 * Return a count of all Medicine entity
	 * 
	 */
	@Transactional
	public Integer countMedicines() {
		return ((Long) medicineDAO.createQuerySingleResult("select count(o) from Medicine o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public Medicine findMedicineByPrimaryKey(Integer id) {
		return medicineDAO.findMedicineByPrimaryKey(id);
	}

	/**
	 * Return all Medicine entity
	 * 
	 */
	@Transactional
	public List<Medicine> findAllMedicines(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Medicine>(medicineDAO.findAllMedicines(startResult, maxRows));
	}
}
