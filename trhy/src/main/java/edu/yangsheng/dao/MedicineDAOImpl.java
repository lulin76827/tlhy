package edu.yangsheng.dao;

import edu.yangsheng.domain.Medicine;

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
 * DAO to manage Medicine entities.
 * 
 */
@Repository("MedicineDAO")
@Transactional
public class MedicineDAOImpl extends AbstractJpaDao<Medicine> implements
		MedicineDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Medicine.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_jdbc_Driver
	 *
	 */
	@PersistenceContext(unitName = "com_mysql_jdbc_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new MedicineDAOImpl
	 *
	 */
	public MedicineDAOImpl() {
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
	 * JPQL Query - findMedicineByMedicineFieldContaining
	 *
	 */
	@Transactional
	public Set<Medicine> findMedicineByMedicineFieldContaining(String medicineField) throws DataAccessException {

		return findMedicineByMedicineFieldContaining(medicineField, -1, -1);
	}

	/**
	 * JPQL Query - findMedicineByMedicineFieldContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Medicine> findMedicineByMedicineFieldContaining(String medicineField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMedicineByMedicineFieldContaining", startResult, maxRows, medicineField);
		return new LinkedHashSet<Medicine>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllMedicines
	 *
	 */
	@Transactional
	public Set<Medicine> findAllMedicines() throws DataAccessException {

		return findAllMedicines(-1, -1);
	}

	/**
	 * JPQL Query - findAllMedicines
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Medicine> findAllMedicines(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllMedicines", startResult, maxRows);
		return new LinkedHashSet<Medicine>(query.getResultList());
	}

	/**
	 * JPQL Query - findMedicineByDescrib
	 *
	 */
	@Transactional
	public Set<Medicine> findMedicineByDescrib(String describ) throws DataAccessException {

		return findMedicineByDescrib(describ, -1, -1);
	}

	/**
	 * JPQL Query - findMedicineByDescrib
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Medicine> findMedicineByDescrib(String describ, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMedicineByDescrib", startResult, maxRows, describ);
		return new LinkedHashSet<Medicine>(query.getResultList());
	}

	/**
	 * JPQL Query - findMedicineByTypeContaining
	 *
	 */
	@Transactional
	public Set<Medicine> findMedicineByTypeContaining(String type) throws DataAccessException {

		return findMedicineByTypeContaining(type, -1, -1);
	}

	/**
	 * JPQL Query - findMedicineByTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Medicine> findMedicineByTypeContaining(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMedicineByTypeContaining", startResult, maxRows, type);
		return new LinkedHashSet<Medicine>(query.getResultList());
	}

	/**
	 * JPQL Query - findMedicineByType
	 *
	 */
	@Transactional
	public Set<Medicine> findMedicineByType(String type) throws DataAccessException {

		return findMedicineByType(type, -1, -1);
	}

	/**
	 * JPQL Query - findMedicineByType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Medicine> findMedicineByType(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMedicineByType", startResult, maxRows, type);
		return new LinkedHashSet<Medicine>(query.getResultList());
	}

	/**
	 * JPQL Query - findMedicineByPrimaryKey
	 *
	 */
	@Transactional
	public Medicine findMedicineByPrimaryKey(Integer id) throws DataAccessException {

		return findMedicineByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findMedicineByPrimaryKey
	 *
	 */

	@Transactional
	public Medicine findMedicineByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findMedicineByPrimaryKey", startResult, maxRows, id);
			return (edu.yangsheng.domain.Medicine) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findMedicineByMedicineField
	 *
	 */
	@Transactional
	public Set<Medicine> findMedicineByMedicineField(String medicineField) throws DataAccessException {

		return findMedicineByMedicineField(medicineField, -1, -1);
	}

	/**
	 * JPQL Query - findMedicineByMedicineField
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Medicine> findMedicineByMedicineField(String medicineField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMedicineByMedicineField", startResult, maxRows, medicineField);
		return new LinkedHashSet<Medicine>(query.getResultList());
	}

	/**
	 * JPQL Query - findMedicineById
	 *
	 */
	@Transactional
	public Medicine findMedicineById(Integer id) throws DataAccessException {

		return findMedicineById(id, -1, -1);
	}

	/**
	 * JPQL Query - findMedicineById
	 *
	 */

	@Transactional
	public Medicine findMedicineById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findMedicineById", startResult, maxRows, id);
			return (edu.yangsheng.domain.Medicine) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findMedicineByDescribContaining
	 *
	 */
	@Transactional
	public Set<Medicine> findMedicineByDescribContaining(String describ) throws DataAccessException {

		return findMedicineByDescribContaining(describ, -1, -1);
	}

	/**
	 * JPQL Query - findMedicineByDescribContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Medicine> findMedicineByDescribContaining(String describ, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMedicineByDescribContaining", startResult, maxRows, describ);
		return new LinkedHashSet<Medicine>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Medicine entity) {
		return true;
	}
}
