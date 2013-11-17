package edu.yangsheng.service;

import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.User;
import edu.yangsheng.domain.UserCategory;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for UserCategory entities
 * 
 */
public interface UserCategoryService {

	/**
	 * Save an existing User entity
	 * 
	 */
	public UserCategory saveUserCategoryUser(Integer id, User related_user);

	/**
	 * Delete an existing User entity
	 * 
	 */
	public UserCategory deleteUserCategoryUser(Integer usercategory_id, Integer related_user_id);

	/**
	 * Delete an existing UserCategory entity
	 * 
	 */
	public void deleteUserCategory(UserCategory usercategory);

	/**
	 * Save an existing UserCategory entity
	 * 
	 */
	public void saveUserCategory(UserCategory usercategory_1);

	/**
	 */
	public UserCategory findUserCategoryByPrimaryKey(Integer id_1);

	/**
	 * Load an existing UserCategory entity
	 * 
	 */
	public Set<UserCategory> loadUserCategorys();

	/**
	 * Save an existing Category entity
	 * 
	 */
	public UserCategory saveUserCategoryCategory(Integer id_2, Category related_category);

	/**
	 * Delete an existing Category entity
	 * 
	 */
	public UserCategory deleteUserCategoryCategory(Integer usercategory_id_1, Integer related_category_id);

	/**
	 * Return all UserCategory entity
	 * 
	 */
	public List<UserCategory> findAllUserCategorys(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all UserCategory entity
	 * 
	 */
	public Integer countUserCategorys();
}