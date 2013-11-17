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
 * Unit test for the <code>CategoryController</code> controller.
 *
 * @see edu.yangsheng.web.CategoryController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/tlhy-security-context.xml",
		"file:./src/main/resources/tlhy-service-context.xml",
		"file:./src/main/resources/tlhy-dao-context.xml",
		"file:./src/main/resources/tlhy-web-context.xml" })
public class CategoryControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editCategorySymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCategorySymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCategorySymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCategorySymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCategorySymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCategorySymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCategorySymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCategorySymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCategorySymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCategorySymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCategorySymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCategorySymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCategorySymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCategorySymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCategorySymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCategorySymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCategorySymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCategorySymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCategorySymptoms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCategorySymptoms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCategorySymptoms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCategoryQuestions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCategoryQuestions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCategoryQuestions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCategoryQuestions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCategoryQuestions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCategoryQuestions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCategoryQuestions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCategoryQuestions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCategoryQuestions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCategoryQuestions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCategoryQuestions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCategoryQuestions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCategoryQuestions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCategoryQuestions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCategoryQuestions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCategoryQuestions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCategoryQuestions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCategoryQuestions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCategoryQuestions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCategoryQuestions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCategoryQuestions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCategoryMedicines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCategoryMedicines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCategoryMedicines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCategoryMedicines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCategoryMedicines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCategoryMedicines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCategoryMedicines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCategoryMedicines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCategoryMedicines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCategoryMedicines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCategoryMedicines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCategoryMedicines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCategoryMedicines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCategoryMedicines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCategoryMedicines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCategoryMedicines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCategoryMedicines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCategoryMedicines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCategoryMedicines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCategoryMedicines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCategoryMedicines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCategoryPathogenesises()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCategoryPathogenesises() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCategoryPathogenesises");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCategoryPathogenesises()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCategoryPathogenesises() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCategoryPathogenesises");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCategoryPathogenesises()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCategoryPathogenesises() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCategoryPathogenesises");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCategoryPathogenesises()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCategoryPathogenesises() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCategoryPathogenesises");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCategoryPathogenesises()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCategoryPathogenesises() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCategoryPathogenesises");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCategoryPathogenesises()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCategoryPathogenesises() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCategoryPathogenesises");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCategoryPathogenesises()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCategoryPathogenesises() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCategoryPathogenesises");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCategoryUserCategories()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCategoryUserCategories() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCategoryUserCategories");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCategoryUserCategories()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCategoryUserCategories() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCategoryUserCategories");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCategoryUserCategories()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCategoryUserCategories() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCategoryUserCategories");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCategoryUserCategories()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCategoryUserCategories() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCategoryUserCategories");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCategoryUserCategories()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCategoryUserCategories() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCategoryUserCategories");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCategoryUserCategories()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCategoryUserCategories() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCategoryUserCategories");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCategoryUserCategories()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCategoryUserCategories() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCategoryUserCategories");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>categoryControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetcategoryControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/categoryController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CategoryController controller = (CategoryController) context.getBean("CategoryController");

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