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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllCategorys", query = "select myCategory from Category myCategory"),
		@NamedQuery(name = "findCategoryByCategoryField", query = "select myCategory from Category myCategory where myCategory.categoryField = ?1"),
		@NamedQuery(name = "findCategoryByCategoryFieldContaining", query = "select myCategory from Category myCategory where myCategory.categoryField like ?1"),
		@NamedQuery(name = "findCategoryByDescrib", query = "select myCategory from Category myCategory where myCategory.describ = ?1"),
		@NamedQuery(name = "findCategoryByDescribContaining", query = "select myCategory from Category myCategory where myCategory.describ like ?1"),
		@NamedQuery(name = "findCategoryById", query = "select myCategory from Category myCategory where myCategory.id = ?1"),
		@NamedQuery(name = "findCategoryByPrimaryKey", query = "select myCategory from Category myCategory where myCategory.id = ?1") })
@Table(catalog = "tlhy", name = "category")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "tlhy/edu/yangsheng/domain", name = "Category")
@XmlRootElement(namespace = "tlhy/edu/yangsheng/domain")
public class Category implements Serializable {
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
	 * 分类
	 * 
	 */

	@Column(name = "category", length = 100, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String categoryField;
	/**
	 * 描述
	 * 
	 */

	@Column(name = "describ", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String describ;

	/**
	 */
	@OneToMany(mappedBy = "category", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<edu.yangsheng.domain.Symptom> symptoms;
	/**
	 */
	@OneToMany(mappedBy = "category", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<edu.yangsheng.domain.Question> questions;
	/**
	 */
	@OneToMany(mappedBy = "category", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<edu.yangsheng.domain.Medicine> medicines;
	/**
	 */
	@OneToMany(mappedBy = "category", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<edu.yangsheng.domain.Pathogenesis> pathogenesises;
	/**
	 */
	@OneToMany(mappedBy = "category", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<edu.yangsheng.domain.UserCategory> userCategories;

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
	 * 分类
	 * 
	 */
	public void setCategoryField(String categoryField) {
		this.categoryField = categoryField;
	}

	/**
	 * 分类
	 * 
	 */
	public String getCategoryField() {
		return this.categoryField;
	}

	/**
	 * 描述
	 * 
	 */
	public void setDescrib(String describ) {
		this.describ = describ;
	}

	/**
	 * 描述
	 * 
	 */
	public String getDescrib() {
		return this.describ;
	}

	/**
	 */
	public void setSymptoms(Set<Symptom> symptoms) {
		this.symptoms = symptoms;
	}

	/**
	 */
	public Set<Symptom> getSymptoms() {
		if (symptoms == null) {
			symptoms = new java.util.LinkedHashSet<edu.yangsheng.domain.Symptom>();
		}
		return symptoms;
	}

	/**
	 */
	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	/**
	 */
	public Set<Question> getQuestions() {
		if (questions == null) {
			questions = new java.util.LinkedHashSet<edu.yangsheng.domain.Question>();
		}
		return questions;
	}

	/**
	 */
	public void setMedicines(Set<Medicine> medicines) {
		this.medicines = medicines;
	}

	/**
	 */
	public Set<Medicine> getMedicines() {
		if (medicines == null) {
			medicines = new java.util.LinkedHashSet<edu.yangsheng.domain.Medicine>();
		}
		return medicines;
	}

	/**
	 */
	public void setPathogenesises(Set<Pathogenesis> pathogenesises) {
		this.pathogenesises = pathogenesises;
	}

	/**
	 */
	public Set<Pathogenesis> getPathogenesises() {
		if (pathogenesises == null) {
			pathogenesises = new java.util.LinkedHashSet<edu.yangsheng.domain.Pathogenesis>();
		}
		return pathogenesises;
	}

	/**
	 */
	public void setUserCategories(Set<UserCategory> userCategories) {
		this.userCategories = userCategories;
	}

	/**
	 */
	public Set<UserCategory> getUserCategories() {
		if (userCategories == null) {
			userCategories = new java.util.LinkedHashSet<edu.yangsheng.domain.UserCategory>();
		}
		return userCategories;
	}

	/**
	 */
	public Category() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Category that) {
		setId(that.getId());
		setCategoryField(that.getCategoryField());
		setDescrib(that.getDescrib());
		setSymptoms(new java.util.LinkedHashSet<edu.yangsheng.domain.Symptom>(that.getSymptoms()));
		setQuestions(new java.util.LinkedHashSet<edu.yangsheng.domain.Question>(that.getQuestions()));
		setMedicines(new java.util.LinkedHashSet<edu.yangsheng.domain.Medicine>(that.getMedicines()));
		setPathogenesises(new java.util.LinkedHashSet<edu.yangsheng.domain.Pathogenesis>(that.getPathogenesises()));
		setUserCategories(new java.util.LinkedHashSet<edu.yangsheng.domain.UserCategory>(that.getUserCategories()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("categoryField=[").append(categoryField).append("] ");
		buffer.append("describ=[").append(describ).append("] ");

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
		if (!(obj instanceof Category))
			return false;
		Category equalCheck = (Category) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
