package edu.yangsheng.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllQuestions", query = "select myQuestion from Question myQuestion order by id desc"),
		@NamedQuery(name = "findQuestionById", query = "select myQuestion from Question myQuestion where myQuestion.id = ?1"),
		@NamedQuery(name = "findQuestionByPrimaryKey", query = "select myQuestion from Question myQuestion where myQuestion.id = ?1"),
		@NamedQuery(name = "findQuestionByCategory", query = "select myQuestion from Question myQuestion where myQuestion.category.id = ?1"),
		@NamedQuery(name = "findQuestionByQuestionField", query = "select myQuestion from Question myQuestion where myQuestion.questionField = ?1"),
		@NamedQuery(name = "findQuestionByQuestionFieldContaining", query = "select myQuestion from Question myQuestion where myQuestion.questionField like ?1") })
@Table(catalog = "trhy", name = "question")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "trhy/edu/yangsheng/domain", name = "Question")
@XmlRootElement(namespace = "trhy/edu/yangsheng/domain")
public class Question implements Serializable {
	private static final long serialVersionUID = 1L;

	public static enum QueryType {
		appearance("身体结构与外观"), metabolism("新陈代谢"), psychological("心理特征");
		String label;

		private QueryType(String label) {
			this.label = label;
		}

		public String getLabel() {
			return label;
		}

		public String getName() {
			return this.name();
		}

	}

	/**
	 * 编号
	 * 
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@XmlElement
	Integer id;
	/**
	 * 问题类型，是外观、新陈代谢或者心理特征
	 */
	@Column(name = "type")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	QueryType type;
	/**
	 * 所属项目
	 * 
	 */

	@Column(name = "item", length = 200, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String questionItem;
	/**
	 * 问题
	 * 
	 */

	@Column(name = "question", length = 2000, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String questionField;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "category", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	Category category;
	/**
	 */
	@OneToMany(mappedBy = "question", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<edu.yangsheng.domain.Answer> answers;

	/**
	 * 编号
	 * 
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 编号
	 * 
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * 问题类型，是外观、新陈代谢或者心理特征
	 * 
	 * @return
	 */
	public QueryType getType() {
		return type;
	}

	/**
	 * 问题类型，是外观、新陈代谢或者心理特征
	 * 
	 * @param type
	 */
	public void setType(QueryType type) {
		this.type = type;
	}

	/**
	 * 所属项目
	 * 
	 * @return
	 */
	public String getQuestionItem() {
		return questionItem;
	}

	/**
	 * 所属项目
	 * 
	 * @param questionItem
	 */
	public void setQuestionItem(String questionItem) {
		this.questionItem = questionItem;
	}

	/**
	 * 问题
	 * 
	 */
	public void setQuestionField(String questionField) {
		this.questionField = questionField;
	}

	/**
	 * 问题
	 * 
	 */
	public String getQuestionField() {
		return this.questionField;
	}

	/**
	 * 问题标签
	 * 
	 * @return
	 */
	public String getLabel() {
		return this.type.label + "\t" + this.questionItem + "\t" + this.questionField;
	}

	/**
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	/**
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 */
	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}

	/**
	 */
	public Set<Answer> getAnswers() {
		if (answers == null) {
			answers = new java.util.LinkedHashSet<edu.yangsheng.domain.Answer>();
		}
		return answers;
	}

	/**
	 */
	public Question() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 * 
	 */
	public void copy(Question that) {
		setId(that.getId());
		setType(that.getType());
		setQuestionItem(that.getQuestionItem());
		setQuestionField(that.getQuestionField());
		setCategory(that.getCategory());
		setAnswers(new java.util.LinkedHashSet<edu.yangsheng.domain.Answer>(
				that.getAnswers()));
	}

	/**
	 * Returns a textual representation of a bean.
	 * 
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("questionField=[").append(questionField).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Question))
			return false;
		Question equalCheck = (Question) obj;
		if ((id == null && equalCheck.id != null)
				|| (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
