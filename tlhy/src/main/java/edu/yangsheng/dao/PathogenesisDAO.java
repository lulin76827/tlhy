package edu.yangsheng.dao;

import edu.yangsheng.domain.Pathogenesis;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Pathogenesis entities.
 * 
 */
public interface PathogenesisDAO extends JpaDao<Pathogenesis> {

	/**
	 * JPQL Query - findPathogenesisByDescribContaining
	 *
	 */
	public Set<Pathogenesis> findPathogenesisByDescribContaining(String describ) throws DataAccessException;

	/**
	 * JPQL Query - findPathogenesisByDescribContaining
	 *
	 */
	public Set<Pathogenesis> findPathogenesisByDescribContaining(String describ, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPathogenesisByTypeContaining
	 *
	 */
	public Set<Pathogenesis> findPathogenesisByTypeContaining(String type) throws DataAccessException;

	/**
	 * JPQL Query - findPathogenesisByTypeContaining
	 *
	 */
	public Set<Pathogenesis> findPathogenesisByTypeContaining(String type, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPathogenesisByDescrib
	 *
	 */
	public Set<Pathogenesis> findPathogenesisByDescrib(String describ_1) throws DataAccessException;

	/**
	 * JPQL Query - findPathogenesisByDescrib
	 *
	 */
	public Set<Pathogenesis> findPathogenesisByDescrib(String describ_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPathogenesisByPathogenesisField
	 *
	 */
	public Set<Pathogenesis> findPathogenesisByPathogenesisField(String pathogenesisField) throws DataAccessException;

	/**
	 * JPQL Query - findPathogenesisByPathogenesisField
	 *
	 */
	public Set<Pathogenesis> findPathogenesisByPathogenesisField(String pathogenesisField, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPathogenesisByType
	 *
	 */
	public Set<Pathogenesis> findPathogenesisByType(String type_1) throws DataAccessException;

	/**
	 * JPQL Query - findPathogenesisByType
	 *
	 */
	public Set<Pathogenesis> findPathogenesisByType(String type_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllPathogenesiss
	 *
	 */
	public Set<Pathogenesis> findAllPathogenesiss() throws DataAccessException;

	/**
	 * JPQL Query - findAllPathogenesiss
	 *
	 */
	public Set<Pathogenesis> findAllPathogenesiss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPathogenesisByPrimaryKey
	 *
	 */
	public Pathogenesis findPathogenesisByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findPathogenesisByPrimaryKey
	 *
	 */
	public Pathogenesis findPathogenesisByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPathogenesisById
	 *
	 */
	public Pathogenesis findPathogenesisById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findPathogenesisById
	 *
	 */
	public Pathogenesis findPathogenesisById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPathogenesisByPathogenesisFieldContaining
	 *
	 */
	public Set<Pathogenesis> findPathogenesisByPathogenesisFieldContaining(String pathogenesisField_1) throws DataAccessException;

	/**
	 * JPQL Query - findPathogenesisByPathogenesisFieldContaining
	 *
	 */
	public Set<Pathogenesis> findPathogenesisByPathogenesisFieldContaining(String pathogenesisField_1, int startResult, int maxRows) throws DataAccessException;

}