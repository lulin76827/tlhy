package edu.yangsheng.dao;

import edu.yangsheng.domain.Symptom;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Symptom entities.
 * 
 */
public interface SymptomDAO extends JpaDao<Symptom> {

	/**
	 * JPQL Query - findSymptomByDescribContaining
	 *
	 */
	public Set<Symptom> findSymptomByDescribContaining(String describ) throws DataAccessException;

	/**
	 * JPQL Query - findSymptomByDescribContaining
	 *
	 */
	public Set<Symptom> findSymptomByDescribContaining(String describ, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllSymptoms
	 *
	 */
	public Set<Symptom> findAllSymptoms() throws DataAccessException;

	/**
	 * JPQL Query - findAllSymptoms
	 *
	 */
	public Set<Symptom> findAllSymptoms(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSymptomByType
	 *
	 */
	public Set<Symptom> findSymptomByType(String type) throws DataAccessException;

	/**
	 * JPQL Query - findSymptomByType
	 *
	 */
	public Set<Symptom> findSymptomByType(String type, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSymptomByNormal
	 *
	 */
	public Set<Symptom> findSymptomByNormal(Boolean normal) throws DataAccessException;

	/**
	 * JPQL Query - findSymptomByNormal
	 *
	 */
	public Set<Symptom> findSymptomByNormal(Boolean normal, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSymptomByDescrib
	 *
	 */
	public Set<Symptom> findSymptomByDescrib(String describ_1) throws DataAccessException;

	/**
	 * JPQL Query - findSymptomByDescrib
	 *
	 */
	public Set<Symptom> findSymptomByDescrib(String describ_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSymptomById
	 *
	 */
	public Symptom findSymptomById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findSymptomById
	 *
	 */
	public Symptom findSymptomById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSymptomByTypeContaining
	 *
	 */
	public Set<Symptom> findSymptomByTypeContaining(String type_1) throws DataAccessException;

	/**
	 * JPQL Query - findSymptomByTypeContaining
	 *
	 */
	public Set<Symptom> findSymptomByTypeContaining(String type_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSymptomByPrimaryKey
	 *
	 */
	public Symptom findSymptomByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findSymptomByPrimaryKey
	 *
	 */
	public Symptom findSymptomByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSymptomBySymptomFieldContaining
	 *
	 */
	public Set<Symptom> findSymptomBySymptomFieldContaining(String symptomField) throws DataAccessException;

	/**
	 * JPQL Query - findSymptomBySymptomFieldContaining
	 *
	 */
	public Set<Symptom> findSymptomBySymptomFieldContaining(String symptomField, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSymptomBySymptomField
	 *
	 */
	public Set<Symptom> findSymptomBySymptomField(String symptomField_1) throws DataAccessException;

	/**
	 * JPQL Query - findSymptomBySymptomField
	 *
	 */
	public Set<Symptom> findSymptomBySymptomField(String symptomField_1, int startResult, int maxRows) throws DataAccessException;

}