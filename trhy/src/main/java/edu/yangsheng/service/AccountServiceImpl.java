package edu.yangsheng.service;

import edu.yangsheng.dao.AccountDAO;
import edu.yangsheng.dao.UserDAO;

import edu.yangsheng.domain.Account;
import edu.yangsheng.domain.User;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Account entities
 * 
 */

@Service("AccountService")
@Transactional
public class AccountServiceImpl implements AccountService {

	/**
	 * DAO injected by Spring that manages Account entities
	 * 
	 */
	@Autowired
	private AccountDAO accountDAO;

	/**
	 * DAO injected by Spring that manages User entities
	 * 
	 */
	@Autowired
	private UserDAO userDAO;

	/**
	 * Instantiates a new AccountServiceImpl.
	 *
	 */
	public AccountServiceImpl() {
	}

	/**
	 * Delete an existing User entity
	 * 
	 */
	@Transactional
	public Account deleteAccountUser(Integer account_id, Integer related_user_id) {
		Account account = accountDAO.findAccountByPrimaryKey(account_id, -1, -1);
		User related_user = userDAO.findUserByPrimaryKey(related_user_id, -1, -1);

		account.setUser(null);
		related_user.getAccounts().remove(account);
		account = accountDAO.store(account);
		accountDAO.flush();

		related_user = userDAO.store(related_user);
		userDAO.flush();

		userDAO.remove(related_user);
		userDAO.flush();

		return account;
	}

	/**
	 * Save an existing User entity
	 * 
	 */
	@Transactional
	public Account saveAccountUser(Integer id, User related_user) {
		Account account = accountDAO.findAccountByPrimaryKey(id, -1, -1);
		User existinguser = userDAO.findUserByPrimaryKey(related_user.getId());

		// copy into the existing record to preserve existing relationships
		if (existinguser != null) {
			existinguser.setId(related_user.getId());
			existinguser.setBirthday(related_user.getBirthday());
			existinguser.setBirthplace(related_user.getBirthplace());
			existinguser.setCurrentAddress(related_user.getCurrentAddress());
			existinguser.setEmail(related_user.getEmail());
			existinguser.setInterest(related_user.getInterest());
			existinguser.setMobile(related_user.getMobile());
			existinguser.setName(related_user.getName());
			existinguser.setSex(related_user.getSex());
			existinguser.setSleepTime(related_user.getSleepTime());
			related_user = existinguser;
		} else {
			related_user = userDAO.store(related_user);
			userDAO.flush();
		}

		account.setUser(related_user);
		related_user.getAccounts().add(account);
		account = accountDAO.store(account);
		accountDAO.flush();

		related_user = userDAO.store(related_user);
		userDAO.flush();

		return account;
	}

	/**
	 * Delete an existing Account entity
	 * 
	 */
	@Transactional
	public void deleteAccount(Account account) {
		accountDAO.remove(account);
		accountDAO.flush();
	}

	/**
	 */
	@Transactional
	public Account findAccountByPrimaryKey(Integer id) {
		return accountDAO.findAccountByPrimaryKey(id);
	}

	/**
	 * Return all Account entity
	 * 
	 */
	@Transactional
	public List<Account> findAllAccounts(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Account>(accountDAO.findAllAccounts(startResult, maxRows));
	}

	/**
	 * Load an existing Account entity
	 * 
	 */
	@Transactional
	public Set<Account> loadAccounts() {
		return accountDAO.findAllAccounts();
	}

	/**
	 * Save an existing Account entity
	 * 
	 */
	@Transactional
	public void saveAccount(Account account) {
		Account existingAccount = accountDAO.findAccountByPrimaryKey(account.getId());

		if (existingAccount != null) {
			if (existingAccount != account) {
				existingAccount.setId(account.getId());
				existingAccount.setAdministrator(account.getAdministrator());
				existingAccount.setPassword(account.getPassword());
				existingAccount.setUsername(account.getUsername());
			}
			account = accountDAO.store(existingAccount);
		} else {
			account = accountDAO.store(account);
		}
		accountDAO.flush();
	}

	/**
	 * Return a count of all Account entity
	 * 
	 */
	@Transactional
	public Integer countAccounts() {
		return ((Long) accountDAO.createQuerySingleResult("select count(o) from Account o").getSingleResult()).intValue();
	}
}
