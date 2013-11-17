package edu.yangsheng.service;

import edu.yangsheng.domain.Account;
import edu.yangsheng.domain.Answer;
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
public class UserServiceTest {

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
	protected UserService service;

	/**
	 * Instantiates a new UserServiceTest.
	 *
	 */
	public UserServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Answer entity
	 * 
	 */
	@Test
	public void deleteUserAnswers() {
		// TODO: JUnit - Populate test inputs for operation: deleteUserAnswers 
		Integer user_id = 0;
		Integer related_answers_id = 0;
		User response = null;
		response = service.deleteUserAnswers(user_id, related_answers_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUserAnswers
	}

	/**
	 * Operation Unit Test
	 * Save an existing User entity
	 * 
	 */
	@Test
	public void saveUser() {
		// TODO: JUnit - Populate test inputs for operation: saveUser 
		User user = new edu.yangsheng.domain.User();
		service.saveUser(user);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Answer entity
	 * 
	 */
	@Test
	public void saveUserAnswers() {
		// TODO: JUnit - Populate test inputs for operation: saveUserAnswers 
		Integer id = 0;
		Answer related_answers = new edu.yangsheng.domain.Answer();
		User response = null;
		response = service.saveUserAnswers(id, related_answers);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUserAnswers
	}

	/**
	 * Operation Unit Test
	 * Save an existing Account entity
	 * 
	 */
	@Test
	public void saveUserAccounts() {
		// TODO: JUnit - Populate test inputs for operation: saveUserAccounts 
		Integer id_1 = 0;
		Account related_accounts = new edu.yangsheng.domain.Account();
		User response = null;
		response = service.saveUserAccounts(id_1, related_accounts);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUserAccounts
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findUserByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findUserByPrimaryKey 
		Integer id_2 = 0;
		User response = null;
		response = service.findUserByPrimaryKey(id_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findUserByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return all User entity
	 * 
	 */
	@Test
	public void findAllUsers() {
		// TODO: JUnit - Populate test inputs for operation: findAllUsers 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<User> response = null;
		response = service.findAllUsers(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllUsers
	}

	/**
	 * Operation Unit Test
	 * Save an existing UserCategory entity
	 * 
	 */
	@Test
	public void saveUserUserCategories() {
		// TODO: JUnit - Populate test inputs for operation: saveUserUserCategories 
		Integer id_3 = 0;
		UserCategory related_usercategories = new edu.yangsheng.domain.UserCategory();
		User response = null;
		response = service.saveUserUserCategories(id_3, related_usercategories);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUserUserCategories
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UserCategory entity
	 * 
	 */
	@Test
	public void deleteUserUserCategories() {
		// TODO: JUnit - Populate test inputs for operation: deleteUserUserCategories 
		Integer user_id_1 = 0;
		Integer related_usercategories_id = 0;
		User response = null;
		response = service.deleteUserUserCategories(user_id_1, related_usercategories_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUserUserCategories
	}

	/**
	 * Operation Unit Test
	 * Delete an existing User entity
	 * 
	 */
	@Test
	public void deleteUser() {
		// TODO: JUnit - Populate test inputs for operation: deleteUser 
		User user_1 = new edu.yangsheng.domain.User();
		service.deleteUser(user_1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all User entity
	 * 
	 */
	@Test
	public void countUsers() {
		Integer response = null;
		response = service.countUsers();
		// TODO: JUnit - Add assertions to test outputs of operation: countUsers
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Account entity
	 * 
	 */
	@Test
	public void deleteUserAccounts() {
		// TODO: JUnit - Populate test inputs for operation: deleteUserAccounts 
		Integer user_id_2 = 0;
		Integer related_accounts_id = 0;
		User response = null;
		response = service.deleteUserAccounts(user_id_2, related_accounts_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUserAccounts
	}

	/**
	 * Operation Unit Test
	 * Load an existing User entity
	 * 
	 */
	@Test
	public void loadUsers() {
		Set<User> response = null;
		response = service.loadUsers();
		// TODO: JUnit - Add assertions to test outputs of operation: loadUsers
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
