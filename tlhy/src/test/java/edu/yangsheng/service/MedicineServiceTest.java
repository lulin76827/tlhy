package edu.yangsheng.service;

import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.Medicine;
import edu.yangsheng.domain.MedicineSymptom;

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
public class MedicineServiceTest {

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
	protected MedicineService service;

	/**
	 * Instantiates a new MedicineServiceTest.
	 *
	 */
	public MedicineServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Medicine entity
	 * 
	 */
	@Test
	public void saveMedicine() {
		// TODO: JUnit - Populate test inputs for operation: saveMedicine 
		Medicine medicine = new edu.yangsheng.domain.Medicine();
		service.saveMedicine(medicine);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing MedicineSymptom entity
	 * 
	 */
	@Test
	public void deleteMedicineMedicineSymptoms() {
		// TODO: JUnit - Populate test inputs for operation: deleteMedicineMedicineSymptoms 
		Integer medicine_id = 0;
		Integer related_medicinesymptoms_id = 0;
		Medicine response = null;
		response = service.deleteMedicineMedicineSymptoms(medicine_id, related_medicinesymptoms_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteMedicineMedicineSymptoms
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Medicine entity
	 * 
	 */
	@Test
	public void deleteMedicine() {
		// TODO: JUnit - Populate test inputs for operation: deleteMedicine 
		Medicine medicine_1 = new edu.yangsheng.domain.Medicine();
		service.deleteMedicine(medicine_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Category entity
	 * 
	 */
	@Test
	public void deleteMedicineCategory() {
		// TODO: JUnit - Populate test inputs for operation: deleteMedicineCategory 
		Integer medicine_id_1 = 0;
		Integer related_category_id = 0;
		Medicine response = null;
		response = service.deleteMedicineCategory(medicine_id_1, related_category_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteMedicineCategory
	}

	/**
	 * Operation Unit Test
	 * Save an existing Category entity
	 * 
	 */
	@Test
	public void saveMedicineCategory() {
		// TODO: JUnit - Populate test inputs for operation: saveMedicineCategory 
		Integer id = 0;
		Category related_category = new edu.yangsheng.domain.Category();
		Medicine response = null;
		response = service.saveMedicineCategory(id, related_category);
		// TODO: JUnit - Add assertions to test outputs of operation: saveMedicineCategory
	}

	/**
	 * Operation Unit Test
	 * Load an existing Medicine entity
	 * 
	 */
	@Test
	public void loadMedicines() {
		Set<Medicine> response = null;
		response = service.loadMedicines();
		// TODO: JUnit - Add assertions to test outputs of operation: loadMedicines
	}

	/**
	 * Operation Unit Test
	 * Save an existing MedicineSymptom entity
	 * 
	 */
	@Test
	public void saveMedicineMedicineSymptoms() {
		// TODO: JUnit - Populate test inputs for operation: saveMedicineMedicineSymptoms 
		Integer id_1 = 0;
		MedicineSymptom related_medicinesymptoms = new edu.yangsheng.domain.MedicineSymptom();
		Medicine response = null;
		response = service.saveMedicineMedicineSymptoms(id_1, related_medicinesymptoms);
		// TODO: JUnit - Add assertions to test outputs of operation: saveMedicineMedicineSymptoms
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Medicine entity
	 * 
	 */
	@Test
	public void countMedicines() {
		Integer response = null;
		response = service.countMedicines();
		// TODO: JUnit - Add assertions to test outputs of operation: countMedicines
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findMedicineByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findMedicineByPrimaryKey 
		Integer id_2 = 0;
		Medicine response = null;
		response = service.findMedicineByPrimaryKey(id_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findMedicineByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return all Medicine entity
	 * 
	 */
	@Test
	public void findAllMedicines() {
		// TODO: JUnit - Populate test inputs for operation: findAllMedicines 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Medicine> response = null;
		response = service.findAllMedicines(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllMedicines
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
