package edu.yangsheng.service;

import edu.yangsheng.domain.Account;
import edu.yangsheng.domain.Answer;
import edu.yangsheng.domain.User;
import edu.yangsheng.domain.UserCategory;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for User entities
 * 
 */
public interface UserService {

	/**
	 * Delete an existing Answer entity
	 * 
	 */
	public User deleteUserAnswers(Integer user_id, Integer related_answers_id);

	/**
	 * Save an existing User entity
	 * 
	 */
	public void saveUser(User user);

	/**
	 * Save an existing Answer entity
	 * 
	 */
	public User saveUserAnswers(Integer id, Answer related_answers);

	/**
	 * Save an existing Account entity
	 * 
	 */
	public User saveUserAccounts(Integer id_1, Account related_accounts);

	/**
	 */
	public User findUserByPrimaryKey(Integer id_2);

	/**
	 * Return all User entity
	 * 
	 */
	public List<User> findAllUsers(Integer startResult, Integer maxRows);

	/**
	 * Save an existing UserCategory entity
	 * 
	 */
	public User saveUserUserCategories(Integer id_3, UserCategory related_usercategories);

	/**
	 * Delete an existing UserCategory entity
	 * 
	 */
	public User deleteUserUserCategories(Integer user_id_1, Integer related_usercategories_id);

	/**
	 * Delete an existing User entity
	 * 
	 */
	public void deleteUser(User user_1);

	/**
	 * Return a count of all User entity
	 * 
	 */
	public Integer countUsers();

	/**
	 * Delete an existing Account entity
	 * 
	 */
	public User deleteUserAccounts(Integer user_id_2, Integer related_accounts_id);

	/**
	 * Load an existing User entity
	 * 
	 */
	public Set<User> loadUsers();
}