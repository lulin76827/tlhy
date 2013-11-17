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
 * Unit test for the <code>MedicineController</code> controller.
 *
 * @see edu.yangsheng.web.MedicineController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/tlhy-security-context.xml",
		"file:./src/main/resources/tlhy-service-context.xml",
		"file:./src/main/resources/tlhy-dao-context.xml",
		"file:./src/main/resources/tlhy-web-context.xml" })
public class MedicineControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editMedicineCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditMedicineCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editMedicineCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newMedicineCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewMedicineCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newMedicineCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveMedicineCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveMedicineCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveMedicineCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteMedicineCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteMedicineCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteMedicineCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteMedicineCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteMedicineCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteMedicineCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectMedicineCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectMedicineCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectMedicineCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listMedicineCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistMedicineCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listMedicineCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editMedicineMedicineSymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditMedicineMedicineSymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editMedicineMedicineSymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newMedicineMedicineSymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewMedicineMedicineSymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newMedicineMedicineSymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveMedicineMedicineSymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveMedicineMedicineSymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveMedicineMedicineSymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteMedicineMedicineSymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteMedicineMedicineSymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteMedicineMedicineSymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteMedicineMedicineSymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteMedicineMedicineSymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteMedicineMedicineSymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectMedicineMedicineSymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectMedicineMedicineSymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectMedicineMedicineSymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listMedicineMedicineSymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistMedicineMedicineSymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listMedicineMedicineSymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexMedicine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexMedicine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexMedicine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectMedicine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectMedicine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectMedicine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editMedicine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditMedicine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editMedicine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveMedicine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveMedicine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveMedicine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newMedicine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewMedicine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newMedicine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteMedicine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteMedicine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteMedicine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteMedicine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteMedicine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteMedicine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>medicineControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetmedicineControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/medicineController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineController controller = (MedicineController) context.getBean("MedicineController");

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