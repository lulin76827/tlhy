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
 * Unit test for the <code>AnswerController</code> controller.
 *
 * @see edu.yangsheng.web.AnswerController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/tlhy-security-context.xml",
		"file:./src/main/resources/tlhy-service-context.xml",
		"file:./src/main/resources/tlhy-dao-context.xml",
		"file:./src/main/resources/tlhy-web-context.xml" })
public class AnswerControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editAnswerUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAnswerUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAnswerUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAnswerUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAnswerUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAnswerUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAnswerUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAnswerUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAnswerUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAnswerUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAnswerUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAnswerUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAnswerUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAnswerUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAnswerUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAnswerUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAnswerUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAnswerUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listAnswerUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistAnswerUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listAnswerUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editAnswerQuestion()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAnswerQuestion() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAnswerQuestion");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAnswerQuestion()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAnswerQuestion() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAnswerQuestion");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAnswerQuestion()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAnswerQuestion() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAnswerQuestion");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAnswerQuestion()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAnswerQuestion() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAnswerQuestion");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAnswerQuestion()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAnswerQuestion() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAnswerQuestion");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAnswerQuestion()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAnswerQuestion() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAnswerQuestion");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listAnswerQuestion()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistAnswerQuestion() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listAnswerQuestion");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexAnswer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexAnswer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexAnswer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAnswer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAnswer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAnswer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editAnswer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAnswer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAnswer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAnswer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAnswer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAnswer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAnswer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAnswer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAnswer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAnswer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAnswer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAnswer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAnswer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAnswer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAnswer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>answerControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetanswerControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/answerController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AnswerController controller = (AnswerController) context.getBean("AnswerController");

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