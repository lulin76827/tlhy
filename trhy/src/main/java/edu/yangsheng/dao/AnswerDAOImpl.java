package edu.yangsheng.dao;

import edu.yangsheng.domain.Answer;

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
 * DAO to manage Answer entities.
 * 
 */
@Repository("AnswerDAO")
@Transactional
public class AnswerDAOImpl extends AbstractJpaDao<Answer> implements AnswerDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Answer.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_jdbc_Driver
	 *
	 */
	@PersistenceContext(unitName = "com_mysql_jdbc_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new AnswerDAOImpl
	 *
	 */
	public AnswerDAOImpl() {
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
	 * JPQL Query - findAnswerByPrimaryKey
	 *
	 */
	@Transactional
	public Answer findAnswerByPrimaryKey(Integer id) throws DataAccessException {

		return findAnswerByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findAnswerByPrimaryKey
	 *
	 */

	@Transactional
	public Answer findAnswerByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAnswerByPrimaryKey", startResult, maxRows, id);
			return (edu.yangsheng.domain.Answer) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllAnswers
	 *
	 */
	@Transactional
	public Set<Answer> findAllAnswers() throws DataAccessException {

		return findAllAnswers(-1, -1);
	}

	/**
	 * JPQL Query - findAllAnswers
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Answer> findAllAnswers(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllAnswers", startResult, maxRows);
		return new LinkedHashSet<Answer>(query.getResultList());
	}

	/**
	 * JPQL Query - findAnswerByCreateTime
	 *
	 */
	@Transactional
	public Set<Answer> findAnswerByCreateTime(java.util.Calendar createTime) throws DataAccessException {

		return findAnswerByCreateTime(createTime, -1, -1);
	}

	/**
	 * JPQL Query - findAnswerByCreateTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Answer> findAnswerByCreateTime(java.util.Calendar createTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAnswerByCreateTime", startResult, maxRows, createTime);
		return new LinkedHashSet<Answer>(query.getResultList());
	}

	/**
	 * JPQL Query - findAnswerById
	 *
	 */
	@Transactional
	public Answer findAnswerById(Integer id) throws DataAccessException {

		return findAnswerById(id, -1, -1);
	}

	/**
	 * JPQL Query - findAnswerById
	 *
	 */

	@Transactional
	public Answer findAnswerById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAnswerById", startResult, maxRows, id);
			return (edu.yangsheng.domain.Answer) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAnswerByRecord
	 *
	 */
	@Transactional
	public Set<Answer> findAnswerByRecord(Integer record) throws DataAccessException {

		return findAnswerByRecord(record, -1, -1);
	}

	/**
	 * JPQL Query - findAnswerByRecord
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Answer> findAnswerByRecord(Integer record, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAnswerByRecord", startResult, maxRows, record);
		return new LinkedHashSet<Answer>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Answer entity) {
		return true;
	}
}
