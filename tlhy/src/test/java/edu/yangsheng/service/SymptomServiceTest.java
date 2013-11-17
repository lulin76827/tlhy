package edu.yangsheng.service;

import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.MedicineSymptom;
import edu.yangsheng.domain.Symptom;

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
public class SymptomServiceTest {

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
	protected SymptomService service;

	/**
	 * Instantiates a new SymptomServiceTest.
	 *
	 */
	public SymptomServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Category entity
	 * 
	 */
	@Test
	public void deleteSymptomCategory() {
		// TODO: JUnit - Populate test inputs for operation: deleteSymptomCategory 
		Integer symptom_id = 0;
		Integer related_category_id = 0;
		Symptom response = null;
		response = service.deleteSymptomCategory(symptom_id, related_category_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteSymptomCategory
	}

	/**
	 * Operation Unit Test
	 * Load an existing Symptom entity
	 * 
	 */
	@Test
	public void loadSymptoms() {
		Set<Symptom> response = null;
		response = service.loadSymptoms();
		// TODO: JUnit - Add assertions to test outputs of operation: loadSymptoms
	}

	/**
	 * Operation Unit Test
	 * Save an existing Symptom entity
	 * 
	 */
	@Test
	public void saveSymptom() {
		// TODO: JUnit - Populate test inputs for operation: saveSymptom 
		Symptom symptom = new edu.yangsheng.domain.Symptom();
		service.saveSymptom(symptom);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findSymptomByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findSymptomByPrimaryKey 
		Integer id = 0;
		Symptom response = null;
		response = service.findSymptomByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findSymptomByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Symptom entity
	 * 
	 */
	@Test
	public void countSymptoms() {
		Integer response = null;
		response = service.countSymptoms();
		// TODO: JUnit - Add assertions to test outputs of operation: countSymptoms
	}

	/**
	 * Operation Unit Test
	 * Delete an existing MedicineSymptom entity
	 * 
	 */
	@Test
	public void deleteSymptomMedicineSymptoms() {
		// TODO: JUnit - Populate test inputs for operation: deleteSymptomMedicineSymptoms 
		Integer symptom_id_1 = 0;
		Integer related_medicinesymptoms_id = 0;
		Symptom response = null;
		response = service.deleteSymptomMedicineSymptoms(symptom_id_1, related_medicinesymptoms_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteSymptomMedicineSymptoms
	}

	/**
	 * Operation Unit Test
	 * Return all Symptom entity
	 * 
	 */
	@Test
	public void findAllSymptoms() {
		// TODO: JUnit - Populate test inputs for operation: findAllSymptoms 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Symptom> response = null;
		response = service.findAllSymptoms(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllSymptoms
	}

	/**
	 * Operation Unit Test
	 * Save an existing Category entity
	 * 
	 */
	@Test
	public void saveSymptomCategory() {
		// TODO: JUnit - Populate test inputs for operation: saveSymptomCategory 
		Integer id_1 = 0;
		Category related_category = new edu.yangsheng.domain.Category();
		Symptom response = null;
		response = service.saveSymptomCategory(id_1, related_category);
		// TODO: JUnit - Add assertions to test outputs of operation: saveSymptomCategory
	}

	/**
	 * Operation Unit Test
	 * Save an existing MedicineSymptom entity
	 * 
	 */
	@Test
	public void saveSymptomMedicineSymptoms() {
		// TODO: JUnit - Populate test inputs for operation: saveSymptomMedicineSymptoms 
		Integer id_2 = 0;
		MedicineSymptom related_medicinesymptoms = new edu.yangsheng.domain.MedicineSymptom();
		Symptom response = null;
		response = service.saveSymptomMedicineSymptoms(id_2, related_medicinesymptoms);
		// TODO: JUnit - Add assertions to test outputs of operation: saveSymptomMedicineSymptoms
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Symptom entity
	 * 
	 */
	@Test
	public void deleteSymptom() {
		// TODO: JUnit - Populate test inputs for operation: deleteSymptom 
		Symptom symptom_1 = new edu.yangsheng.domain.Symptom();
		service.deleteSymptom(symptom_1);
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
