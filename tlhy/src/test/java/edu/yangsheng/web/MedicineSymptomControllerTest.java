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
 * Unit test for the <code>MedicineSymptomController</code> controller.
 *
 * @see edu.yangsheng.web.MedicineSymptomController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/tlhy-security-context.xml",
		"file:./src/main/resources/tlhy-service-context.xml",
		"file:./src/main/resources/tlhy-dao-context.xml",
		"file:./src/main/resources/tlhy-web-context.xml" })
public class MedicineSymptomControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editMedicineSymptomSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditMedicineSymptomSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editMedicineSymptomSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newMedicineSymptomSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewMedicineSymptomSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newMedicineSymptomSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveMedicineSymptomSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveMedicineSymptomSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveMedicineSymptomSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteMedicineSymptomSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteMedicineSymptomSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteMedicineSymptomSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteMedicineSymptomSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteMedicineSymptomSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteMedicineSymptomSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectMedicineSymptomSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectMedicineSymptomSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectMedicineSymptomSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listMedicineSymptomSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistMedicineSymptomSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listMedicineSymptomSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editMedicineSymptomMedicine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditMedicineSymptomMedicine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editMedicineSymptomMedicine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newMedicineSymptomMedicine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewMedicineSymptomMedicine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newMedicineSymptomMedicine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveMedicineSymptomMedicine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveMedicineSymptomMedicine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveMedicineSymptomMedicine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteMedicineSymptomMedicine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteMedicineSymptomMedicine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteMedicineSymptomMedicine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteMedicineSymptomMedicine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteMedicineSymptomMedicine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteMedicineSymptomMedicine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectMedicineSymptomMedicine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectMedicineSymptomMedicine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectMedicineSymptomMedicine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listMedicineSymptomMedicine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistMedicineSymptomMedicine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listMedicineSymptomMedicine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexMedicineSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexMedicineSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexMedicineSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectMedicineSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectMedicineSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectMedicineSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editMedicineSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditMedicineSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editMedicineSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveMedicineSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveMedicineSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveMedicineSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newMedicineSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewMedicineSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newMedicineSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteMedicineSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteMedicineSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteMedicineSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteMedicineSymptom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteMedicineSymptom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteMedicineSymptom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>medicinesymptomControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetmedicinesymptomControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/medicinesymptomController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MedicineSymptomController controller = (MedicineSymptomController) context.getBean("MedicineSymptomController");

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