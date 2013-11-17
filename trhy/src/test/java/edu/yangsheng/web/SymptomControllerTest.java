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
 * Unit test for the <code>SymptomController</code> controller.
 *
 * @see edu.yangsheng.web.SymptomController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/tlhy-security-context.xml",
		"file:./src/main/resources/tlhy-service-context.xml",
		"file:./src/main/resources/tlhy-dao-context.xml",
		"file:./src/main/resources/tlhy-web-context.xml" })
public class SymptomControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editSymptomCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditSymptomCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editSymptomCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newSymptomCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewSymptomCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newSymptomCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveSymptomCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveSymptomCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveSymptomCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteSymptomCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteSymptomCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteSymptomCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteSymptomCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteSymptomCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteSymptomCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectSymptomCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectSymptomCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectSymptomCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listSymptomCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistSymptomCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listSymptomCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editSymptomMedicineSymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditSymptomMedicineSymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editSymptomMedicineSymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newSymptomMedicineSymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewSymptomMedicineSymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newSymptomMedicineSymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveSymptomMedicineSymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveSymptomMedicineSymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveSymptomMedicineSymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteSymptomMedicineSymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteSymptomMedicineSymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteSymptomMedicineSymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteSymptomMedicineSymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteSymptomMedicineSymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteSymptomMedicineSymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectSymptomMedicineSymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectSymptomMedicineSymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectSymptomMedicineSymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listSymptomMedicineSymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistSymptomMedicineSymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listSymptomMedicineSymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>symptomControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsymptomControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/symptomController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SymptomController controller = (SymptomController) context.getBean("SymptomController");

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