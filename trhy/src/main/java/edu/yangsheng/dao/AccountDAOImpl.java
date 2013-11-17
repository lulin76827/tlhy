package edu.yangsheng.dao;

import edu.yangsheng.domain.Account;

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
 * DAO to manage Account entities.
 * 
 */
@Repository("AccountDAO")
@Transactional
public class AccountDAOImpl extends AbstractJpaDao<Account> implements
		AccountDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Account.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_jdbc_Driver
	 *
	 */
	@PersistenceContext(unitName = "com_mysql_jdbc_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new AccountDAOImpl
	 *
	 */
	public AccountDAOImpl() {
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
	 * JPQL Query - findAccountByUsername
	 *
	 */
	@Transactional
	public Set<Account> findAccountByUsername(String username) throws DataAccessException {

		return findAccountByUsername(username, -1, -1);
	}

	/**
	 * JPQL Query - findAccountByUsername
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Account> findAccountByUsername(String username, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountByUsername", startResult, maxRows, username);
		return new LinkedHashSet<Account>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllAccounts
	 *
	 */
	@Transactional
	public Set<Account> findAllAccounts() throws DataAccessException {

		return findAllAccounts(-1, -1);
	}

	/**
	 * JPQL Query - findAllAccounts
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Account> findAllAccounts(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllAccounts", startResult, maxRows);
		return new LinkedHashSet<Account>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountById
	 *
	 */
	@Transactional
	public Account findAccountById(Integer id) throws DataAccessException {

		return findAccountById(id, -1, -1);
	}

	/**
	 * JPQL Query - findAccountById
	 *
	 */

	@Transactional
	public Account findAccountById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAccountById", startResult, maxRows, id);
			return (edu.yangsheng.domain.Account) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAccountByPasswordContaining
	 *
	 */
	@Transactional
	public Set<Account> findAccountByPasswordContaining(String password) throws DataAccessException {

		return findAccountByPasswordContaining(password, -1, -1);
	}

	/**
	 * JPQL Query - findAccountByPasswordContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Account> findAccountByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountByPasswordContaining", startResult, maxRows, password);
		return new LinkedHashSet<Account>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountByAdministrator
	 *
	 */
	@Transactional
	public Set<Account> findAccountByAdministrator(Boolean administrator) throws DataAccessException {

		return findAccountByAdministrator(administrator, -1, -1);
	}

	/**
	 * JPQL Query - findAccountByAdministrator
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Account> findAccountByAdministrator(Boolean administrator, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountByAdministrator", startResult, maxRows, administrator);
		return new LinkedHashSet<Account>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountByPassword
	 *
	 */
	@Transactional
	public Set<Account> findAccountByPassword(String password) throws DataAccessException {

		return findAccountByPassword(password, -1, -1);
	}

	/**
	 * JPQL Query - findAccountByPassword
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Account> findAccountByPassword(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountByPassword", startResult, maxRows, password);
		return new LinkedHashSet<Account>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountByUsernameContaining
	 *
	 */
	@Transactional
	public Set<Account> findAccountByUsernameContaining(String username) throws DataAccessException {

		return findAccountByUsernameContaining(username, -1, -1);
	}

	/**
	 * JPQL Query - findAccountByUsernameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Account> findAccountByUsernameContaining(String username, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountByUsernameContaining", startResult, maxRows, username);
		return new LinkedHashSet<Account>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountByPrimaryKey
	 *
	 */
	@Transactional
	public Account findAccountByPrimaryKey(Integer id) throws DataAccessException {

		return findAccountByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findAccountByPrimaryKey
	 *
	 */

	@Transactional
	public Account findAccountByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAccountByPrimaryKey", startResult, maxRows, id);
			return (edu.yangsheng.domain.Account) query.getSingleResult();
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
	public boolean canBeMerged(Account entity) {
		return true;
	}
}
