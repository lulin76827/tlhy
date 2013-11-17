package edu.yangsheng.dao;

import edu.yangsheng.domain.User;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage User entities.
 * 
 */
public interface UserDAO extends JpaDao<User> {

	/**
	 * JPQL Query - findUserByPrimaryKey
	 *
	 */
	public User findUserByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findUserByPrimaryKey
	 *
	 */
	public User findUserByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByInterest
	 *
	 */
	public Set<User> findUserByInterest(String interest) throws DataAccessException;

	/**
	 * JPQL Query - findUserByInterest
	 *
	 */
	public Set<User> findUserByInterest(String interest, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByBirthplaceContaining
	 *
	 */
	public Set<User> findUserByBirthplaceContaining(String birthplace) throws DataAccessException;

	/**
	 * JPQL Query - findUserByBirthplaceContaining
	 *
	 */
	public Set<User> findUserByBirthplaceContaining(String birthplace, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByMobileContaining
	 *
	 */
	public Set<User> findUserByMobileContaining(String mobile) throws DataAccessException;

	/**
	 * JPQL Query - findUserByMobileContaining
	 *
	 */
	public Set<User> findUserByMobileContaining(String mobile, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByNameContaining
	 *
	 */
	public Set<User> findUserByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findUserByNameContaining
	 *
	 */
	public Set<User> findUserByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByMobile
	 *
	 */
	public Set<User> findUserByMobile(String mobile_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserByMobile
	 *
	 */
	public Set<User> findUserByMobile(String mobile_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByEmail
	 *
	 */
	public Set<User> findUserByEmail(String email) throws DataAccessException;

	/**
	 * JPQL Query - findUserByEmail
	 *
	 */
	public Set<User> findUserByEmail(String email, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserBySex
	 *
	 */
	public Set<User> findUserBySex(Boolean sex) throws DataAccessException;

	/**
	 * JPQL Query - findUserBySex
	 *
	 */
	public Set<User> findUserBySex(Boolean sex, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByEmailContaining
	 *
	 */
	public Set<User> findUserByEmailContaining(String email_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserByEmailContaining
	 *
	 */
	public Set<User> findUserByEmailContaining(String email_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByBirthplace
	 *
	 */
	public Set<User> findUserByBirthplace(String birthplace_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserByBirthplace
	 *
	 */
	public Set<User> findUserByBirthplace(String birthplace_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByBirthdayBefore
	 *
	 */
	public Set<User> findUserByBirthdayBefore(java.util.Calendar birthday) throws DataAccessException;

	/**
	 * JPQL Query - findUserByBirthdayBefore
	 *
	 */
	public Set<User> findUserByBirthdayBefore(Calendar birthday, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByBirthdayAfter
	 *
	 */
	public Set<User> findUserByBirthdayAfter(java.util.Calendar birthday_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserByBirthdayAfter
	 *
	 */
	public Set<User> findUserByBirthdayAfter(Calendar birthday_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByCurrentAddressContaining
	 *
	 */
	public Set<User> findUserByCurrentAddressContaining(String currentAddress) throws DataAccessException;

	/**
	 * JPQL Query - findUserByCurrentAddressContaining
	 *
	 */
	public Set<User> findUserByCurrentAddressContaining(String currentAddress, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllUsers
	 *
	 */
	public Set<User> findAllUsers() throws DataAccessException;

	/**
	 * JPQL Query - findAllUsers
	 *
	 */
	public Set<User> findAllUsers(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserBySleepTime
	 *
	 */
	public Set<User> findUserBySleepTime(Integer sleepTime) throws DataAccessException;

	/**
	 * JPQL Query - findUserBySleepTime
	 *
	 */
	public Set<User> findUserBySleepTime(Integer sleepTime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByCurrentAddress
	 *
	 */
	public Set<User> findUserByCurrentAddress(String currentAddress_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserByCurrentAddress
	 *
	 */
	public Set<User> findUserByCurrentAddress(String currentAddress_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByInterestContaining
	 *
	 */
	public Set<User> findUserByInterestContaining(String interest_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserByInterestContaining
	 *
	 */
	public Set<User> findUserByInterestContaining(String interest_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByName
	 *
	 */
	public Set<User> findUserByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserByName
	 *
	 */
	public Set<User> findUserByName(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserById
	 *
	 */
	public User findUserById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserById
	 *
	 */
	public User findUserById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByBirthday
	 *
	 */
	public Set<User> findUserByBirthday(java.util.Calendar birthday_2) throws DataAccessException;

	/**
	 * JPQL Query - findUserByBirthday
	 *
	 */
	public Set<User> findUserByBirthday(Calendar birthday_2, int startResult, int maxRows) throws DataAccessException;

}