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
 * Unit test for the <code>PathogenesisController</code> controller.
 *
 * @see edu.yangsheng.web.PathogenesisController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/tlhy-security-context.xml",
		"file:./src/main/resources/tlhy-service-context.xml",
		"file:./src/main/resources/tlhy-dao-context.xml",
		"file:./src/main/resources/tlhy-web-context.xml" })
public class PathogenesisControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editPathogenesisCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditPathogenesisCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editPathogenesisCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PathogenesisController controller = (PathogenesisController) context.getBean("PathogenesisController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newPathogenesisCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewPathogenesisCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newPathogenesisCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PathogenesisController controller = (PathogenesisController) context.getBean("PathogenesisController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>savePathogenesisCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsavePathogenesisCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/savePathogenesisCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PathogenesisController controller = (PathogenesisController) context.getBean("PathogenesisController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeletePathogenesisCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeletePathogenesisCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeletePathogenesisCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PathogenesisController controller = (PathogenesisController) context.getBean("PathogenesisController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deletePathogenesisCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeletePathogenesisCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deletePathogenesisCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PathogenesisController controller = (PathogenesisController) context.getBean("PathogenesisController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectPathogenesisCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectPathogenesisCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectPathogenesisCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PathogenesisController controller = (PathogenesisController) context.getBean("PathogenesisController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listPathogenesisCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistPathogenesisCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listPathogenesisCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PathogenesisController controller = (PathogenesisController) context.getBean("PathogenesisController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexPathogenesis()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexPathogenesis() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexPathogenesis");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PathogenesisController controller = (PathogenesisController) context.getBean("PathogenesisController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectPathogenesis()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectPathogenesis() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectPathogenesis");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PathogenesisController controller = (PathogenesisController) context.getBean("PathogenesisController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editPathogenesis()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditPathogenesis() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editPathogenesis");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PathogenesisController controller = (PathogenesisController) context.getBean("PathogenesisController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>savePathogenesis()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsavePathogenesis() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/savePathogenesis");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PathogenesisController controller = (PathogenesisController) context.getBean("PathogenesisController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newPathogenesis()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewPathogenesis() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newPathogenesis");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PathogenesisController controller = (PathogenesisController) context.getBean("PathogenesisController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeletePathogenesis()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeletePathogenesis() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeletePathogenesis");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PathogenesisController controller = (PathogenesisController) context.getBean("PathogenesisController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deletePathogenesis()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeletePathogenesis() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deletePathogenesis");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PathogenesisController controller = (PathogenesisController) context.getBean("PathogenesisController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>pathogenesisControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetpathogenesisControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/pathogenesisController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PathogenesisController controller = (PathogenesisController) context.getBean("PathogenesisController");

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