package edu.yangsheng.web;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>AccountController</code> controller.
 *
 * @see edu.yangsheng.web.AccountController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/tlhy-security-context.xml",
		"file:./src/main/resources/tlhy-service-context.xml",
		"file:./src/main/resources/tlhy-dao-context.xml",
		"file:./src/main/resources/tlhy-web-context.xml" })
public class AccountControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editAccountUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAccountUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAccountUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountController controller = (AccountController) context.getBean("AccountController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAccountUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAccountUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAccountUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountController controller = (AccountController) context.getBean("AccountController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAccountUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAccountUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAccountUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountController controller = (AccountController) context.getBean("AccountController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAccountUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAccountUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAccountUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountController controller = (AccountController) context.getBean("AccountController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAccountUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAccountUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAccountUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountController controller = (AccountController) context.getBean("AccountController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAccountUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAccountUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAccountUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountController controller = (AccountController) context.getBean("AccountController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listAccountUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistAccountUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listAccountUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountController controller = (AccountController) context.getBean("AccountController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexAccount()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexAccount() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexAccount");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountController controller = (AccountController) context.getBean("AccountController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAccount()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAccount() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAccount");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountController controller = (AccountController) context.getBean("AccountController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editAccount()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAccount() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAccount");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountController controller = (AccountController) context.getBean("AccountController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAccount()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAccount() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAccount");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountController controller = (AccountController) context.getBean("AccountController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAccount()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAccount() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAccount");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountController controller = (AccountController) context.getBean("AccountController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAccount()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAccount() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAccount");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountController controller = (AccountController) context.getBean("AccountController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAccount()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAccount() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAccount");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountController controller = (AccountController) context.getBean("AccountController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>accountControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetaccountControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/accountController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountController controller = (AccountController) context.getBean("AccountController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}