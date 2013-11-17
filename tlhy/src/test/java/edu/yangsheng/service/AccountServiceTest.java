package edu.yangsheng.service;

import edu.yangsheng.domain.Account;
import edu.yangsheng.domain.User;

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
public class AccountServiceTest {

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
	protected AccountService service;

	/**
	 * Instantiates a new AccountServiceTest.
	 *
	 */
	public AccountServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing User entity
	 * 
	 */
	@Test
	public void deleteAccountUser() {
		// TODO: JUnit - Populate test inputs for operation: deleteAccountUser 
		Integer account_id = 0;
		Integer related_user_id = 0;
		Account response = null;
		response = service.deleteAccountUser(account_id, related_user_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteAccountUser
	}

	/**
	 * Operation Unit Test
	 * Save an existing User entity
	 * 
	 */
	@Test
	public void saveAccountUser() {
		// TODO: JUnit - Populate test inputs for operation: saveAccountUser 
		Integer id = 0;
		User related_user = new edu.yangsheng.domain.User();
		Account response = null;
		response = service.saveAccountUser(id, related_user);
		// TODO: JUnit - Add assertions to test outputs of operation: saveAccountUser
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Account entity
	 * 
	 */
	@Test
	public void deleteAccount() {
		// TODO: JUnit - Populate test inputs for operation: deleteAccount 
		Account account = new edu.yangsheng.domain.Account();
		service.deleteAccount(account);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findAccountByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findAccountByPrimaryKey 
		Integer id_1 = 0;
		Account response = null;
		response = service.findAccountByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findAccountByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return all Account entity
	 * 
	 */
	@Test
	public void findAllAccounts() {
		// TODO: JUnit - Populate test inputs for operation: findAllAccounts 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Account> response = null;
		response = service.findAllAccounts(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllAccounts
	}

	/**
	 * Operation Unit Test
	 * Load an existing Account entity
	 * 
	 */
	@Test
	public void loadAccounts() {
		Set<Account> response = null;
		response = service.loadAccounts();
		// TODO: JUnit - Add assertions to test outputs of operation: loadAccounts
	}

	/**
	 * Operation Unit Test
	 * Save an existing Account entity
	 * 
	 */
	@Test
	public void saveAccount() {
		// TODO: JUnit - Populate test inputs for operation: saveAccount 
		Account account_1 = new edu.yangsheng.domain.Account();
		service.saveAccount(account_1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Account entity
	 * 
	 */
	@Test
	public void countAccounts() {
		Integer response = null;
		response = service.countAccounts();
		// TODO: JUnit - Add assertions to test outputs of operation: countAccounts
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
