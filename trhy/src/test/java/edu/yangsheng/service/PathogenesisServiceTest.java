package edu.yangsheng.service;

import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.Pathogenesis;

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
public class PathogenesisServiceTest {

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
	protected PathogenesisService service;

	/**
	 * Instantiates a new PathogenesisServiceTest.
	 *
	 */
	public PathogenesisServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findPathogenesisByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findPathogenesisByPrimaryKey 
		Integer id = 0;
		Pathogenesis response = null;
		response = service.findPathogenesisByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findPathogenesisByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Category entity
	 * 
	 */
	@Test
	public void savePathogenesisCategory() {
		// TODO: JUnit - Populate test inputs for operation: savePathogenesisCategory 
		Integer id_1 = 0;
		Category related_category = new edu.yangsheng.domain.Category();
		Pathogenesis response = null;
		response = service.savePathogenesisCategory(id_1, related_category);
		// TODO: JUnit - Add assertions to test outputs of operation: savePathogenesisCategory
	}

	/**
	 * Operation Unit Test
	 * Load an existing Pathogenesis entity
	 * 
	 */
	@Test
	public void loadPathogenesiss() {
		Set<Pathogenesis> response = null;
		response = service.loadPathogenesiss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadPathogenesiss
	}

	/**
	 * Operation Unit Test
	 * Save an existing Pathogenesis entity
	 * 
	 */
	@Test
	public void savePathogenesis() {
		// TODO: JUnit - Populate test inputs for operation: savePathogenesis 
		Pathogenesis pathogenesis = new edu.yangsheng.domain.Pathogenesis();
		service.savePathogenesis(pathogenesis);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Category entity
	 * 
	 */
	@Test
	public void deletePathogenesisCategory() {
		// TODO: JUnit - Populate test inputs for operation: deletePathogenesisCategory 
		Integer pathogenesis_id = 0;
		Integer related_category_id = 0;
		Pathogenesis response = null;
		response = service.deletePathogenesisCategory(pathogenesis_id, related_category_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deletePathogenesisCategory
	}

	/**
	 * Operation Unit Test
	 * Return all Pathogenesis entity
	 * 
	 */
	@Test
	public void findAllPathogenesiss() {
		// TODO: JUnit - Populate test inputs for operation: findAllPathogenesiss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Pathogenesis> response = null;
		response = service.findAllPathogenesiss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllPathogenesiss
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Pathogenesis entity
	 * 
	 */
	@Test
	public void countPathogenesiss() {
		Integer response = null;
		response = service.countPathogenesiss();
		// TODO: JUnit - Add assertions to test outputs of operation: countPathogenesiss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Pathogenesis entity
	 * 
	 */
	@Test
	public void deletePathogenesis() {
		// TODO: JUnit - Populate test inputs for operation: deletePathogenesis 
		Pathogenesis pathogenesis_1 = new edu.yangsheng.domain.Pathogenesis();
		service.deletePathogenesis(pathogenesis_1);
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
