package edu.yangsheng.service;

import edu.yangsheng.dao.AccountDAO;
import edu.yangsheng.dao.AnswerDAO;
import edu.yangsheng.dao.UserCategoryDAO;
import edu.yangsheng.dao.UserDAO;

import edu.yangsheng.domain.Account;
import edu.yangsheng.domain.Answer;
import edu.yangsheng.domain.User;
import edu.yangsheng.domain.UserCategory;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for User entities
 * 
 */

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {

	/**
	 * DAO injected by Spring that manages Account entities
	 * 
	 */
	@Autowired
	private AccountDAO accountDAO;

	/**
	 * DAO injected by Spring that manages Answer entities
	 * 
	 */
	@Autowired
	private AnswerDAO answerDAO;

	/**
	 * DAO injected by Spring that manages UserCategory entities
	 * 
	 */
	@Autowired
	private UserCategoryDAO userCategoryDAO;

	/**
	 * DAO injected by Spring that manages User entities
	 * 
	 */
	@Autowired
	private UserDAO userDAO;

	/**
	 * Instantiates a new UserServiceImpl.
	 *
	 */
	public UserServiceImpl() {
	}

	/**
	 * Delete an existing Answer entity
	 * 
	 */
	@Transactional
	public User deleteUserAnswers(Integer user_id, Integer related_answers_id) {
		Answer related_answers = answerDAO.findAnswerByPrimaryKey(related_answers_id, -1, -1);

		User user = userDAO.findUserByPrimaryKey(user_id, -1, -1);

		related_answers.setUser(null);
		user.getAnswers().remove(related_answers);

		answerDAO.remove(related_answers);
		answerDAO.flush();

		return user;
	}

	/**
	 * Save an existing User entity
	 * 
	 */
	@Transactional
	public void saveUser(User user) {
		User existingUser = userDAO.findUserByPrimaryKey(user.getId());

		if (existingUser != null) {
			if (existingUser != user) {
				existingUser.setId(user.getId());
				existingUser.setBirthday(user.getBirthday());
				existingUser.setBirthplace(user.getBirthplace());
				existingUser.setCurrentAddress(user.getCurrentAddress());
				existingUser.setEmail(user.getEmail());
				existingUser.setInterest(user.getInterest());
				existingUser.setMobile(user.getMobile());
				existingUser.setName(user.getName());
				existingUser.setSex(user.getSex());
				existingUser.setSleepTime(user.getSleepTime());
			}
			user = userDAO.store(existingUser);
		} else {
			user = userDAO.store(user);
		}
		userDAO.flush();
	}

	/**
	 * Save an existing Answer entity
	 * 
	 */
	@Transactional
	public User saveUserAnswers(Integer id, Answer related_answers) {
		User user = userDAO.findUserByPrimaryKey(id, -1, -1);
		Answer existinganswers = answerDAO.findAnswerByPrimaryKey(related_answers.getId());

		// copy into the existing record to preserve existing relationships
		if (existinganswers != null) {
			existinganswers.setId(related_answers.getId());
			existinganswers.setRecord(related_answers.getRecord());
			existinganswers.setCreateTime(related_answers.getCreateTime());
			related_answers = existinganswers;
		}

		related_answers.setUser(user);
		user.getAnswers().add(related_answers);
		related_answers = answerDAO.store(related_answers);
		answerDAO.flush();

		user = userDAO.store(user);
		userDAO.flush();

		return user;
	}

	/**
	 * Save an existing Account entity
	 * 
	 */
	@Transactional
	public User saveUserAccounts(Integer id, Account related_accounts) {
		User user = userDAO.findUserByPrimaryKey(id, -1, -1);
		Account existingaccounts = accountDAO.findAccountByPrimaryKey(related_accounts.getId());

		// copy into the existing record to preserve existing relationships
		if (existingaccounts != null) {
			existingaccounts.setId(related_accounts.getId());
			existingaccounts.setAdministrator(related_accounts.getAdministrator());
			existingaccounts.setPassword(related_accounts.getPassword());
			existingaccounts.setUsername(related_accounts.getUsername());
			related_accounts = existingaccounts;
		} else {
			related_accounts = accountDAO.store(related_accounts);
			accountDAO.flush();
		}

		related_accounts.setUser(user);
		user.getAccounts().add(related_accounts);
		related_accounts = accountDAO.store(related_accounts);
		accountDAO.flush();

		user = userDAO.store(user);
		userDAO.flush();

		return user;
	}

	/**
	 */
	@Transactional
	public User findUserByPrimaryKey(Integer id) {
		return userDAO.findUserByPrimaryKey(id);
	}

	/**
	 * Return all User entity
	 * 
	 */
	@Transactional
	public List<User> findAllUsers(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<User>(userDAO.findAllUsers(startResult, maxRows));
	}

	/**
	 * Save an existing UserCategory entity
	 * 
	 */
	@Transactional
	public User saveUserUserCategories(Integer id, UserCategory related_usercategories) {
		User user = userDAO.findUserByPrimaryKey(id, -1, -1);
		UserCategory existinguserCategories = userCategoryDAO.findUserCategoryByPrimaryKey(related_usercategories.getId());

		// copy into the existing record to preserve existing relationships
		if (existinguserCategories != null) {
			existinguserCategories.setId(related_usercategories.getId());
			existinguserCategories.setScore(related_usercategories.getScore());
			existinguserCategories.setCreateTime(related_usercategories.getCreateTime());
			related_usercategories = existinguserCategories;
		}

		related_usercategories.setUser(user);
		user.getUserCategories().add(related_usercategories);
		related_usercategories = userCategoryDAO.store(related_usercategories);
		userCategoryDAO.flush();

		user = userDAO.store(user);
		userDAO.flush();

		return user;
	}

	/**
	 * Delete an existing UserCategory entity
	 * 
	 */
	@Transactional
	public User deleteUserUserCategories(Integer user_id, Integer related_usercategories_id) {
		UserCategory related_usercategories = userCategoryDAO.findUserCategoryByPrimaryKey(related_usercategories_id, -1, -1);

		User user = userDAO.findUserByPrimaryKey(user_id, -1, -1);

		related_usercategories.setUser(null);
		user.getUserCategories().remove(related_usercategories);

		userCategoryDAO.remove(related_usercategories);
		userCategoryDAO.flush();

		return user;
	}

	/**
	 * Delete an existing User entity
	 * 
	 */
	@Transactional
	public void deleteUser(User user) {
		userDAO.remove(user);
		userDAO.flush();
	}

	/**
	 * Return a count of all User entity
	 * 
	 */
	@Transactional
	public Integer countUsers() {
		return ((Long) userDAO.createQuerySingleResult("select count(o) from User o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Account entity
	 * 
	 */
	@Transactional
	public User deleteUserAccounts(Integer user_id, Integer related_accounts_id) {
		Account related_accounts = accountDAO.findAccountByPrimaryKey(related_accounts_id, -1, -1);

		User user = userDAO.findUserByPrimaryKey(user_id, -1, -1);

		related_accounts.setUser(null);
		user.getAccounts().remove(related_accounts);

		accountDAO.remove(related_accounts);
		accountDAO.flush();

		return user;
	}

	/**
	 * Load an existing User entity
	 * 
	 */
	@Transactional
	public Set<User> loadUsers() {
		return userDAO.findAllUsers();
	}
}
