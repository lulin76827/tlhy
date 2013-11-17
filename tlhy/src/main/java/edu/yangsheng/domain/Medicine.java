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
		@NamedQuery(name = "findAllMedicines", query = "select myMedicine from Medicine myMedicine"),
		@NamedQuery(name = "findMedicineByDescrib", query = "select myMedicine from Medicine myMedicine where myMedicine.describ = ?1"),
		@NamedQuery(name = "findMedicineByDescribContaining", query = "select myMedicine from Medicine myMedicine where myMedicine.describ like ?1"),
		@NamedQuery(name = "findMedicineById", query = "select myMedicine from Medicine myMedicine where myMedicine.id = ?1"),
		@NamedQuery(name = "findMedicineByMedicineField", query = "select myMedicine from Medicine myMedicine where myMedicine.medicineField = ?1"),
		@NamedQuery(name = "findMedicineByMedicineFieldContaining", query = "select myMedicine from Medicine myMedicine where myMedicine.medicineField like ?1"),
		@NamedQuery(name = "findMedicineByPrimaryKey", query = "select myMedicine from Medicine myMedicine where myMedicine.id = ?1"),
		@NamedQuery(name = "findMedicineByType", query = "select myMedicine from Medicine myMedicine where myMedicine.type = ?1"),
		@NamedQuery(name = "findMedicineByTypeContaining", query = "select myMedicine from Medicine myMedicine where myMedicine.type like ?1") })
@Table(catalog = "tlhy", name = "medicine")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "tlhy/edu/yangsheng/domain", name = "Medicine")
@XmlRootElement(namespace = "tlhy/edu/yangsheng/domain")
public class Medicine implements Serializable {
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
	 * 描述
	 * 
	 */

	@Column(name = "describ", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String describ;
	/**
	 * 药物
	 * 
	 */

	@Column(name = "medicine", length = 45, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String medicineField;
	/**
	 * 药物类型，是精神上的、生活上的、运动和饮食等
	 * 
	 */

	@Column(name = "type", length = 7)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String type;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "category", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	Category category;
	/**
	 */
	@OneToMany(mappedBy = "medicine", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<edu.yangsheng.domain.MedicineSymptom> medicineSymptoms;

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
	 * 药物
	 * 
	 */
	public void setMedicineField(String medicineField) {
		this.medicineField = medicineField;
	}

	/**
	 * 药物
	 * 
	 */
	public String getMedicineField() {
		return this.medicineField;
	}

	/**
	 * 药物类型，是精神上的、生活上的、运动和饮食等
	 * 
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 药物类型，是精神上的、生活上的、运动和饮食等
	 * 
	 */
	public String getType() {
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
	public void setMedicineSymptoms(Set<MedicineSymptom> medicineSymptoms) {
		this.medicineSymptoms = medicineSymptoms;
	}

	/**
	 */
	public Set<MedicineSymptom> getMedicineSymptoms() {
		if (medicineSymptoms == null) {
			medicineSymptoms = new java.util.LinkedHashSet<edu.yangsheng.domain.MedicineSymptom>();
		}
		return medicineSymptoms;
	}

	/**
	 */
	public Medicine() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Medicine that) {
		setId(that.getId());
		setDescrib(that.getDescrib());
		setMedicineField(that.getMedicineField());
		setType(that.getType());
		setCategory(that.getCategory());
		setMedicineSymptoms(new java.util.LinkedHashSet<edu.yangsheng.domain.MedicineSymptom>(that.getMedicineSymptoms()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("describ=[").append(describ).append("] ");
		buffer.append("medicineField=[").append(medicineField).append("] ");
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
		if (!(obj instanceof Medicine))
			return false;
		Medicine equalCheck = (Medicine) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
