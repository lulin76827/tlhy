package edu.yangsheng.service;

import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.User;
import edu.yangsheng.domain.UserCategory;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./src/main/resources/tlhy-security-context.xml",
		"file:./src/main/resources/tlhy-service-context.xml",
		"file:./src/main/resources/tlhy-dao-context.xml",
		"file:./src/main/resources/tlhy-web-context.xml" })
@Transactional
public class UserCategoryServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected UserCategoryService service;

	/**
	 * Instantiates a new UserCategoryServiceTest.
	 *
	 */
	public UserCategoryServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing User entity
	 * 
	 */
	@Test
	public void saveUserCategoryUser() {
		// TODO: JUnit - Populate test inputs for operation: saveUserCategoryUser 
		Integer id = 0;
		User related_user = new edu.yangsheng.domain.User();
		UserCategory response = null;
		response = service.saveUserCategoryUser(id, related_user);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUserCategoryUser
	}

	/**
	 * Operation Unit Test
	 * Delete an existing User entity
	 * 
	 */
	@Test
	public void deleteUserCategoryUser() {
		// TODO: JUnit - Populate test inputs for operation: deleteUserCategoryUser 
		Integer usercategory_id = 0;
		Integer related_user_id = 0;
		UserCategory response = null;
		response = service.deleteUserCategoryUser(usercategory_id, related_user_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUserCategoryUser
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UserCategory entity
	 * 
	 */
	@Test
	public void deleteUserCategory() {
		// TODO: JUnit - Populate test inputs for operation: deleteUserCategory 
		UserCategory usercategory = new edu.yangsheng.domain.UserCategory();
		service.deleteUserCategory(usercategory);
	}

	/**
	 * Operation Unit Test
	 * Save an existing UserCategory entity
	 * 
	 */
	@Test
	public void saveUserCategory() {
		// TODO: JUnit - Populate test inputs for operation: saveUserCategory 
		UserCategory usercategory_1 = new edu.yangsheng.domain.UserCategory();
		service.saveUserCategory(usercategory_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findUserCategoryByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findUserCategoryByPrimaryKey 
		Integer id_1 = 0;
		UserCategory response = null;
		response = service.findUserCategoryByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findUserCategoryByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Load an existing UserCategory entity
	 * 
	 */
	@Test
	public void loadUserCategorys() {
		Set<UserCategory> response = null;
		response = service.loadUserCategorys();
		// TODO: JUnit - Add assertions to test outputs of operation: loadUserCategorys
	}

	/**
	 * Operation Unit Test
	 * Save an existing Category entity
	 * 
	 */
	@Test
	public void saveUserCategoryCategory() {
		// TODO: JUnit - Populate test inputs for operation: saveUserCategoryCategory 
		Integer id_2 = 0;
		Category related_category = new edu.yangsheng.domain.Category();
		UserCategory response = null;
		response = service.saveUserCategoryCategory(id_2, related_category);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUserCategoryCategory
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Category entity
	 * 
	 */
	@Test
	public void deleteUserCategoryCategory() {
		// TODO: JUnit - Populate test inputs for operation: deleteUserCategoryCategory 
		Integer usercategory_id_1 = 0;
		Integer related_category_id = 0;
		UserCategory response = null;
		response = service.deleteUserCategoryCategory(usercategory_id_1, related_category_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUserCategoryCategory
	}

	/**
	 * Operation Unit Test
	 * Return all UserCategory entity
	 * 
	 */
	@Test
	public void findAllUserCategorys() {
		// TODO: JUnit - Populate test inputs for operation: findAllUserCategorys 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<UserCategory> response = null;
		response = service.findAllUserCategorys(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllUserCategorys
	}

	/**
	 * Operation Unit Test
	 * Return a count of all UserCategory entity
	 * 
	 */
	@Test
	public void countUserCategorys() {
		Integer response = null;
		response = service.countUserCategorys();
		// TODO: JUnit - Add assertions to test outputs of operation: countUserCategorys
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
