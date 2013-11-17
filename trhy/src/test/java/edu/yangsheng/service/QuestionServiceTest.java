package edu.yangsheng.service;

import edu.yangsheng.domain.Answer;
import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.Question;

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
public class QuestionServiceTest {

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
	protected QuestionService service;

	/**
	 * Instantiates a new QuestionServiceTest.
	 *
	 */
	public QuestionServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Answer entity
	 * 
	 */
	@Test
	public void saveQuestionAnswers() {
		// TODO: JUnit - Populate test inputs for operation: saveQuestionAnswers 
		Integer id = 0;
		Answer related_answers = new edu.yangsheng.domain.Answer();
		Question response = null;
		response = service.saveQuestionAnswers(id, related_answers);
		// TODO: JUnit - Add assertions to test outputs of operation: saveQuestionAnswers
	}

	/**
	 * Operation Unit Test
	 * Save an existing Category entity
	 * 
	 */
	@Test
	public void saveQuestionCategory() {
		// TODO: JUnit - Populate test inputs for operation: saveQuestionCategory 
		Integer id_1 = 0;
		Category related_category = new edu.yangsheng.domain.Category();
		Question response = null;
		response = service.saveQuestionCategory(id_1, related_category);
		// TODO: JUnit - Add assertions to test outputs of operation: saveQuestionCategory
	}

	/**
	 * Operation Unit Test
	 * Return all Question entity
	 * 
	 */
	@Test
	public void findAllQuestions() {
		// TODO: JUnit - Populate test inputs for operation: findAllQuestions 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Question> response = null;
		response = service.findAllQuestions(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllQuestions
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Question entity
	 * 
	 */
	@Test
	public void countQuestions() {
		Integer response = null;
		response = service.countQuestions();
		// TODO: JUnit - Add assertions to test outputs of operation: countQuestions
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Question entity
	 * 
	 */
	@Test
	public void deleteQuestion() {
		// TODO: JUnit - Populate test inputs for operation: deleteQuestion 
		Question question = new edu.yangsheng.domain.Question();
		service.deleteQuestion(question);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Answer entity
	 * 
	 */
	@Test
	public void deleteQuestionAnswers() {
		// TODO: JUnit - Populate test inputs for operation: deleteQuestionAnswers 
		Integer question_id = 0;
		Integer related_answers_id = 0;
		Question response = null;
		response = service.deleteQuestionAnswers(question_id, related_answers_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteQuestionAnswers
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findQuestionByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findQuestionByPrimaryKey 
		Integer id_2 = 0;
		Question response = null;
		response = service.findQuestionByPrimaryKey(id_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findQuestionByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Question entity
	 * 
	 */
	@Test
	public void saveQuestion() {
		// TODO: JUnit - Populate test inputs for operation: saveQuestion 
		Question question_1 = new edu.yangsheng.domain.Question();
		service.saveQuestion(question_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Category entity
	 * 
	 */
	@Test
	public void deleteQuestionCategory() {
		// TODO: JUnit - Populate test inputs for operation: deleteQuestionCategory 
		Integer question_id_1 = 0;
		Integer related_category_id = 0;
		Question response = null;
		response = service.deleteQuestionCategory(question_id_1, related_category_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteQuestionCategory
	}

	/**
	 * Operation Unit Test
	 * Load an existing Question entity
	 * 
	 */
	@Test
	public void loadQuestions() {
		Set<Question> response = null;
		response = service.loadQuestions();
		// TODO: JUnit - Add assertions to test outputs of operation: loadQuestions
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
