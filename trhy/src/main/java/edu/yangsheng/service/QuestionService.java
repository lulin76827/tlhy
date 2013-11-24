package edu.yangsheng.service;

import edu.yangsheng.domain.Answer;
import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.Question;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Question entities
 * 
 */
public interface QuestionService {

	/**
	 * Save an existing Answer entity
	 * 
	 */
	public Question saveQuestionAnswers(Integer id, Answer related_answers);

	/**
	 * Save an existing Category entity
	 * 
	 */
	public Question saveQuestionCategory(Integer id_1, Category related_category);

	/**
	 * Return all Question entity
	 * 
	 */
	public List<Question> findAllQuestions(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all Question entity
	 * 
	 */
	public Integer countQuestions();

	/**
	 * Delete an existing Question entity
	 * 
	 */
	public void deleteQuestion(Question question);

	/**
	 * Delete an existing Answer entity
	 * 
	 */
	public Question deleteQuestionAnswers(Integer question_id, Integer related_answers_id);

	/**
	 */
	public Question findQuestionByPrimaryKey(Integer id_2);

	/**
	 * Save an existing Question entity
	 * 
	 */
	public void saveQuestion(Question question_1);

	/**
	 * Delete an existing Category entity
	 * 
	 */
	public Question deleteQuestionCategory(Integer question_id_1, Integer related_category_id);

	/**
	 * Load an existing Question entity
	 * 
	 */
	public Set<Question> loadQuestions();

	public List<Question> findNextGroupQuestions(Integer user);
}