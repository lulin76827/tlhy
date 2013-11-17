package edu.yangsheng.service;

import edu.yangsheng.domain.Medicine;
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
public class MedicineSymptomServiceTest {

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
	protected MedicineSymptomService service;

	/**
	 * Instantiates a new MedicineSymptomServiceTest.
	 *
	 */
	public MedicineSymptomServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Symptom entity
	 * 
	 */
	@Test
	public void saveMedicineSymptomSymptom() {
		// TODO: JUnit - Populate test inputs for operation: saveMedicineSymptomSymptom 
		Integer id = 0;
		Symptom related_symptom = new edu.yangsheng.domain.Symptom();
		MedicineSymptom response = null;
		response = service.saveMedicineSymptomSymptom(id, related_symptom);
		// TODO: JUnit - Add assertions to test outputs of operation: saveMedicineSymptomSymptom
	}

	/**
	 * Operation Unit Test
	 * Load an existing MedicineSymptom entity
	 * 
	 */
	@Test
	public void loadMedicineSymptoms() {
		Set<MedicineSymptom> response = null;
		response = service.loadMedicineSymptoms();
		// TODO: JUnit - Add assertions to test outputs of operation: loadMedicineSymptoms
	}

	/**
	 * Operation Unit Test
	 * Return all MedicineSymptom entity
	 * 
	 */
	@Test
	public void findAllMedicineSymptoms() {
		// TODO: JUnit - Populate test inputs for operation: findAllMedicineSymptoms 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<MedicineSymptom> response = null;
		response = service.findAllMedicineSymptoms(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllMedicineSymptoms
	}

	/**
	 * Operation Unit Test
	 * Save an existing Medicine entity
	 * 
	 */
	@Test
	public void saveMedicineSymptomMedicine() {
		// TODO: JUnit - Populate test inputs for operation: saveMedicineSymptomMedicine 
		Integer id_1 = 0;
		Medicine related_medicine = new edu.yangsheng.domain.Medicine();
		MedicineSymptom response = null;
		response = service.saveMedicineSymptomMedicine(id_1, related_medicine);
		// TODO: JUnit - Add assertions to test outputs of operation: saveMedicineSymptomMedicine
	}

	/**
	 * Operation Unit Test
	 * Delete an existing MedicineSymptom entity
	 * 
	 */
	@Test
	public void deleteMedicineSymptom() {
		// TODO: JUnit - Populate test inputs for operation: deleteMedicineSymptom 
		MedicineSymptom medicinesymptom = new edu.yangsheng.domain.MedicineSymptom();
		service.deleteMedicineSymptom(medicinesymptom);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all MedicineSymptom entity
	 * 
	 */
	@Test
	public void countMedicineSymptoms() {
		Integer response = null;
		response = service.countMedicineSymptoms();
		// TODO: JUnit - Add assertions to test outputs of operation: countMedicineSymptoms
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findMedicineSymptomByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findMedicineSymptomByPrimaryKey 
		Integer id_2 = 0;
		MedicineSymptom response = null;
		response = service.findMedicineSymptomByPrimaryKey(id_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findMedicineSymptomByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing MedicineSymptom entity
	 * 
	 */
	@Test
	public void saveMedicineSymptom() {
		// TODO: JUnit - Populate test inputs for operation: saveMedicineSymptom 
		MedicineSymptom medicinesymptom_1 = new edu.yangsheng.domain.MedicineSymptom();
		service.saveMedicineSymptom(medicinesymptom_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Medicine entity
	 * 
	 */
	@Test
	public void deleteMedicineSymptomMedicine() {
		// TODO: JUnit - Populate test inputs for operation: deleteMedicineSymptomMedicine 
		Integer medicinesymptom_id = 0;
		Integer related_medicine_id = 0;
		MedicineSymptom response = null;
		response = service.deleteMedicineSymptomMedicine(medicinesymptom_id, related_medicine_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteMedicineSymptomMedicine
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Symptom entity
	 * 
	 */
	@Test
	public void deleteMedicineSymptomSymptom() {
		// TODO: JUnit - Populate test inputs for operation: deleteMedicineSymptomSymptom 
		Integer medicinesymptom_id_1 = 0;
		Integer related_symptom_id = 0;
		MedicineSymptom response = null;
		response = service.deleteMedicineSymptomSymptom(medicinesymptom_id_1, related_symptom_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteMedicineSymptomSymptom
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
