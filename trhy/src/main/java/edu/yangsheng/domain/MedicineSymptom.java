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
		@NamedQuery(name = "findAllMedicineSymptoms", query = "select myMedicineSymptom from MedicineSymptom myMedicineSymptom"),
		@NamedQuery(name = "findMedicineSymptomById", query = "select myMedicineSymptom from MedicineSymptom myMedicineSymptom where myMedicineSymptom.id = ?1"),
		@NamedQuery(name = "findMedicineSymptomByPrimaryKey", query = "select myMedicineSymptom from MedicineSymptom myMedicineSymptom where myMedicineSymptom.id = ?1") })
@Table(catalog = "trhy", name = "medicine_symptom")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "trhy/edu/yangsheng/domain", name = "MedicineSymptom")
public class MedicineSymptom implements Serializable {
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
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "symptomcol", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	Symptom symptom;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "medicine", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	Medicine medicine;

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
	 */
	public void setSymptom(Symptom symptom) {
		this.symptom = symptom;
	}

	/**
	 */
	public Symptom getSymptom() {
		return symptom;
	}

	/**
	 */
	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	/**
	 */
	public Medicine getMedicine() {
		return medicine;
	}

	/**
	 */
	public MedicineSymptom() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(MedicineSymptom that) {
		setId(that.getId());
		setSymptom(that.getSymptom());
		setMedicine(that.getMedicine());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");

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
		if (!(obj instanceof MedicineSymptom))
			return false;
		MedicineSymptom equalCheck = (MedicineSymptom) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
