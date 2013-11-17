package edu.yangsheng.service;

import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.Medicine;
import edu.yangsheng.domain.Pathogenesis;
import edu.yangsheng.domain.Question;
import edu.yangsheng.domain.Symptom;
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
public class CategoryServiceTest {

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
	protected CategoryService service;

	/**
	 * Instantiates a new CategoryServiceTest.
	 *
	 */
	public CategoryServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Category entity
	 * 
	 */
	@Test
	public void countCategorys() {
		Integer response = null;
		response = service.countCategorys();
		// TODO: JUnit - Add assertions to test outputs of operation: countCategorys
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findCategoryByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findCategoryByPrimaryKey 
		Integer id = 0;
		Category response = null;
		response = service.findCategoryByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findCategoryByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Category entity
	 * 
	 */
	@Test
	public void saveCategory() {
		// TODO: JUnit - Populate test inputs for operation: saveCategory 
		Category category = new edu.yangsheng.domain.Category();
		service.saveCategory(category);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Symptom entity
	 * 
	 */
	@Test
	public void deleteCategorySymptoms() {
		// TODO: JUnit - Populate test inputs for operation: deleteCategorySymptoms 
		Integer category_id = 0;
		Integer related_symptoms_id = 0;
		Category response = null;
		response = service.deleteCategorySymptoms(category_id, related_symptoms_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCategorySymptoms
	}

	/**
	 * Operation Unit Test
	 * Load an existing Category entity
	 * 
	 */
	@Test
	public void loadCategorys() {
		Set<Category> response = null;
		response = service.loadCategorys();
		// TODO: JUnit - Add assertions to test outputs of operation: loadCategorys
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Question entity
	 * 
	 */
	@Test
	public void deleteCategoryQuestions() {
		// TODO: JUnit - Populate test inputs for operation: deleteCategoryQuestions 
		Integer category_id_1 = 0;
		Integer related_questions_id = 0;
		Category response = null;
		response = service.deleteCategoryQuestions(category_id_1, related_questions_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCategoryQuestions
	}

	/**
	 * Operation Unit Test
	 * Save an existing Medicine entity
	 * 
	 */
	@Test
	public void saveCategoryMedicines() {
		// TODO: JUnit - Populate test inputs for operation: saveCategoryMedicines 
		Integer id_1 = 0;
		Medicine related_medicines = new edu.yangsheng.domain.Medicine();
		Category response = null;
		response = service.saveCategoryMedicines(id_1, related_medicines);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCategoryMedicines
	}

	/**
	 * Operation Unit Test
	 * Save an existing Pathogenesis entity
	 * 
	 */
	@Test
	public void saveCategoryPathogenesises() {
		// TODO: JUnit - Populate test inputs for operation: saveCategoryPathogenesises 
		Integer id_2 = 0;
		Pathogenesis related_pathogenesises = new edu.yangsheng.domain.Pathogenesis();
		Category response = null;
		response = service.saveCategoryPathogenesises(id_2, related_pathogenesises);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCategoryPathogenesises
	}

	/**
	 * Operation Unit Test
	 * Return all Category entity
	 * 
	 */
	@Test
	public void findAllCategorys() {
		// TODO: JUnit - Populate test inputs for operation: findAllCategorys 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Category> response = null;
		response = service.findAllCategorys(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllCategorys
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Medicine entity
	 * 
	 */
	@Test
	public void deleteCategoryMedicines() {
		// TODO: JUnit - Populate test inputs for operation: deleteCategoryMedicines 
		Integer category_id_2 = 0;
		Integer related_medicines_id = 0;
		Category response = null;
		response = service.deleteCategoryMedicines(category_id_2, related_medicines_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCategoryMedicines
	}

	/**
	 * Operation Unit Test
	 * Save an existing Symptom entity
	 * 
	 */
	@Test
	public void saveCategorySymptoms() {
		// TODO: JUnit - Populate test inputs for operation: saveCategorySymptoms 
		Integer id_3 = 0;
		Symptom related_symptoms = new edu.yangsheng.domain.Symptom();
		Category response = null;
		response = service.saveCategorySymptoms(id_3, related_symptoms);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCategorySymptoms
	}

	/**
	 * Operation Unit Test
	 * Save an existing UserCategory entity
	 * 
	 */
	@Test
	public void saveCategoryUserCategories() {
		// TODO: JUnit - Populate test inputs for operation: saveCategoryUserCategories 
		Integer id_4 = 0;
		UserCategory related_usercategories = new edu.yangsheng.domain.UserCategory();
		Category response = null;
		response = service.saveCategoryUserCategories(id_4, related_usercategories);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCategoryUserCategories
	}

	/**
	 * Operation Unit Test
	 * Save an existing Question entity
	 * 
	 */
	@Test
	public void saveCategoryQuestions() {
		// TODO: JUnit - Populate test inputs for operation: saveCategoryQuestions 
		Integer id_5 = 0;
		Question related_questions = new edu.yangsheng.domain.Question();
		Category response = null;
		response = service.saveCategoryQuestions(id_5, related_questions);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCategoryQuestions
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Category entity
	 * 
	 */
	@Test
	public void deleteCategory() {
		// TODO: JUnit - Populate test inputs for operation: deleteCategory 
		Category category_1 = new edu.yangsheng.domain.Category();
		service.deleteCategory(category_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UserCategory entity
	 * 
	 */
	@Test
	public void deleteCategoryUserCategories() {
		// TODO: JUnit - Populate test inputs for operation: deleteCategoryUserCategories 
		Integer category_id_3 = 0;
		Integer related_usercategories_id = 0;
		Category response = null;
		response = service.deleteCategoryUserCategories(category_id_3, related_usercategories_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCategoryUserCategories
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Pathogenesis entity
	 * 
	 */
	@Test
	public void deleteCategoryPathogenesises() {
		// TODO: JUnit - Populate test inputs for operation: deleteCategoryPathogenesises 
		Integer category_id_4 = 0;
		Integer related_pathogenesises_id = 0;
		Category response = null;
		response = service.deleteCategoryPathogenesises(category_id_4, related_pathogenesises_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCategoryPathogenesises
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
