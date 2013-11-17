package edu.yangsheng.service;

import edu.yangsheng.dao.MedicineDAO;
import edu.yangsheng.dao.MedicineSymptomDAO;
import edu.yangsheng.dao.SymptomDAO;

import edu.yangsheng.domain.Medicine;
import edu.yangsheng.domain.MedicineSymptom;
import edu.yangsheng.domain.Symptom;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for MedicineSymptom entities
 * 
 */

@Service("MedicineSymptomService")
@Transactional
public class MedicineSymptomServiceImpl implements MedicineSymptomService {

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
	 * Instantiates a new MedicineSymptomServiceImpl.
	 *
	 */
	public MedicineSymptomServiceImpl() {
	}

	/**
	 * Save an existing Symptom entity
	 * 
	 */
	@Transactional
	public MedicineSymptom saveMedicineSymptomSymptom(Integer id, Symptom related_symptom) {
		MedicineSymptom medicinesymptom = medicineSymptomDAO.findMedicineSymptomByPrimaryKey(id, -1, -1);
		Symptom existingsymptom = symptomDAO.findSymptomByPrimaryKey(related_symptom.getId());

		// copy into the existing record to preserve existing relationships
		if (existingsymptom != null) {
			existingsymptom.setId(related_symptom.getId());
			existingsymptom.setDescrib(related_symptom.getDescrib());
			existingsymptom.setSymptomField(related_symptom.getSymptomField());
			existingsymptom.setNormal(related_symptom.getNormal());
			existingsymptom.setType(related_symptom.getType());
			related_symptom = existingsymptom;
		}

		medicinesymptom.setSymptom(related_symptom);
		related_symptom.getMedicineSymptoms().add(medicinesymptom);
		medicinesymptom = medicineSymptomDAO.store(medicinesymptom);
		medicineSymptomDAO.flush();

		related_symptom = symptomDAO.store(related_symptom);
		symptomDAO.flush();

		return medicinesymptom;
	}

	/**
	 * Load an existing MedicineSymptom entity
	 * 
	 */
	@Transactional
	public Set<MedicineSymptom> loadMedicineSymptoms() {
		return medicineSymptomDAO.findAllMedicineSymptoms();
	}

	/**
	 * Return all MedicineSymptom entity
	 * 
	 */
	@Transactional
	public List<MedicineSymptom> findAllMedicineSymptoms(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<MedicineSymptom>(medicineSymptomDAO.findAllMedicineSymptoms(startResult, maxRows));
	}

	/**
	 * Save an existing Medicine entity
	 * 
	 */
	@Transactional
	public MedicineSymptom saveMedicineSymptomMedicine(Integer id, Medicine related_medicine) {
		MedicineSymptom medicinesymptom = medicineSymptomDAO.findMedicineSymptomByPrimaryKey(id, -1, -1);
		Medicine existingmedicine = medicineDAO.findMedicineByPrimaryKey(related_medicine.getId());

		// copy into the existing record to preserve existing relationships
		if (existingmedicine != null) {
			existingmedicine.setId(related_medicine.getId());
			existingmedicine.setDescrib(related_medicine.getDescrib());
			existingmedicine.setMedicineField(related_medicine.getMedicineField());
			existingmedicine.setType(related_medicine.getType());
			related_medicine = existingmedicine;
		}

		medicinesymptom.setMedicine(related_medicine);
		related_medicine.getMedicineSymptoms().add(medicinesymptom);
		medicinesymptom = medicineSymptomDAO.store(medicinesymptom);
		medicineSymptomDAO.flush();

		related_medicine = medicineDAO.store(related_medicine);
		medicineDAO.flush();

		return medicinesymptom;
	}

	/**
	 * Delete an existing MedicineSymptom entity
	 * 
	 */
	@Transactional
	public void deleteMedicineSymptom(MedicineSymptom medicinesymptom) {
		medicineSymptomDAO.remove(medicinesymptom);
		medicineSymptomDAO.flush();
	}

	/**
	 * Return a count of all MedicineSymptom entity
	 * 
	 */
	@Transactional
	public Integer countMedicineSymptoms() {
		return ((Long) medicineSymptomDAO.createQuerySingleResult("select count(o) from MedicineSymptom o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public MedicineSymptom findMedicineSymptomByPrimaryKey(Integer id) {
		return medicineSymptomDAO.findMedicineSymptomByPrimaryKey(id);
	}

	/**
	 * Save an existing MedicineSymptom entity
	 * 
	 */
	@Transactional
	public void saveMedicineSymptom(MedicineSymptom medicinesymptom) {
		MedicineSymptom existingMedicineSymptom = medicineSymptomDAO.findMedicineSymptomByPrimaryKey(medicinesymptom.getId());

		if (existingMedicineSymptom != null) {
			if (existingMedicineSymptom != medicinesymptom) {
				existingMedicineSymptom.setId(medicinesymptom.getId());
			}
			medicinesymptom = medicineSymptomDAO.store(existingMedicineSymptom);
		} else {
			medicinesymptom = medicineSymptomDAO.store(medicinesymptom);
		}
		medicineSymptomDAO.flush();
	}

	/**
	 * Delete an existing Medicine entity
	 * 
	 */
	@Transactional
	public MedicineSymptom deleteMedicineSymptomMedicine(Integer medicinesymptom_id, Integer related_medicine_id) {
		MedicineSymptom medicinesymptom = medicineSymptomDAO.findMedicineSymptomByPrimaryKey(medicinesymptom_id, -1, -1);
		Medicine related_medicine = medicineDAO.findMedicineByPrimaryKey(related_medicine_id, -1, -1);

		medicinesymptom.setMedicine(null);
		related_medicine.getMedicineSymptoms().remove(medicinesymptom);
		medicinesymptom = medicineSymptomDAO.store(medicinesymptom);
		medicineSymptomDAO.flush();

		related_medicine = medicineDAO.store(related_medicine);
		medicineDAO.flush();

		medicineDAO.remove(related_medicine);
		medicineDAO.flush();

		return medicinesymptom;
	}

	/**
	 * Delete an existing Symptom entity
	 * 
	 */
	@Transactional
	public MedicineSymptom deleteMedicineSymptomSymptom(Integer medicinesymptom_id, Integer related_symptom_id) {
		MedicineSymptom medicinesymptom = medicineSymptomDAO.findMedicineSymptomByPrimaryKey(medicinesymptom_id, -1, -1);
		Symptom related_symptom = symptomDAO.findSymptomByPrimaryKey(related_symptom_id, -1, -1);

		medicinesymptom.setSymptom(null);
		related_symptom.getMedicineSymptoms().remove(medicinesymptom);
		medicinesymptom = medicineSymptomDAO.store(medicinesymptom);
		medicineSymptomDAO.flush();

		related_symptom = symptomDAO.store(related_symptom);
		symptomDAO.flush();

		symptomDAO.remove(related_symptom);
		symptomDAO.flush();

		return medicinesymptom;
	}
}
