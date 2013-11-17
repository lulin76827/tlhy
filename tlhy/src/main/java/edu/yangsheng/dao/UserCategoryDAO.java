package edu.yangsheng.dao;

import edu.yangsheng.domain.UserCategory;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage UserCategory entities.
 * 
 */
public interface UserCategoryDAO extends JpaDao<UserCategory> {

	/**
	 * JPQL Query - findUserCategoryByCreateTime
	 *
	 */
	public Set<UserCategory> findUserCategoryByCreateTime(java.util.Calendar createTime) throws DataAccessException;

	/**
	 * JPQL Query - findUserCategoryByCreateTime
	 *
	 */
	public Set<UserCategory> findUserCategoryByCreateTime(Calendar createTime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllUserCategorys
	 *
	 */
	public Set<UserCategory> findAllUserCategorys() throws DataAccessException;

	/**
	 * JPQL Query - findAllUserCategorys
	 *
	 */
	public Set<UserCategory> findAllUserCategorys(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserCategoryById
	 *
	 */
	public UserCategory findUserCategoryById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findUserCategoryById
	 *
	 */
	public UserCategory findUserCategoryById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserCategoryByScore
	 *
	 */
	public Set<UserCategory> findUserCategoryByScore(Integer score) throws DataAccessException;

	/**
	 * JPQL Query - findUserCategoryByScore
	 *
	 */
	public Set<UserCategory> findUserCategoryByScore(Integer score, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserCategoryByPrimaryKey
	 *
	 */
	public UserCategory findUserCategoryByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserCategoryByPrimaryKey
	 *
	 */
	public UserCategory findUserCategoryByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}