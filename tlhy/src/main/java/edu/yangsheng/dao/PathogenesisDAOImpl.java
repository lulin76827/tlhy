package edu.yangsheng.dao;

import edu.yangsheng.domain.Pathogenesis;

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
 * DAO to manage Pathogenesis entities.
 * 
 */
@Repository("PathogenesisDAO")
@Transactional
public class PathogenesisDAOImpl extends AbstractJpaDao<Pathogenesis> implements
		PathogenesisDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Pathogenesis.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_jdbc_Driver
	 *
	 */
	@PersistenceContext(unitName = "com_mysql_jdbc_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new PathogenesisDAOImpl
	 *
	 */
	public PathogenesisDAOImpl() {
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
	 * JPQL Query - findPathogenesisByDescribContaining
	 *
	 */
	@Transactional
	public Set<Pathogenesis> findPathogenesisByDescribContaining(String describ) throws DataAccessException {

		return findPathogenesisByDescribContaining(describ, -1, -1);
	}

	/**
	 * JPQL Query - findPathogenesisByDescribContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Pathogenesis> findPathogenesisByDescribContaining(String describ, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPathogenesisByDescribContaining", startResult, maxRows, describ);
		return new LinkedHashSet<Pathogenesis>(query.getResultList());
	}

	/**
	 * JPQL Query - findPathogenesisByTypeContaining
	 *
	 */
	@Transactional
	public Set<Pathogenesis> findPathogenesisByTypeContaining(String type) throws DataAccessException {

		return findPathogenesisByTypeContaining(type, -1, -1);
	}

	/**
	 * JPQL Query - findPathogenesisByTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Pathogenesis> findPathogenesisByTypeContaining(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPathogenesisByTypeContaining", startResult, maxRows, type);
		return new LinkedHashSet<Pathogenesis>(query.getResultList());
	}

	/**
	 * JPQL Query - findPathogenesisByDescrib
	 *
	 */
	@Transactional
	public Set<Pathogenesis> findPathogenesisByDescrib(String describ) throws DataAccessException {

		return findPathogenesisByDescrib(describ, -1, -1);
	}

	/**
	 * JPQL Query - findPathogenesisByDescrib
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Pathogenesis> findPathogenesisByDescrib(String describ, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPathogenesisByDescrib", startResult, maxRows, describ);
		return new LinkedHashSet<Pathogenesis>(query.getResultList());
	}

	/**
	 * JPQL Query - findPathogenesisByPathogenesisField
	 *
	 */
	@Transactional
	public Set<Pathogenesis> findPathogenesisByPathogenesisField(String pathogenesisField) throws DataAccessException {

		return findPathogenesisByPathogenesisField(pathogenesisField, -1, -1);
	}

	/**
	 * JPQL Query - findPathogenesisByPathogenesisField
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Pathogenesis> findPathogenesisByPathogenesisField(String pathogenesisField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPathogenesisByPathogenesisField", startResult, maxRows, pathogenesisField);
		return new LinkedHashSet<Pathogenesis>(query.getResultList());
	}

	/**
	 * JPQL Query - findPathogenesisByType
	 *
	 */
	@Transactional
	public Set<Pathogenesis> findPathogenesisByType(String type) throws DataAccessException {

		return findPathogenesisByType(type, -1, -1);
	}

	/**
	 * JPQL Query - findPathogenesisByType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Pathogenesis> findPathogenesisByType(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPathogenesisByType", startResult, maxRows, type);
		return new LinkedHashSet<Pathogenesis>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllPathogenesiss
	 *
	 */
	@Transactional
	public Set<Pathogenesis> findAllPathogenesiss() throws DataAccessException {

		return findAllPathogenesiss(-1, -1);
	}

	/**
	 * JPQL Query - findAllPathogenesiss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Pathogenesis> findAllPathogenesiss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllPathogenesiss", startResult, maxRows);
		return new LinkedHashSet<Pathogenesis>(query.getResultList());
	}

	/**
	 * JPQL Query - findPathogenesisByPrimaryKey
	 *
	 */
	@Transactional
	public Pathogenesis findPathogenesisByPrimaryKey(Integer id) throws DataAccessException {

		return findPathogenesisByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findPathogenesisByPrimaryKey
	 *
	 */

	@Transactional
	public Pathogenesis findPathogenesisByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPathogenesisByPrimaryKey", startResult, maxRows, id);
			return (edu.yangsheng.domain.Pathogenesis) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findPathogenesisById
	 *
	 */
	@Transactional
	public Pathogenesis findPathogenesisById(Integer id) throws DataAccessException {

		return findPathogenesisById(id, -1, -1);
	}

	/**
	 * JPQL Query - findPathogenesisById
	 *
	 */

	@Transactional
	public Pathogenesis findPathogenesisById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPathogenesisById", startResult, maxRows, id);
			return (edu.yangsheng.domain.Pathogenesis) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findPathogenesisByPathogenesisFieldContaining
	 *
	 */
	@Transactional
	public Set<Pathogenesis> findPathogenesisByPathogenesisFieldContaining(String pathogenesisField) throws DataAccessException {

		return findPathogenesisByPathogenesisFieldContaining(pathogenesisField, -1, -1);
	}

	/**
	 * JPQL Query - findPathogenesisByPathogenesisFieldContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Pathogenesis> findPathogenesisByPathogenesisFieldContaining(String pathogenesisField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPathogenesisByPathogenesisFieldContaining", startResult, maxRows, pathogenesisField);
		return new LinkedHashSet<Pathogenesis>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Pathogenesis entity) {
		return true;
	}
}
