package edu.yangsheng.dao;

import edu.yangsheng.domain.Category;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Category entities.
 * 
 */
public interface CategoryDAO extends JpaDao<Category> {

	/**
	 * JPQL Query - findCategoryById
	 *
	 */
	public Category findCategoryById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findCategoryById
	 *
	 */
	public Category findCategoryById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCategoryByCategoryFieldContaining
	 *
	 */
	public Set<Category> findCategoryByCategoryFieldContaining(String categoryField) throws DataAccessException;

	/**
	 * JPQL Query - findCategoryByCategoryFieldContaining
	 *
	 */
	public Set<Category> findCategoryByCategoryFieldContaining(String categoryField, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCategoryByCategoryField
	 *
	 */
	public Set<Category> findCategoryByCategoryField(String categoryField_1) throws DataAccessException;

	/**
	 * JPQL Query - findCategoryByCategoryField
	 *
	 */
	public Set<Category> findCategoryByCategoryField(String categoryField_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCategoryByPrimaryKey
	 *
	 */
	public Category findCategoryByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findCategoryByPrimaryKey
	 *
	 */
	public Category findCategoryByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllCategorys
	 *
	 */
	public Set<Category> findAllCategorys() throws DataAccessException;

	/**
	 * JPQL Query - findAllCategorys
	 *
	 */
	public Set<Category> findAllCategorys(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCategoryByDescrib
	 *
	 */
	public Set<Category> findCategoryByDescrib(String describ) throws DataAccessException;

	/**
	 * JPQL Query - findCategoryByDescrib
	 *
	 */
	public Set<Category> findCategoryByDescrib(String describ, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCategoryByDescribContaining
	 *
	 */
	public Set<Category> findCategoryByDescribContaining(String describ_1) throws DataAccessException;

	/**
	 * JPQL Query - findCategoryByDescribContaining
	 *
	 */
	public Set<Category> findCategoryByDescribContaining(String describ_1, int startResult, int maxRows) throws DataAccessException;

}