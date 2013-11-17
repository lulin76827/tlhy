package edu.yangsheng.dao;

import edu.yangsheng.domain.MedicineSymptom;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage MedicineSymptom entities.
 * 
 */
public interface MedicineSymptomDAO extends JpaDao<MedicineSymptom> {

	/**
	 * JPQL Query - findAllMedicineSymptoms
	 *
	 */
	public Set<MedicineSymptom> findAllMedicineSymptoms() throws DataAccessException;

	/**
	 * JPQL Query - findAllMedicineSymptoms
	 *
	 */
	public Set<MedicineSymptom> findAllMedicineSymptoms(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMedicineSymptomById
	 *
	 */
	public MedicineSymptom findMedicineSymptomById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findMedicineSymptomById
	 *
	 */
	public MedicineSymptom findMedicineSymptomById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMedicineSymptomByPrimaryKey
	 *
	 */
	public MedicineSymptom findMedicineSymptomByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findMedicineSymptomByPrimaryKey
	 *
	 */
	public MedicineSymptom findMedicineSymptomByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}