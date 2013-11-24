package edu.yangsheng.service;

import edu.yangsheng.domain.Account;
import edu.yangsheng.domain.User;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Account entities
 * 
 */
public interface AccountService {

	/**
	 * Delete an existing User entity
	 * 
	 */
	public Account deleteAccountUser(Integer account_id, Integer related_user_id);

	/**
	 * Save an existing User entity
	 * 
	 */
	public Account saveAccountUser(Integer id, User related_user);

	/**
	 * Delete an existing Account entity
	 * 
	 */
	public void deleteAccount(Account account);

	/**
	 */
	public Account findAccountByPrimaryKey(Integer id_1);
	
	/**
	 */
	public Account findAccountByUsername(String username);

	/**
	 * Return all Account entity
	 * 
	 */
	public List<Account> findAllAccounts(Integer startResult, Integer maxRows);

	/**
	 * Load an existing Account entity
	 * 
	 */
	public Set<Account> loadAccounts();

	/**
	 * Save an existing Account entity
	 * 
	 */
	public void saveAccount(Account account_1);

	/**
	 * Return a count of all Account entity
	 * 
	 */
	public Integer countAccounts();
}