package edu.yangsheng.service;

import edu.yangsheng.dao.AnswerDAO;
import edu.yangsheng.dao.QuestionDAO;
import edu.yangsheng.dao.UserDAO;

import edu.yangsheng.domain.Answer;
import edu.yangsheng.domain.Question;
import edu.yangsheng.domain.User;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Answer entities
 * 
 */

@Service("AnswerService")
@Transactional
public class AnswerServiceImpl implements AnswerService {

	/**
	 * DAO injected by Spring that manages Answer entities
	 * 
	 */
	@Autowired
	private AnswerDAO answerDAO;

	/**
	 * DAO injected by Spring that manages Question entities
	 * 
	 */
	@Autowired
	private QuestionDAO questionDAO;

	/**
	 * DAO injected by Spring that manages User entities
	 * 
	 */
	@Autowired
	private UserDAO userDAO;

	/**
	 * Instantiates a new AnswerServiceImpl.
	 *
	 */
	public AnswerServiceImpl() {
	}

	/**
	 * Delete an existing Answer entity
	 * 
	 */
	@Transactional
	public void deleteAnswer(Answer answer) {
		answerDAO.remove(answer);
		answerDAO.flush();
	}

	/**
	 * Return all Answer entity
	 * 
	 */
	@Transactional
	public List<Answer> findAllAnswers(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Answer>(answerDAO.findAllAnswers(startResult, maxRows));
	}

	/**
	 * Delete an existing Question entity
	 * 
	 */
	@Transactional
	public Answer deleteAnswerQuestion(Integer answer_id, Integer related_question_id) {
		Answer answer = answerDAO.findAnswerByPrimaryKey(answer_id, -1, -1);
		Question related_question = questionDAO.findQuestionByPrimaryKey(related_question_id, -1, -1);

		answer.setQuestion(null);
		related_question.getAnswers().remove(answer);
		answer = answerDAO.store(answer);
		answerDAO.flush();

		related_question = questionDAO.store(related_question);
		questionDAO.flush();

		questionDAO.remove(related_question);
		questionDAO.flush();

		return answer;
	}

	/**
	 * Save an existing User entity
	 * 
	 */
	@Transactional
	public Answer saveAnswerUser(Integer id, User related_user) {
		Answer answer = answerDAO.findAnswerByPrimaryKey(id, -1, -1);
		User existinguser = userDAO.findUserByPrimaryKey(related_user.getId());

		// copy into the existing record to preserve existing relationships
		if (existinguser != null) {
			existinguser.setId(related_user.getId());
			existinguser.setBirthday(related_user.getBirthday());
			existinguser.setBirthplace(related_user.getBirthplace());
			existinguser.setCurrentAddress(related_user.getCurrentAddress());
			existinguser.setEmail(related_user.getEmail());
			existinguser.setInterest(related_user.getInterest());
			existinguser.setMobile(related_user.getMobile());
			existinguser.setName(related_user.getName());
			existinguser.setSex(related_user.getSex());
			existinguser.setSleepTime(related_user.getSleepTime());
			related_user = existinguser;
		}

		answer.setUser(related_user);
		related_user.getAnswers().add(answer);
		answer = answerDAO.store(answer);
		answerDAO.flush();

		related_user = userDAO.store(related_user);
		userDAO.flush();

		return answer;
	}

	/**
	 */
	@Transactional
	public Answer findAnswerByPrimaryKey(Integer id) {
		return answerDAO.findAnswerByPrimaryKey(id);
	}

	/**
	 * Delete an existing User entity
	 * 
	 */
	@Transactional
	public Answer deleteAnswerUser(Integer answer_id, Integer related_user_id) {
		Answer answer = answerDAO.findAnswerByPrimaryKey(answer_id, -1, -1);
		User related_user = userDAO.findUserByPrimaryKey(related_user_id, -1, -1);

		answer.setUser(null);
		related_user.getAnswers().remove(answer);
		answer = answerDAO.store(answer);
		answerDAO.flush();

		related_user = userDAO.store(related_user);
		userDAO.flush();

		userDAO.remove(related_user);
		userDAO.flush();

		return answer;
	}

	/**
	 * Save an existing Question entity
	 * 
	 */
	@Transactional
	public Answer saveAnswerQuestion(Integer id, Question related_question) {
		Answer answer = answerDAO.findAnswerByPrimaryKey(id, -1, -1);
		Question existingquestion = questionDAO.findQuestionByPrimaryKey(related_question.getId());

		// copy into the existing record to preserve existing relationships
		if (existingquestion != null) {
			existingquestion.setId(related_question.getId());
			existingquestion.setQuestionField(related_question.getQuestionField());
			related_question = existingquestion;
		}

		answer.setQuestion(related_question);
		related_question.getAnswers().add(answer);
		answer = answerDAO.store(answer);
		answerDAO.flush();

		related_question = questionDAO.store(related_question);
		questionDAO.flush();

		return answer;
	}

	/**
	 * Save an existing Answer entity
	 * 
	 */
	@Transactional
	public void saveAnswer(Answer answer) {
		Answer existingAnswer = answerDAO.findAnswerByPrimaryKey(answer.getId());

		if (existingAnswer != null) {
			if (existingAnswer != answer) {
				existingAnswer.setId(answer.getId());
				existingAnswer.setRecord(answer.getRecord());
				existingAnswer.setCreateTime(answer.getCreateTime());
			}
			answer = answerDAO.store(existingAnswer);
		} else {
			answer = answerDAO.store(answer);
		}
		answerDAO.flush();
	}

	/**
	 * Return a count of all Answer entity
	 * 
	 */
	@Transactional
	public Integer countAnswers() {
		return ((Long) answerDAO.createQuerySingleResult("select count(o) from Answer o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Answer entity
	 * 
	 */
	@Transactional
	public Set<Answer> loadAnswers() {
		return answerDAO.findAllAnswers();
	}
}
