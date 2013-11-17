package edu.yangsheng.dao;

import edu.yangsheng.domain.Symptom;

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
 * DAO to manage Symptom entities.
 * 
 */
@Repository("SymptomDAO")
@Transactional
public class SymptomDAOImpl extends AbstractJpaDao<Symptom> implements
		SymptomDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Symptom.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_jdbc_Driver
	 *
	 */
	@PersistenceContext(unitName = "com_mysql_jdbc_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new SymptomDAOImpl
	 *
	 */
	public SymptomDAOImpl() {
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
	 * JPQL Query - findSymptomByDescribContaining
	 *
	 */
	@Transactional
	public Set<Symptom> findSymptomByDescribContaining(String describ) throws DataAccessException {

		return findSymptomByDescribContaining(describ, -1, -1);
	}

	/**
	 * JPQL Query - findSymptomByDescribContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Symptom> findSymptomByDescribContaining(String describ, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSymptomByDescribContaining", startResult, maxRows, describ);
		return new LinkedHashSet<Symptom>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllSymptoms
	 *
	 */
	@Transactional
	public Set<Symptom> findAllSymptoms() throws DataAccessException {

		return findAllSymptoms(-1, -1);
	}

	/**
	 * JPQL Query - findAllSymptoms
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Symptom> findAllSymptoms(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllSymptoms", startResult, maxRows);
		return new LinkedHashSet<Symptom>(query.getResultList());
	}

	/**
	 * JPQL Query - findSymptomByType
	 *
	 */
	@Transactional
	public Set<Symptom> findSymptomByType(String type) throws DataAccessException {

		return findSymptomByType(type, -1, -1);
	}

	/**
	 * JPQL Query - findSymptomByType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Symptom> findSymptomByType(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSymptomByType", startResult, maxRows, type);
		return new LinkedHashSet<Symptom>(query.getResultList());
	}

	/**
	 * JPQL Query - findSymptomByNormal
	 *
	 */
	@Transactional
	public Set<Symptom> findSymptomByNormal(Boolean normal) throws DataAccessException {

		return findSymptomByNormal(normal, -1, -1);
	}

	/**
	 * JPQL Query - findSymptomByNormal
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Symptom> findSymptomByNormal(Boolean normal, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSymptomByNormal", startResult, maxRows, normal);
		return new LinkedHashSet<Symptom>(query.getResultList());
	}

	/**
	 * JPQL Query - findSymptomByDescrib
	 *
	 */
	@Transactional
	public Set<Symptom> findSymptomByDescrib(String describ) throws DataAccessException {

		return findSymptomByDescrib(describ, -1, -1);
	}

	/**
	 * JPQL Query - findSymptomByDescrib
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Symptom> findSymptomByDescrib(String describ, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSymptomByDescrib", startResult, maxRows, describ);
		return new LinkedHashSet<Symptom>(query.getResultList());
	}

	/**
	 * JPQL Query - findSymptomById
	 *
	 */
	@Transactional
	public Symptom findSymptomById(Integer id) throws DataAccessException {

		return findSymptomById(id, -1, -1);
	}

	/**
	 * JPQL Query - findSymptomById
	 *
	 */

	@Transactional
	public Symptom findSymptomById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findSymptomById", startResult, maxRows, id);
			return (edu.yangsheng.domain.Symptom) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findSymptomByTypeContaining
	 *
	 */
	@Transactional
	public Set<Symptom> findSymptomByTypeContaining(String type) throws DataAccessException {

		return findSymptomByTypeContaining(type, -1, -1);
	}

	/**
	 * JPQL Query - findSymptomByTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Symptom> findSymptomByTypeContaining(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSymptomByTypeContaining", startResult, maxRows, type);
		return new LinkedHashSet<Symptom>(query.getResultList());
	}

	/**
	 * JPQL Query - findSymptomByPrimaryKey
	 *
	 */
	@Transactional
	public Symptom findSymptomByPrimaryKey(Integer id) throws DataAccessException {

		return findSymptomByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findSymptomByPrimaryKey
	 *
	 */

	@Transactional
	public Symptom findSymptomByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findSymptomByPrimaryKey", startResult, maxRows, id);
			return (edu.yangsheng.domain.Symptom) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findSymptomBySymptomFieldContaining
	 *
	 */
	@Transactional
	public Set<Symptom> findSymptomBySymptomFieldContaining(String symptomField) throws DataAccessException {

		return findSymptomBySymptomFieldContaining(symptomField, -1, -1);
	}

	/**
	 * JPQL Query - findSymptomBySymptomFieldContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Symptom> findSymptomBySymptomFieldContaining(String symptomField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSymptomBySymptomFieldContaining", startResult, maxRows, symptomField);
		return new LinkedHashSet<Symptom>(query.getResultList());
	}

	/**
	 * JPQL Query - findSymptomBySymptomField
	 *
	 */
	@Transactional
	public Set<Symptom> findSymptomBySymptomField(String symptomField) throws DataAccessException {

		return findSymptomBySymptomField(symptomField, -1, -1);
	}

	/**
	 * JPQL Query - findSymptomBySymptomField
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Symptom> findSymptomBySymptomField(String symptomField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSymptomBySymptomField", startResult, maxRows, symptomField);
		return new LinkedHashSet<Symptom>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Symptom entity) {
		return true;
	}
}
