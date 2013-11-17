package edu.yangsheng.dao;

import edu.yangsheng.domain.Medicine;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Medicine entities.
 * 
 */
public interface MedicineDAO extends JpaDao<Medicine> {

	/**
	 * JPQL Query - findMedicineByMedicineFieldContaining
	 *
	 */
	public Set<Medicine> findMedicineByMedicineFieldContaining(String medicineField) throws DataAccessException;

	/**
	 * JPQL Query - findMedicineByMedicineFieldContaining
	 *
	 */
	public Set<Medicine> findMedicineByMedicineFieldContaining(String medicineField, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllMedicines
	 *
	 */
	public Set<Medicine> findAllMedicines() throws DataAccessException;

	/**
	 * JPQL Query - findAllMedicines
	 *
	 */
	public Set<Medicine> findAllMedicines(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMedicineByDescrib
	 *
	 */
	public Set<Medicine> findMedicineByDescrib(String describ) throws DataAccessException;

	/**
	 * JPQL Query - findMedicineByDescrib
	 *
	 */
	public Set<Medicine> findMedicineByDescrib(String describ, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMedicineByTypeContaining
	 *
	 */
	public Set<Medicine> findMedicineByTypeContaining(String type) throws DataAccessException;

	/**
	 * JPQL Query - findMedicineByTypeContaining
	 *
	 */
	public Set<Medicine> findMedicineByTypeContaining(String type, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMedicineByType
	 *
	 */
	public Set<Medicine> findMedicineByType(String type_1) throws DataAccessException;

	/**
	 * JPQL Query - findMedicineByType
	 *
	 */
	public Set<Medicine> findMedicineByType(String type_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMedicineByPrimaryKey
	 *
	 */
	public Medicine findMedicineByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findMedicineByPrimaryKey
	 *
	 */
	public Medicine findMedicineByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMedicineByMedicineField
	 *
	 */
	public Set<Medicine> findMedicineByMedicineField(String medicineField_1) throws DataAccessException;

	/**
	 * JPQL Query - findMedicineByMedicineField
	 *
	 */
	public Set<Medicine> findMedicineByMedicineField(String medicineField_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMedicineById
	 *
	 */
	public Medicine findMedicineById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findMedicineById
	 *
	 */
	public Medicine findMedicineById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMedicineByDescribContaining
	 *
	 */
	public Set<Medicine> findMedicineByDescribContaining(String describ_1) throws DataAccessException;

	/**
	 * JPQL Query - findMedicineByDescribContaining
	 *
	 */
	public Set<Medicine> findMedicineByDescribContaining(String describ_1, int startResult, int maxRows) throws DataAccessException;

}