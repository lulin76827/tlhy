package edu.yangsheng.service;

import edu.yangsheng.dao.AnswerDAO;
import edu.yangsheng.dao.CategoryDAO;
import edu.yangsheng.dao.QuestionDAO;

import edu.yangsheng.domain.Answer;
import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.Question;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Question entities
 * 
 */

@Service("QuestionService")
@Transactional
public class QuestionServiceImpl implements QuestionService {

	/**
	 * DAO injected by Spring that manages Answer entities
	 * 
	 */
	@Autowired
	private AnswerDAO answerDAO;

	/**
	 * DAO injected by Spring that manages Category entities
	 * 
	 */
	@Autowired
	private CategoryDAO categoryDAO;

	/**
	 * DAO injected by Spring that manages Question entities
	 * 
	 */
	@Autowired
	private QuestionDAO questionDAO;

	/**
	 * Instantiates a new QuestionServiceImpl.
	 *
	 */
	public QuestionServiceImpl() {
	}

	/**
	 * Save an existing Answer entity
	 * 
	 */
	@Transactional
	public Question saveQuestionAnswers(Integer id, Answer related_answers) {
		Question question = questionDAO.findQuestionByPrimaryKey(id, -1, -1);
		Answer existinganswers = answerDAO.findAnswerByPrimaryKey(related_answers.getId());

		// copy into the existing record to preserve existing relationships
		if (existinganswers != null) {
			existinganswers.setId(related_answers.getId());
			existinganswers.setRecord(related_answers.getRecord());
			existinganswers.setCreateTime(related_answers.getCreateTime());
			related_answers = existinganswers;
		}

		related_answers.setQuestion(question);
		question.getAnswers().add(related_answers);
		related_answers = answerDAO.store(related_answers);
		answerDAO.flush();

		question = questionDAO.store(question);
		questionDAO.flush();

		return question;
	}

	/**
	 * Save an existing Category entity
	 * 
	 */
	@Transactional
	public Question saveQuestionCategory(Integer id, Category related_category) {
		Question question = questionDAO.findQuestionByPrimaryKey(id, -1, -1);
		Category existingcategory = categoryDAO.findCategoryByPrimaryKey(related_category.getId());

		// copy into the existing record to preserve existing relationships
		if (existingcategory != null) {
			existingcategory.setId(related_category.getId());
			existingcategory.setCategoryField(related_category.getCategoryField());
			existingcategory.setDescrib(related_category.getDescrib());
			related_category = existingcategory;
		}

		question.setCategory(related_category);
		related_category.getQuestions().add(question);
		question = questionDAO.store(question);
		questionDAO.flush();

		related_category = categoryDAO.store(related_category);
		categoryDAO.flush();

		return question;
	}

	/**
	 * Return all Question entity
	 * 
	 */
	@Transactional
	public List<Question> findAllQuestions(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Question>(questionDAO.findAllQuestions(startResult, maxRows));
	}

	/**
	 * Return a count of all Question entity
	 * 
	 */
	@Transactional
	public Integer countQuestions() {
		return ((Long) questionDAO.createQuerySingleResult("select count(o) from Question o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Question entity
	 * 
	 */
	@Transactional
	public void deleteQuestion(Question question) {
		questionDAO.remove(question);
		questionDAO.flush();
	}

	/**
	 * Delete an existing Answer entity
	 * 
	 */
	@Transactional
	public Question deleteQuestionAnswers(Integer question_id, Integer related_answers_id) {
		Answer related_answers = answerDAO.findAnswerByPrimaryKey(related_answers_id, -1, -1);

		Question question = questionDAO.findQuestionByPrimaryKey(question_id, -1, -1);

		related_answers.setQuestion(null);
		question.getAnswers().remove(related_answers);

		answerDAO.remove(related_answers);
		answerDAO.flush();

		return question;
	}

	/**
	 */
	@Transactional
	public Question findQuestionByPrimaryKey(Integer id) {
		return questionDAO.findQuestionByPrimaryKey(id);
	}

	/**
	 * Save an existing Question entity
	 * 
	 */
	@Transactional
	public void saveQuestion(Question question) {
		Question existingQuestion = questionDAO.findQuestionByPrimaryKey(question.getId());

		if (existingQuestion != null) {
			if (existingQuestion != question) {
				existingQuestion.setId(question.getId());
				existingQuestion.setQuestionField(question.getQuestionField());
			}
			question = questionDAO.store(existingQuestion);
		} else {
			question = questionDAO.store(question);
		}
		questionDAO.flush();
	}

	/**
	 * Delete an existing Category entity
	 * 
	 */
	@Transactional
	public Question deleteQuestionCategory(Integer question_id, Integer related_category_id) {
		Question question = questionDAO.findQuestionByPrimaryKey(question_id, -1, -1);
		Category related_category = categoryDAO.findCategoryByPrimaryKey(related_category_id, -1, -1);

		question.setCategory(null);
		related_category.getQuestions().remove(question);
		question = questionDAO.store(question);
		questionDAO.flush();

		related_category = categoryDAO.store(related_category);
		categoryDAO.flush();

		categoryDAO.remove(related_category);
		categoryDAO.flush();

		return question;
	}

	/**
	 * Load an existing Question entity
	 * 
	 */
	@Transactional
	public Set<Question> loadQuestions() {
		return questionDAO.findAllQuestions();
	}
}
