package edu.yangsheng.domain;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllAnswers", query = "select myAnswer from Answer myAnswer"),
		@NamedQuery(name = "findAnswerByCreateTime", query = "select myAnswer from Answer myAnswer where myAnswer.createTime = ?1"),
		@NamedQuery(name = "findAnswerById", query = "select myAnswer from Answer myAnswer where myAnswer.id = ?1"),
		@NamedQuery(name = "findAnswerByPrimaryKey", query = "select myAnswer from Answer myAnswer where myAnswer.id = ?1"),
		@NamedQuery(name = "findAnswerByUser", query = "select myAnswer from Answer myAnswer where myAnswer.user.id = ?1"),
		@NamedQuery(name = "findAnswerByRecord", query = "select myAnswer from Answer myAnswer where myAnswer.record = ?1") })
@Table(catalog = "trhy", name = "answer")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "trhy/edu/yangsheng/domain", name = "Answer")
public class Answer implements Serializable {
	private static final long serialVersionUID = 1L;

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
	 * 记录
	 * 
	 */

	@Column(name = "record", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer record;
	/**
	 * 创建时间
	 * 
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", nullable = true)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar createTime;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	User user;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "question", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	Question question;

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
	 * 记录
	 * 
	 */
	public void setRecord(Integer record) {
		this.record = record;
	}

	/**
	 * 记录
	 * 
	 */
	public Integer getRecord() {
		return this.record;
	}

	/**
	 * 创建时间
	 * 
	 */
	public void setCreateTime(Calendar createTime) {
		this.createTime = createTime;
	}

	/**
	 * 创建时间
	 * 
	 */
	public Calendar getCreateTime() {
		return this.createTime;
	}

	/**
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 */
	public User getUser() {
		return user;
	}

	/**
	 */
	public void setQuestion(Question question) {
		this.question = question;
	}

	/**
	 */
	public Question getQuestion() {
		return question;
	}

	/**
	 */
	public Answer() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Answer that) {
		setId(that.getId());
		setRecord(that.getRecord());
		setCreateTime(that.getCreateTime());
		setUser(that.getUser());
		setQuestion(that.getQuestion());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("record=[").append(record).append("] ");
		buffer.append("createTime=[").append(createTime).append("] ");

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
		if (!(obj instanceof Answer))
			return false;
		Answer equalCheck = (Answer) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
