package edu.yangsheng.dao;

import edu.yangsheng.domain.UserCategory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage UserCategory entities.
 * 
 */
@Repository("UserCategoryDAO")
@Transactional
public class UserCategoryDAOImpl extends AbstractJpaDao<UserCategory> implements
		UserCategoryDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { UserCategory.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_jdbc_Driver
	 *
	 */
	@PersistenceContext(unitName = "com_mysql_jdbc_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new UserCategoryDAOImpl
	 *
	 */
	public UserCategoryDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findUserCategoryByCreateTime
	 *
	 */
	@Transactional
	public Set<UserCategory> findUserCategoryByCreateTime(java.util.Calendar createTime) throws DataAccessException {

		return findUserCategoryByCreateTime(createTime, -1, -1);
	}

	/**
	 * JPQL Query - findUserCategoryByCreateTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UserCategory> findUserCategoryByCreateTime(java.util.Calendar createTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserCategoryByCreateTime", startResult, maxRows, createTime);
		return new LinkedHashSet<UserCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllUserCategorys
	 *
	 */
	@Transactional
	public Set<UserCategory> findAllUserCategorys() throws DataAccessException {

		return findAllUserCategorys(-1, -1);
	}

	/**
	 * JPQL Query - findAllUserCategorys
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UserCategory> findAllUserCategorys(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllUserCategorys", startResult, maxRows);
		return new LinkedHashSet<UserCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserCategoryById
	 *
	 */
	@Transactional
	public UserCategory findUserCategoryById(Integer id) throws DataAccessException {

		return findUserCategoryById(id, -1, -1);
	}

	/**
	 * JPQL Query - findUserCategoryById
	 *
	 */

	@Transactional
	public UserCategory findUserCategoryById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUserCategoryById", startResult, maxRows, id);
			return (edu.yangsheng.domain.UserCategory) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUserCategoryByScore
	 *
	 */
	@Transactional
	public Set<UserCategory> findUserCategoryByScore(Integer score) throws DataAccessException {

		return findUserCategoryByScore(score, -1, -1);
	}

	/**
	 * JPQL Query - findUserCategoryByScore
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UserCategory> findUserCategoryByScore(Integer score, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserCategoryByScore", startResult, maxRows, score);
		return new LinkedHashSet<UserCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserCategoryByPrimaryKey
	 *
	 */
	@Transactional
	public UserCategory findUserCategoryByPrimaryKey(Integer id) throws DataAccessException {

		return findUserCategoryByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findUserCategoryByPrimaryKey
	 *
	 */

	@Transactional
	public UserCategory findUserCategoryByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUserCategoryByPrimaryKey", startResult, maxRows, id);
			return (edu.yangsheng.domain.UserCategory) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(UserCategory entity) {
		return true;
	}
}
