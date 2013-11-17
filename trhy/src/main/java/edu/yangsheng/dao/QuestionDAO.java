package edu.yangsheng.dao;

import edu.yangsheng.domain.Question;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Question entities.
 * 
 */
public interface QuestionDAO extends JpaDao<Question> {

	/**
	 * JPQL Query - findQuestionByQuestionFieldContaining
	 *
	 */
	public Set<Question> findQuestionByQuestionFieldContaining(String questionField) throws DataAccessException;

	/**
	 * JPQL Query - findQuestionByQuestionFieldContaining
	 *
	 */
	public Set<Question> findQuestionByQuestionFieldContaining(String questionField, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findQuestionByPrimaryKey
	 *
	 */
	public Question findQuestionByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findQuestionByPrimaryKey
	 *
	 */
	public Question findQuestionByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findQuestionById
	 *
	 */
	public Question findQuestionById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findQuestionById
	 *
	 */
	public Question findQuestionById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllQuestions
	 *
	 */
	public Set<Question> findAllQuestions() throws DataAccessException;

	/**
	 * JPQL Query - findAllQuestions
	 *
	 */
	public Set<Question> findAllQuestions(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findQuestionByQuestionField
	 *
	 */
	public Set<Question> findQuestionByQuestionField(String questionField_1) throws DataAccessException;

	/**
	 * JPQL Query - findQuestionByQuestionField
	 *
	 */
	public Set<Question> findQuestionByQuestionField(String questionField_1, int startResult, int maxRows) throws DataAccessException;

}