package edu.yangsheng.dao;

import edu.yangsheng.domain.Category;

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
 * DAO to manage Category entities.
 * 
 */
@Repository("CategoryDAO")
@Transactional
public class CategoryDAOImpl extends AbstractJpaDao<Category> implements
		CategoryDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Category.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_jdbc_Driver
	 *
	 */
	@PersistenceContext(unitName = "com_mysql_jdbc_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new CategoryDAOImpl
	 *
	 */
	public CategoryDAOImpl() {
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
	 * JPQL Query - findCategoryById
	 *
	 */
	@Transactional
	public Category findCategoryById(Integer id) throws DataAccessException {

		return findCategoryById(id, -1, -1);
	}

	/**
	 * JPQL Query - findCategoryById
	 *
	 */

	@Transactional
	public Category findCategoryById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCategoryById", startResult, maxRows, id);
			return (edu.yangsheng.domain.Category) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findCategoryByCategoryFieldContaining
	 *
	 */
	@Transactional
	public Set<Category> findCategoryByCategoryFieldContaining(String categoryField) throws DataAccessException {

		return findCategoryByCategoryFieldContaining(categoryField, -1, -1);
	}

	/**
	 * JPQL Query - findCategoryByCategoryFieldContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Category> findCategoryByCategoryFieldContaining(String categoryField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCategoryByCategoryFieldContaining", startResult, maxRows, categoryField);
		return new LinkedHashSet<Category>(query.getResultList());
	}

	/**
	 * JPQL Query - findCategoryByCategoryField
	 *
	 */
	@Transactional
	public Set<Category> findCategoryByCategoryField(String categoryField) throws DataAccessException {

		return findCategoryByCategoryField(categoryField, -1, -1);
	}

	/**
	 * JPQL Query - findCategoryByCategoryField
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Category> findCategoryByCategoryField(String categoryField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCategoryByCategoryField", startResult, maxRows, categoryField);
		return new LinkedHashSet<Category>(query.getResultList());
	}

	/**
	 * JPQL Query - findCategoryByPrimaryKey
	 *
	 */
	@Transactional
	public Category findCategoryByPrimaryKey(Integer id) throws DataAccessException {

		return findCategoryByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findCategoryByPrimaryKey
	 *
	 */

	@Transactional
	public Category findCategoryByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCategoryByPrimaryKey", startResult, maxRows, id);
			return (edu.yangsheng.domain.Category) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllCategorys
	 *
	 */
	@Transactional
	public Set<Category> findAllCategorys() throws DataAccessException {

		return findAllCategorys(-1, -1);
	}

	/**
	 * JPQL Query - findAllCategorys
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Category> findAllCategorys(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllCategorys", startResult, maxRows);
		return new LinkedHashSet<Category>(query.getResultList());
	}

	/**
	 * JPQL Query - findCategoryByDescrib
	 *
	 */
	@Transactional
	public Set<Category> findCategoryByDescrib(String describ) throws DataAccessException {

		return findCategoryByDescrib(describ, -1, -1);
	}

	/**
	 * JPQL Query - findCategoryByDescrib
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Category> findCategoryByDescrib(String describ, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCategoryByDescrib", startResult, maxRows, describ);
		return new LinkedHashSet<Category>(query.getResultList());
	}

	/**
	 * JPQL Query - findCategoryByDescribContaining
	 *
	 */
	@Transactional
	public Set<Category> findCategoryByDescribContaining(String describ) throws DataAccessException {

		return findCategoryByDescribContaining(describ, -1, -1);
	}

	/**
	 * JPQL Query - findCategoryByDescribContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Category> findCategoryByDescribContaining(String describ, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCategoryByDescribContaining", startResult, maxRows, describ);
		return new LinkedHashSet<Category>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Category entity) {
		return true;
	}
}
