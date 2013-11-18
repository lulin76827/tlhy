package edu.yangsheng.domain;

import java.io.Serializable;

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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllPathogenesiss", query = "select myPathogenesis from Pathogenesis myPathogenesis"),
		@NamedQuery(name = "findPathogenesisByDescrib", query = "select myPathogenesis from Pathogenesis myPathogenesis where myPathogenesis.describ = ?1"),
		@NamedQuery(name = "findPathogenesisByDescribContaining", query = "select myPathogenesis from Pathogenesis myPathogenesis where myPathogenesis.describ like ?1"),
		@NamedQuery(name = "findPathogenesisById", query = "select myPathogenesis from Pathogenesis myPathogenesis where myPathogenesis.id = ?1"),
		@NamedQuery(name = "findPathogenesisByPathogenesisField", query = "select myPathogenesis from Pathogenesis myPathogenesis where myPathogenesis.pathogenesisField = ?1"),
		@NamedQuery(name = "findPathogenesisByPathogenesisFieldContaining", query = "select myPathogenesis from Pathogenesis myPathogenesis where myPathogenesis.pathogenesisField like ?1"),
		@NamedQuery(name = "findPathogenesisByPrimaryKey", query = "select myPathogenesis from Pathogenesis myPathogenesis where myPathogenesis.id = ?1"),
		@NamedQuery(name = "findPathogenesisByType", query = "select myPathogenesis from Pathogenesis myPathogenesis where myPathogenesis.type = ?1"),
		@NamedQuery(name = "findPathogenesisByTypeContaining", query = "select myPathogenesis from Pathogenesis myPathogenesis where myPathogenesis.type like ?1") })
@Table(catalog = "trhy", name = "pathogenesis")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "trhy/edu/yangsheng/domain", name = "Pathogenesis")
public class Pathogenesis implements Serializable {
	private static final long serialVersionUID = 1L;

	public static enum PathogenesisType {
		work_way("工作方式"), living_habits("生活习惯"), diet_habits("饮食习惯"), climate_changes(
				"气候变化"), modern_changes("情志变化"), other("其他");
		String label;

		private PathogenesisType(String label) {
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
	 * 描述
	 * 
	 */

	@Column(name = "describ", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String describ;
	/**
	 * 病理
	 * 
	 */

	@Column(name = "pathogenesis", length = 500, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String pathogenesisField;
	/**
	 * 类型，工作方式、生活习惯、饮食习惯、气候变化、情志变化还是其他方面
	 * 
	 */

	@Column(name = "type", length = 15, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	PathogenesisType type;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "category", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	Category category;

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
	 * 病理
	 * 
	 */
	public void setPathogenesisField(String pathogenesisField) {
		this.pathogenesisField = pathogenesisField;
	}

	/**
	 * 病理
	 * 
	 */
	public String getPathogenesisField() {
		return this.pathogenesisField;
	}

	/**
	 * 类型，工作方式、生活习惯、饮食习惯、气候变化、情志变化还是其他方面
	 * 
	 */
	public void setType(PathogenesisType type) {
		this.type = type;
	}

	/**
	 * 类型，工作方式、生活习惯、饮食习惯、气候变化、情志变化还是其他方面
	 * 
	 */
	public PathogenesisType getType() {
		return this.type;
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
	public Pathogenesis() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 * 
	 */
	public void copy(Pathogenesis that) {
		setId(that.getId());
		setDescrib(that.getDescrib());
		setPathogenesisField(that.getPathogenesisField());
		setType(that.getType());
		setCategory(that.getCategory());
	}

	/**
	 * Returns a textual representation of a bean.
	 * 
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("describ=[").append(describ).append("] ");
		buffer.append("pathogenesisField=[").append(pathogenesisField)
				.append("] ");
		buffer.append("type=[").append(type).append("] ");

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
		if (!(obj instanceof Pathogenesis))
			return false;
		Pathogenesis equalCheck = (Pathogenesis) obj;
		if ((id == null && equalCheck.id != null)
				|| (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
