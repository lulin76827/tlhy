package edu.yangsheng.dao;

import edu.yangsheng.domain.MedicineSymptom;

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
 * DAO to manage MedicineSymptom entities.
 * 
 */
@Repository("MedicineSymptomDAO")
@Transactional
public class MedicineSymptomDAOImpl extends AbstractJpaDao<MedicineSymptom>
		implements MedicineSymptomDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { MedicineSymptom.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_jdbc_Driver
	 *
	 */
	@PersistenceContext(unitName = "com_mysql_jdbc_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new MedicineSymptomDAOImpl
	 *
	 */
	public MedicineSymptomDAOImpl() {
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
	 * JPQL Query - findAllMedicineSymptoms
	 *
	 */
	@Transactional
	public Set<MedicineSymptom> findAllMedicineSymptoms() throws DataAccessException {

		return findAllMedicineSymptoms(-1, -1);
	}

	/**
	 * JPQL Query - findAllMedicineSymptoms
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<MedicineSymptom> findAllMedicineSymptoms(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllMedicineSymptoms", startResult, maxRows);
		return new LinkedHashSet<MedicineSymptom>(query.getResultList());
	}

	/**
	 * JPQL Query - findMedicineSymptomById
	 *
	 */
	@Transactional
	public MedicineSymptom findMedicineSymptomById(Integer id) throws DataAccessException {

		return findMedicineSymptomById(id, -1, -1);
	}

	/**
	 * JPQL Query - findMedicineSymptomById
	 *
	 */

	@Transactional
	public MedicineSymptom findMedicineSymptomById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findMedicineSymptomById", startResult, maxRows, id);
			return (edu.yangsheng.domain.MedicineSymptom) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findMedicineSymptomByPrimaryKey
	 *
	 */
	@Transactional
	public MedicineSymptom findMedicineSymptomByPrimaryKey(Integer id) throws DataAccessException {

		return findMedicineSymptomByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findMedicineSymptomByPrimaryKey
	 *
	 */

	@Transactional
	public MedicineSymptom findMedicineSymptomByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findMedicineSymptomByPrimaryKey", startResult, maxRows, id);
			return (edu.yangsheng.domain.MedicineSymptom) query.getSingleResult();
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
	public boolean canBeMerged(MedicineSymptom entity) {
		return true;
	}
}
