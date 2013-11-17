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
 * Unit test for the <code>UserCategoryController</code> controller.
 *
 * @see edu.yangsheng.web.UserCategoryController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/tlhy-security-context.xml",
		"file:./src/main/resources/tlhy-service-context.xml",
		"file:./src/main/resources/tlhy-dao-context.xml",
		"file:./src/main/resources/tlhy-web-context.xml" })
public class UserCategoryControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editUserCategoryUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUserCategoryUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUserCategoryUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUserCategoryUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUserCategoryUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUserCategoryUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUserCategoryUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUserCategoryUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUserCategoryUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUserCategoryUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUserCategoryUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUserCategoryUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUserCategoryUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUserCategoryUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUserCategoryUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUserCategoryUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUserCategoryUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUserCategoryUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUserCategoryUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUserCategoryUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUserCategoryUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUserCategoryCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUserCategoryCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUserCategoryCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUserCategoryCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUserCategoryCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUserCategoryCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUserCategoryCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUserCategoryCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUserCategoryCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUserCategoryCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUserCategoryCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUserCategoryCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUserCategoryCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUserCategoryCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUserCategoryCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUserCategoryCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUserCategoryCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUserCategoryCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUserCategoryCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUserCategoryCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUserCategoryCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexUserCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexUserCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexUserCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUserCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUserCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUserCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUserCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUserCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUserCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUserCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUserCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUserCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUserCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUserCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUserCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUserCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUserCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUserCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUserCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUserCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUserCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>usercategoryControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetusercategoryControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/usercategoryController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserCategoryController controller = (UserCategoryController) context.getBean("UserCategoryController");

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