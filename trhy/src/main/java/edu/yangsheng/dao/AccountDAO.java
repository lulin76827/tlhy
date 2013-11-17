package edu.yangsheng.dao;

import edu.yangsheng.domain.Account;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Account entities.
 * 
 */
public interface AccountDAO extends JpaDao<Account> {

	/**
	 * JPQL Query - findAccountByUsername
	 *
	 */
	public Set<Account> findAccountByUsername(String username) throws DataAccessException;

	/**
	 * JPQL Query - findAccountByUsername
	 *
	 */
	public Set<Account> findAccountByUsername(String username, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllAccounts
	 *
	 */
	public Set<Account> findAllAccounts() throws DataAccessException;

	/**
	 * JPQL Query - findAllAccounts
	 *
	 */
	public Set<Account> findAllAccounts(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountById
	 *
	 */
	public Account findAccountById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findAccountById
	 *
	 */
	public Account findAccountById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountByPasswordContaining
	 *
	 */
	public Set<Account> findAccountByPasswordContaining(String password) throws DataAccessException;

	/**
	 * JPQL Query - findAccountByPasswordContaining
	 *
	 */
	public Set<Account> findAccountByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountByAdministrator
	 *
	 */
	public Set<Account> findAccountByAdministrator(Boolean administrator) throws DataAccessException;

	/**
	 * JPQL Query - findAccountByAdministrator
	 *
	 */
	public Set<Account> findAccountByAdministrator(Boolean administrator, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountByPassword
	 *
	 */
	public Set<Account> findAccountByPassword(String password_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountByPassword
	 *
	 */
	public Set<Account> findAccountByPassword(String password_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountByUsernameContaining
	 *
	 */
	public Set<Account> findAccountByUsernameContaining(String username_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountByUsernameContaining
	 *
	 */
	public Set<Account> findAccountByUsernameContaining(String username_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountByPrimaryKey
	 *
	 */
	public Account findAccountByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountByPrimaryKey
	 *
	 */
	public Account findAccountByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}