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
 * Unit test for the <code>UserController</code> controller.
 *
 * @see edu.yangsheng.web.UserController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/tlhy-security-context.xml",
		"file:./src/main/resources/tlhy-service-context.xml",
		"file:./src/main/resources/tlhy-dao-context.xml",
		"file:./src/main/resources/tlhy-web-context.xml" })
public class UserControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editUserAccounts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUserAccounts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUserAccounts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUserAccounts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUserAccounts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUserAccounts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUserAccounts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUserAccounts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUserAccounts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUserAccounts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUserAccounts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUserAccounts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUserAccounts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUserAccounts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUserAccounts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUserAccounts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUserAccounts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUserAccounts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUserAccounts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUserAccounts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUserAccounts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUserUserCategories()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUserUserCategories() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUserUserCategories");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUserUserCategories()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUserUserCategories() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUserUserCategories");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUserUserCategories()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUserUserCategories() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUserUserCategories");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUserUserCategories()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUserUserCategories() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUserUserCategories");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUserUserCategories()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUserUserCategories() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUserUserCategories");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUserUserCategories()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUserUserCategories() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUserUserCategories");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUserUserCategories()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUserUserCategories() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUserUserCategories");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUserAnswers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUserAnswers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUserAnswers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUserAnswers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUserAnswers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUserAnswers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUserAnswers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUserAnswers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUserAnswers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUserAnswers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUserAnswers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUserAnswers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUserAnswers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUserAnswers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUserAnswers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUserAnswers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUserAnswers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUserAnswers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUserAnswers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUserAnswers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUserAnswers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>userControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetuserControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/userController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserController controller = (UserController) context.getBean("UserController");

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