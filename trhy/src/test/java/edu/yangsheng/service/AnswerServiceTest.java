package edu.yangsheng.service;

import edu.yangsheng.domain.Answer;
import edu.yangsheng.domain.Question;
import edu.yangsheng.domain.User;

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
public class AnswerServiceTest {

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
	protected AnswerService service;

	/**
	 * Instantiates a new AnswerServiceTest.
	 *
	 */
	public AnswerServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Answer entity
	 * 
	 */
	@Test
	public void deleteAnswer() {
		// TODO: JUnit - Populate test inputs for operation: deleteAnswer 
		Answer answer = new edu.yangsheng.domain.Answer();
		service.deleteAnswer(answer);
	}

	/**
	 * Operation Unit Test
	 * Return all Answer entity
	 * 
	 */
	@Test
	public void findAllAnswers() {
		// TODO: JUnit - Populate test inputs for operation: findAllAnswers 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Answer> response = null;
		response = service.findAllAnswers(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllAnswers
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Question entity
	 * 
	 */
	@Test
	public void deleteAnswerQuestion() {
		// TODO: JUnit - Populate test inputs for operation: deleteAnswerQuestion 
		Integer answer_id = 0;
		Integer related_question_id = 0;
		Answer response = null;
		response = service.deleteAnswerQuestion(answer_id, related_question_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteAnswerQuestion
	}

	/**
	 * Operation Unit Test
	 * Save an existing User entity
	 * 
	 */
	@Test
	public void saveAnswerUser() {
		// TODO: JUnit - Populate test inputs for operation: saveAnswerUser 
		Integer id = 0;
		User related_user = new edu.yangsheng.domain.User();
		Answer response = null;
		response = service.saveAnswerUser(id, related_user);
		// TODO: JUnit - Add assertions to test outputs of operation: saveAnswerUser
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findAnswerByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findAnswerByPrimaryKey 
		Integer id_1 = 0;
		Answer response = null;
		response = service.findAnswerByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findAnswerByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing User entity
	 * 
	 */
	@Test
	public void deleteAnswerUser() {
		// TODO: JUnit - Populate test inputs for operation: deleteAnswerUser 
		Integer answer_id_1 = 0;
		Integer related_user_id = 0;
		Answer response = null;
		response = service.deleteAnswerUser(answer_id_1, related_user_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteAnswerUser
	}

	/**
	 * Operation Unit Test
	 * Save an existing Question entity
	 * 
	 */
	@Test
	public void saveAnswerQuestion() {
		// TODO: JUnit - Populate test inputs for operation: saveAnswerQuestion 
		Integer id_2 = 0;
		Question related_question = new edu.yangsheng.domain.Question();
		Answer response = null;
		response = service.saveAnswerQuestion(id_2, related_question);
		// TODO: JUnit - Add assertions to test outputs of operation: saveAnswerQuestion
	}

	/**
	 * Operation Unit Test
	 * Save an existing Answer entity
	 * 
	 */
	@Test
	public void saveAnswer() {
		// TODO: JUnit - Populate test inputs for operation: saveAnswer 
		Answer answer_1 = new edu.yangsheng.domain.Answer();
		service.saveAnswer(answer_1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Answer entity
	 * 
	 */
	@Test
	public void countAnswers() {
		Integer response = null;
		response = service.countAnswers();
		// TODO: JUnit - Add assertions to test outputs of operation: countAnswers
	}

	/**
	 * Operation Unit Test
	 * Load an existing Answer entity
	 * 
	 */
	@Test
	public void loadAnswers() {
		Set<Answer> response = null;
		response = service.loadAnswers();
		// TODO: JUnit - Add assertions to test outputs of operation: loadAnswers
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
