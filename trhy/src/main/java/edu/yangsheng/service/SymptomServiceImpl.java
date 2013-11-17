package edu.yangsheng.service;

import edu.yangsheng.dao.CategoryDAO;
import edu.yangsheng.dao.MedicineSymptomDAO;
import edu.yangsheng.dao.SymptomDAO;

import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.MedicineSymptom;
import edu.yangsheng.domain.Symptom;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Symptom entities
 * 
 */

@Service("SymptomService")
@Transactional
public class SymptomServiceImpl implements SymptomService {

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
	 * Instantiates a new SymptomServiceImpl.
	 *
	 */
	public SymptomServiceImpl() {
	}

	/**
	 * Delete an existing Category entity
	 * 
	 */
	@Transactional
	public Symptom deleteSymptomCategory(Integer symptom_id, Integer related_category_id) {
		Symptom symptom = symptomDAO.findSymptomByPrimaryKey(symptom_id, -1, -1);
		Category related_category = categoryDAO.findCategoryByPrimaryKey(related_category_id, -1, -1);

		symptom.setCategory(null);
		related_category.getSymptoms().remove(symptom);
		symptom = symptomDAO.store(symptom);
		symptomDAO.flush();

		related_category = categoryDAO.store(related_category);
		categoryDAO.flush();

		categoryDAO.remove(related_category);
		categoryDAO.flush();

		return symptom;
	}

	/**
	 * Load an existing Symptom entity
	 * 
	 */
	@Transactional
	public Set<Symptom> loadSymptoms() {
		return symptomDAO.findAllSymptoms();
	}

	/**
	 * Save an existing Symptom entity
	 * 
	 */
	@Transactional
	public void saveSymptom(Symptom symptom) {
		Symptom existingSymptom = symptomDAO.findSymptomByPrimaryKey(symptom.getId());

		if (existingSymptom != null) {
			if (existingSymptom != symptom) {
				existingSymptom.setId(symptom.getId());
				existingSymptom.setDescrib(symptom.getDescrib());
				existingSymptom.setSymptomField(symptom.getSymptomField());
				existingSymptom.setNormal(symptom.getNormal());
				existingSymptom.setType(symptom.getType());
			}
			symptom = symptomDAO.store(existingSymptom);
		} else {
			symptom = symptomDAO.store(symptom);
		}
		symptomDAO.flush();
	}

	/**
	 */
	@Transactional
	public Symptom findSymptomByPrimaryKey(Integer id) {
		return symptomDAO.findSymptomByPrimaryKey(id);
	}

	/**
	 * Return a count of all Symptom entity
	 * 
	 */
	@Transactional
	public Integer countSymptoms() {
		return ((Long) symptomDAO.createQuerySingleResult("select count(o) from Symptom o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing MedicineSymptom entity
	 * 
	 */
	@Transactional
	public Symptom deleteSymptomMedicineSymptoms(Integer symptom_id, Integer related_medicinesymptoms_id) {
		MedicineSymptom related_medicinesymptoms = medicineSymptomDAO.findMedicineSymptomByPrimaryKey(related_medicinesymptoms_id, -1, -1);

		Symptom symptom = symptomDAO.findSymptomByPrimaryKey(symptom_id, -1, -1);

		related_medicinesymptoms.setSymptom(null);
		symptom.getMedicineSymptoms().remove(related_medicinesymptoms);

		medicineSymptomDAO.remove(related_medicinesymptoms);
		medicineSymptomDAO.flush();

		return symptom;
	}

	/**
	 * Return all Symptom entity
	 * 
	 */
	@Transactional
	public List<Symptom> findAllSymptoms(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Symptom>(symptomDAO.findAllSymptoms(startResult, maxRows));
	}

	/**
	 * Save an existing Category entity
	 * 
	 */
	@Transactional
	public Symptom saveSymptomCategory(Integer id, Category related_category) {
		Symptom symptom = symptomDAO.findSymptomByPrimaryKey(id, -1, -1);
		Category existingcategory = categoryDAO.findCategoryByPrimaryKey(related_category.getId());

		// copy into the existing record to preserve existing relationships
		if (existingcategory != null) {
			existingcategory.setId(related_category.getId());
			existingcategory.setCategoryField(related_category.getCategoryField());
			existingcategory.setDescrib(related_category.getDescrib());
			related_category = existingcategory;
		}

		symptom.setCategory(related_category);
		related_category.getSymptoms().add(symptom);
		symptom = symptomDAO.store(symptom);
		symptomDAO.flush();

		related_category = categoryDAO.store(related_category);
		categoryDAO.flush();

		return symptom;
	}

	/**
	 * Save an existing MedicineSymptom entity
	 * 
	 */
	@Transactional
	public Symptom saveSymptomMedicineSymptoms(Integer id, MedicineSymptom related_medicinesymptoms) {
		Symptom symptom = symptomDAO.findSymptomByPrimaryKey(id, -1, -1);
		MedicineSymptom existingmedicineSymptoms = medicineSymptomDAO.findMedicineSymptomByPrimaryKey(related_medicinesymptoms.getId());

		// copy into the existing record to preserve existing relationships
		if (existingmedicineSymptoms != null) {
			existingmedicineSymptoms.setId(related_medicinesymptoms.getId());
			related_medicinesymptoms = existingmedicineSymptoms;
		}

		related_medicinesymptoms.setSymptom(symptom);
		symptom.getMedicineSymptoms().add(related_medicinesymptoms);
		related_medicinesymptoms = medicineSymptomDAO.store(related_medicinesymptoms);
		medicineSymptomDAO.flush();

		symptom = symptomDAO.store(symptom);
		symptomDAO.flush();

		return symptom;
	}

	/**
	 * Delete an existing Symptom entity
	 * 
	 */
	@Transactional
	public void deleteSymptom(Symptom symptom) {
		symptomDAO.remove(symptom);
		symptomDAO.flush();
	}
}
