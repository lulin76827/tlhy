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
 * Unit test for the <code>QuestionController</code> controller.
 *
 * @see edu.yangsheng.web.QuestionController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/tlhy-security-context.xml",
		"file:./src/main/resources/tlhy-service-context.xml",
		"file:./src/main/resources/tlhy-dao-context.xml",
		"file:./src/main/resources/tlhy-web-context.xml" })
public class QuestionControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editQuestionCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditQuestionCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editQuestionCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newQuestionCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewQuestionCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newQuestionCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveQuestionCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveQuestionCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveQuestionCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteQuestionCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteQuestionCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteQuestionCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteQuestionCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteQuestionCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteQuestionCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectQuestionCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectQuestionCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectQuestionCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listQuestionCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistQuestionCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listQuestionCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editQuestionAnswers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditQuestionAnswers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editQuestionAnswers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newQuestionAnswers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewQuestionAnswers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newQuestionAnswers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveQuestionAnswers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveQuestionAnswers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveQuestionAnswers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteQuestionAnswers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteQuestionAnswers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteQuestionAnswers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteQuestionAnswers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteQuestionAnswers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteQuestionAnswers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectQuestionAnswers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectQuestionAnswers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectQuestionAnswers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listQuestionAnswers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistQuestionAnswers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listQuestionAnswers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexQuestion()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexQuestion() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexQuestion");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectQuestion()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectQuestion() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectQuestion");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editQuestion()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditQuestion() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editQuestion");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveQuestion()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveQuestion() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveQuestion");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newQuestion()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewQuestion() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newQuestion");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteQuestion()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteQuestion() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteQuestion");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteQuestion()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteQuestion() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteQuestion");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>questionControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetquestionControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/questionController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		QuestionController controller = (QuestionController) context.getBean("QuestionController");

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