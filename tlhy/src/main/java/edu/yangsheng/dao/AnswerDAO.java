package edu.yangsheng.dao;

import edu.yangsheng.domain.Answer;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Answer entities.
 * 
 */
public interface AnswerDAO extends JpaDao<Answer> {

	/**
	 * JPQL Query - findAnswerByPrimaryKey
	 *
	 */
	public Answer findAnswerByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findAnswerByPrimaryKey
	 *
	 */
	public Answer findAnswerByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllAnswers
	 *
	 */
	public Set<Answer> findAllAnswers() throws DataAccessException;

	/**
	 * JPQL Query - findAllAnswers
	 *
	 */
	public Set<Answer> findAllAnswers(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAnswerByCreateTime
	 *
	 */
	public Set<Answer> findAnswerByCreateTime(java.util.Calendar createTime) throws DataAccessException;

	/**
	 * JPQL Query - findAnswerByCreateTime
	 *
	 */
	public Set<Answer> findAnswerByCreateTime(Calendar createTime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAnswerById
	 *
	 */
	public Answer findAnswerById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findAnswerById
	 *
	 */
	public Answer findAnswerById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAnswerByRecord
	 *
	 */
	public Set<Answer> findAnswerByRecord(Integer record) throws DataAccessException;

	/**
	 * JPQL Query - findAnswerByRecord
	 *
	 */
	public Set<Answer> findAnswerByRecord(Integer record, int startResult, int maxRows) throws DataAccessException;

}