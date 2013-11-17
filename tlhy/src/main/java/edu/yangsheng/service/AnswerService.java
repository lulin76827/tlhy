package edu.yangsheng.service;

import edu.yangsheng.domain.Answer;
import edu.yangsheng.domain.Question;
import edu.yangsheng.domain.User;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Answer entities
 * 
 */
public interface AnswerService {

	/**
	 * Delete an existing Answer entity
	 * 
	 */
	public void deleteAnswer(Answer answer);

	/**
	 * Return all Answer entity
	 * 
	 */
	public List<Answer> findAllAnswers(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Question entity
	 * 
	 */
	public Answer deleteAnswerQuestion(Integer answer_id, Integer related_question_id);

	/**
	 * Save an existing User entity
	 * 
	 */
	public Answer saveAnswerUser(Integer id, User related_user);

	/**
	 */
	public Answer findAnswerByPrimaryKey(Integer id_1);

	/**
	 * Delete an existing User entity
	 * 
	 */
	public Answer deleteAnswerUser(Integer answer_id_1, Integer related_user_id);

	/**
	 * Save an existing Question entity
	 * 
	 */
	public Answer saveAnswerQuestion(Integer id_2, Question related_question);

	/**
	 * Save an existing Answer entity
	 * 
	 */
	public void saveAnswer(Answer answer_1);

	/**
	 * Return a count of all Answer entity
	 * 
	 */
	public Integer countAnswers();

	/**
	 * Load an existing Answer entity
	 * 
	 */
	public Set<Answer> loadAnswers();
}