package edu.yangsheng.dao;

import edu.yangsheng.domain.Question;

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
 * DAO to manage Question entities.
 * 
 */
@Repository("QuestionDAO")
@Transactional
public class QuestionDAOImpl extends AbstractJpaDao<Question> implements
		QuestionDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Question.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_jdbc_Driver
	 *
	 */
	@PersistenceContext(unitName = "com_mysql_jdbc_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new QuestionDAOImpl
	 *
	 */
	public QuestionDAOImpl() {
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
	 * JPQL Query - findQuestionByQuestionFieldContaining
	 *
	 */
	@Transactional
	public Set<Question> findQuestionByQuestionFieldContaining(String questionField) throws DataAccessException {

		return findQuestionByQuestionFieldContaining(questionField, -1, -1);
	}

	/**
	 * JPQL Query - findQuestionByQuestionFieldContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Question> findQuestionByQuestionFieldContaining(String questionField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findQuestionByQuestionFieldContaining", startResult, maxRows, questionField);
		return new LinkedHashSet<Question>(query.getResultList());
	}

	/**
	 * JPQL Query - findQuestionByPrimaryKey
	 *
	 */
	@Transactional
	public Question findQuestionByPrimaryKey(Integer id) throws DataAccessException {

		return findQuestionByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findQuestionByPrimaryKey
	 *
	 */

	@Transactional
	public Question findQuestionByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findQuestionByPrimaryKey", startResult, maxRows, id);
			return (edu.yangsheng.domain.Question) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findQuestionById
	 *
	 */
	@Transactional
	public Question findQuestionById(Integer id) throws DataAccessException {

		return findQuestionById(id, -1, -1);
	}

	/**
	 * JPQL Query - findQuestionById
	 *
	 */

	@Transactional
	public Question findQuestionById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findQuestionById", startResult, maxRows, id);
			return (edu.yangsheng.domain.Question) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllQuestions
	 *
	 */
	@Transactional
	public Set<Question> findAllQuestions() throws DataAccessException {

		return findAllQuestions(-1, -1);
	}

	/**
	 * JPQL Query - findAllQuestions
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Question> findAllQuestions(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllQuestions", startResult, maxRows);
		return new LinkedHashSet<Question>(query.getResultList());
	}

	/**
	 * JPQL Query - findQuestionByQuestionField
	 *
	 */
	@Transactional
	public Set<Question> findQuestionByQuestionField(String questionField) throws DataAccessException {

		return findQuestionByQuestionField(questionField, -1, -1);
	}

	/**
	 * JPQL Query - findQuestionByQuestionField
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Question> findQuestionByQuestionField(String questionField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findQuestionByQuestionField", startResult, maxRows, questionField);
		return new LinkedHashSet<Question>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Question entity) {
		return true;
	}
}
