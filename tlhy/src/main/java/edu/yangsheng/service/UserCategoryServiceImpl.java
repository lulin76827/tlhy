package edu.yangsheng.service;

import edu.yangsheng.dao.CategoryDAO;
import edu.yangsheng.dao.UserCategoryDAO;
import edu.yangsheng.dao.UserDAO;

import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.User;
import edu.yangsheng.domain.UserCategory;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for UserCategory entities
 * 
 */

@Service("UserCategoryService")
@Transactional
public class UserCategoryServiceImpl implements UserCategoryService {

	/**
	 * DAO injected by Spring that manages Category entities
	 * 
	 */
	@Autowired
	private CategoryDAO categoryDAO;

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
	 * Instantiates a new UserCategoryServiceImpl.
	 *
	 */
	public UserCategoryServiceImpl() {
	}

	/**
	 * Save an existing User entity
	 * 
	 */
	@Transactional
	public UserCategory saveUserCategoryUser(Integer id, User related_user) {
		UserCategory usercategory = userCategoryDAO.findUserCategoryByPrimaryKey(id, -1, -1);
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
		}

		usercategory.setUser(related_user);
		related_user.getUserCategories().add(usercategory);
		usercategory = userCategoryDAO.store(usercategory);
		userCategoryDAO.flush();

		related_user = userDAO.store(related_user);
		userDAO.flush();

		return usercategory;
	}

	/**
	 * Delete an existing User entity
	 * 
	 */
	@Transactional
	public UserCategory deleteUserCategoryUser(Integer usercategory_id, Integer related_user_id) {
		UserCategory usercategory = userCategoryDAO.findUserCategoryByPrimaryKey(usercategory_id, -1, -1);
		User related_user = userDAO.findUserByPrimaryKey(related_user_id, -1, -1);

		usercategory.setUser(null);
		related_user.getUserCategories().remove(usercategory);
		usercategory = userCategoryDAO.store(usercategory);
		userCategoryDAO.flush();

		related_user = userDAO.store(related_user);
		userDAO.flush();

		userDAO.remove(related_user);
		userDAO.flush();

		return usercategory;
	}

	/**
	 * Delete an existing UserCategory entity
	 * 
	 */
	@Transactional
	public void deleteUserCategory(UserCategory usercategory) {
		userCategoryDAO.remove(usercategory);
		userCategoryDAO.flush();
	}

	/**
	 * Save an existing UserCategory entity
	 * 
	 */
	@Transactional
	public void saveUserCategory(UserCategory usercategory) {
		UserCategory existingUserCategory = userCategoryDAO.findUserCategoryByPrimaryKey(usercategory.getId());

		if (existingUserCategory != null) {
			if (existingUserCategory != usercategory) {
				existingUserCategory.setId(usercategory.getId());
				existingUserCategory.setScore(usercategory.getScore());
				existingUserCategory.setCreateTime(usercategory.getCreateTime());
			}
			usercategory = userCategoryDAO.store(existingUserCategory);
		} else {
			usercategory = userCategoryDAO.store(usercategory);
		}
		userCategoryDAO.flush();
	}

	/**
	 */
	@Transactional
	public UserCategory findUserCategoryByPrimaryKey(Integer id) {
		return userCategoryDAO.findUserCategoryByPrimaryKey(id);
	}

	/**
	 * Load an existing UserCategory entity
	 * 
	 */
	@Transactional
	public Set<UserCategory> loadUserCategorys() {
		return userCategoryDAO.findAllUserCategorys();
	}

	/**
	 * Save an existing Category entity
	 * 
	 */
	@Transactional
	public UserCategory saveUserCategoryCategory(Integer id, Category related_category) {
		UserCategory usercategory = userCategoryDAO.findUserCategoryByPrimaryKey(id, -1, -1);
		Category existingcategory = categoryDAO.findCategoryByPrimaryKey(related_category.getId());

		// copy into the existing record to preserve existing relationships
		if (existingcategory != null) {
			existingcategory.setId(related_category.getId());
			existingcategory.setCategoryField(related_category.getCategoryField());
			existingcategory.setDescrib(related_category.getDescrib());
			related_category = existingcategory;
		}

		usercategory.setCategory(related_category);
		related_category.getUserCategories().add(usercategory);
		usercategory = userCategoryDAO.store(usercategory);
		userCategoryDAO.flush();

		related_category = categoryDAO.store(related_category);
		categoryDAO.flush();

		return usercategory;
	}

	/**
	 * Delete an existing Category entity
	 * 
	 */
	@Transactional
	public UserCategory deleteUserCategoryCategory(Integer usercategory_id, Integer related_category_id) {
		UserCategory usercategory = userCategoryDAO.findUserCategoryByPrimaryKey(usercategory_id, -1, -1);
		Category related_category = categoryDAO.findCategoryByPrimaryKey(related_category_id, -1, -1);

		usercategory.setCategory(null);
		related_category.getUserCategories().remove(usercategory);
		usercategory = userCategoryDAO.store(usercategory);
		userCategoryDAO.flush();

		related_category = categoryDAO.store(related_category);
		categoryDAO.flush();

		categoryDAO.remove(related_category);
		categoryDAO.flush();

		return usercategory;
	}

	/**
	 * Return all UserCategory entity
	 * 
	 */
	@Transactional
	public List<UserCategory> findAllUserCategorys(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<UserCategory>(userCategoryDAO.findAllUserCategorys(startResult, maxRows));
	}

	/**
	 * Return a count of all UserCategory entity
	 * 
	 */
	@Transactional
	public Integer countUserCategorys() {
		return ((Long) userCategoryDAO.createQuerySingleResult("select count(o) from UserCategory o").getSingleResult()).intValue();
	}
}
