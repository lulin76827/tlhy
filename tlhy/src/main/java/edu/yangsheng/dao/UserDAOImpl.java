package edu.yangsheng.dao;

import edu.yangsheng.domain.User;

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
 * DAO to manage User entities.
 * 
 */
@Repository("UserDAO")
@Transactional
public class UserDAOImpl extends AbstractJpaDao<User> implements UserDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { User.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_jdbc_Driver
	 *
	 */
	@PersistenceContext(unitName = "com_mysql_jdbc_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new UserDAOImpl
	 *
	 */
	public UserDAOImpl() {
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
	 * JPQL Query - findUserByPrimaryKey
	 *
	 */
	@Transactional
	public User findUserByPrimaryKey(Integer id) throws DataAccessException {

		return findUserByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findUserByPrimaryKey
	 *
	 */

	@Transactional
	public User findUserByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUserByPrimaryKey", startResult, maxRows, id);
			return (edu.yangsheng.domain.User) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUserByInterest
	 *
	 */
	@Transactional
	public Set<User> findUserByInterest(String interest) throws DataAccessException {

		return findUserByInterest(interest, -1, -1);
	}

	/**
	 * JPQL Query - findUserByInterest
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByInterest(String interest, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByInterest", startResult, maxRows, interest);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByBirthplaceContaining
	 *
	 */
	@Transactional
	public Set<User> findUserByBirthplaceContaining(String birthplace) throws DataAccessException {

		return findUserByBirthplaceContaining(birthplace, -1, -1);
	}

	/**
	 * JPQL Query - findUserByBirthplaceContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByBirthplaceContaining(String birthplace, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByBirthplaceContaining", startResult, maxRows, birthplace);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByMobileContaining
	 *
	 */
	@Transactional
	public Set<User> findUserByMobileContaining(String mobile) throws DataAccessException {

		return findUserByMobileContaining(mobile, -1, -1);
	}

	/**
	 * JPQL Query - findUserByMobileContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByMobileContaining(String mobile, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByMobileContaining", startResult, maxRows, mobile);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByNameContaining
	 *
	 */
	@Transactional
	public Set<User> findUserByNameContaining(String name) throws DataAccessException {

		return findUserByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findUserByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByMobile
	 *
	 */
	@Transactional
	public Set<User> findUserByMobile(String mobile) throws DataAccessException {

		return findUserByMobile(mobile, -1, -1);
	}

	/**
	 * JPQL Query - findUserByMobile
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByMobile(String mobile, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByMobile", startResult, maxRows, mobile);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByEmail
	 *
	 */
	@Transactional
	public Set<User> findUserByEmail(String email) throws DataAccessException {

		return findUserByEmail(email, -1, -1);
	}

	/**
	 * JPQL Query - findUserByEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByEmail(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByEmail", startResult, maxRows, email);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserBySex
	 *
	 */
	@Transactional
	public Set<User> findUserBySex(Boolean sex) throws DataAccessException {

		return findUserBySex(sex, -1, -1);
	}

	/**
	 * JPQL Query - findUserBySex
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserBySex(Boolean sex, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserBySex", startResult, maxRows, sex);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByEmailContaining
	 *
	 */
	@Transactional
	public Set<User> findUserByEmailContaining(String email) throws DataAccessException {

		return findUserByEmailContaining(email, -1, -1);
	}

	/**
	 * JPQL Query - findUserByEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByEmailContaining", startResult, maxRows, email);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByBirthplace
	 *
	 */
	@Transactional
	public Set<User> findUserByBirthplace(String birthplace) throws DataAccessException {

		return findUserByBirthplace(birthplace, -1, -1);
	}

	/**
	 * JPQL Query - findUserByBirthplace
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByBirthplace(String birthplace, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByBirthplace", startResult, maxRows, birthplace);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByBirthdayBefore
	 *
	 */
	@Transactional
	public Set<User> findUserByBirthdayBefore(java.util.Calendar birthday) throws DataAccessException {

		return findUserByBirthdayBefore(birthday, -1, -1);
	}

	/**
	 * JPQL Query - findUserByBirthdayBefore
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByBirthdayBefore(java.util.Calendar birthday, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByBirthdayBefore", startResult, maxRows, birthday);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByBirthdayAfter
	 *
	 */
	@Transactional
	public Set<User> findUserByBirthdayAfter(java.util.Calendar birthday) throws DataAccessException {

		return findUserByBirthdayAfter(birthday, -1, -1);
	}

	/**
	 * JPQL Query - findUserByBirthdayAfter
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByBirthdayAfter(java.util.Calendar birthday, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByBirthdayAfter", startResult, maxRows, birthday);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByCurrentAddressContaining
	 *
	 */
	@Transactional
	public Set<User> findUserByCurrentAddressContaining(String currentAddress) throws DataAccessException {

		return findUserByCurrentAddressContaining(currentAddress, -1, -1);
	}

	/**
	 * JPQL Query - findUserByCurrentAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByCurrentAddressContaining(String currentAddress, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByCurrentAddressContaining", startResult, maxRows, currentAddress);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllUsers
	 *
	 */
	@Transactional
	public Set<User> findAllUsers() throws DataAccessException {

		return findAllUsers(-1, -1);
	}

	/**
	 * JPQL Query - findAllUsers
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findAllUsers(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllUsers", startResult, maxRows);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserBySleepTime
	 *
	 */
	@Transactional
	public Set<User> findUserBySleepTime(Integer sleepTime) throws DataAccessException {

		return findUserBySleepTime(sleepTime, -1, -1);
	}

	/**
	 * JPQL Query - findUserBySleepTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserBySleepTime(Integer sleepTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserBySleepTime", startResult, maxRows, sleepTime);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByCurrentAddress
	 *
	 */
	@Transactional
	public Set<User> findUserByCurrentAddress(String currentAddress) throws DataAccessException {

		return findUserByCurrentAddress(currentAddress, -1, -1);
	}

	/**
	 * JPQL Query - findUserByCurrentAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByCurrentAddress(String currentAddress, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByCurrentAddress", startResult, maxRows, currentAddress);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByInterestContaining
	 *
	 */
	@Transactional
	public Set<User> findUserByInterestContaining(String interest) throws DataAccessException {

		return findUserByInterestContaining(interest, -1, -1);
	}

	/**
	 * JPQL Query - findUserByInterestContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByInterestContaining(String interest, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByInterestContaining", startResult, maxRows, interest);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByName
	 *
	 */
	@Transactional
	public Set<User> findUserByName(String name) throws DataAccessException {

		return findUserByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findUserByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByName", startResult, maxRows, name);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserById
	 *
	 */
	@Transactional
	public User findUserById(Integer id) throws DataAccessException {

		return findUserById(id, -1, -1);
	}

	/**
	 * JPQL Query - findUserById
	 *
	 */

	@Transactional
	public User findUserById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUserById", startResult, maxRows, id);
			return (edu.yangsheng.domain.User) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUserByBirthday
	 *
	 */
	@Transactional
	public Set<User> findUserByBirthday(java.util.Calendar birthday) throws DataAccessException {

		return findUserByBirthday(birthday, -1, -1);
	}

	/**
	 * JPQL Query - findUserByBirthday
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByBirthday(java.util.Calendar birthday, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByBirthday", startResult, maxRows, birthday);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(User entity) {
		return true;
	}
}
