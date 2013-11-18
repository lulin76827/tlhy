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
 * 症状
 * 
 * @author Administrator
 * 
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllSymptoms", query = "select mySymptom from Symptom mySymptom"),
		@NamedQuery(name = "findSymptomByDescrib", query = "select mySymptom from Symptom mySymptom where mySymptom.describ = ?1"),
		@NamedQuery(name = "findSymptomByDescribContaining", query = "select mySymptom from Symptom mySymptom where mySymptom.describ like ?1"),
		@NamedQuery(name = "findSymptomById", query = "select mySymptom from Symptom mySymptom where mySymptom.id = ?1"),
		@NamedQuery(name = "findSymptomByNormal", query = "select mySymptom from Symptom mySymptom where mySymptom.normal = ?1"),
		@NamedQuery(name = "findSymptomByPrimaryKey", query = "select mySymptom from Symptom mySymptom where mySymptom.id = ?1"),
		@NamedQuery(name = "findSymptomBySymptomField", query = "select mySymptom from Symptom mySymptom where mySymptom.symptomField = ?1"),
		@NamedQuery(name = "findSymptomBySymptomFieldContaining", query = "select mySymptom from Symptom mySymptom where mySymptom.symptomField like ?1"),
		@NamedQuery(name = "findSymptomByType", query = "select mySymptom from Symptom mySymptom where mySymptom.type = ?1"),
		@NamedQuery(name = "findSymptomByTypeContaining", query = "select mySymptom from Symptom mySymptom where mySymptom.type like ?1") })
@Table(catalog = "trhy", name = "symptom")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "trhy/edu/yangsheng/domain", name = "Symptom")
@XmlRootElement(namespace = "trhy/edu/yangsheng/domain")
public class Symptom implements Serializable {
	private static final long serialVersionUID = 1L;

	public static enum SymptomType {
		spirit("精神上的"), action("行动上的"), body("身体上的"), other("其他");
		String label;

		private SymptomType(String label) {
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
	 * 症状
	 * 
	 */

	@Column(name = "symptom", length = 500, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String symptomField;
	/**
	 * 正常还是失衡
	 * 
	 */

	@Column(name = "normal", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean normal;
	/**
	 * 症状类型，是精神上的、行动上的还是身体上的
	 * 
	 */

	@Column(name = "type", length = 7, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	SymptomType type;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "category", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	Category category;
	/**
	 */
	@OneToMany(mappedBy = "symptom", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
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
	 * 症状
	 * 
	 */
	public void setSymptomField(String symptomField) {
		this.symptomField = symptomField;
	}

	/**
	 * 症状
	 * 
	 */
	public String getSymptomField() {
		return this.symptomField;
	}

	/**
	 * 正常还是失衡
	 * 
	 */
	public void setNormal(Boolean normal) {
		this.normal = normal;
	}

	/**
	 * 正常还是失衡
	 * 
	 */
	public Boolean getNormal() {
		return this.normal;
	}

	/**
	 * 症状类型，是精神上的、行动上的还是身体上的
	 * 
	 */
	public void setType(SymptomType type) {
		this.type = type;
	}

	/**
	 * 症状类型，是精神上的、行动上的还是身体上的
	 * 
	 */
	public SymptomType getType() {
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
	public Symptom() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 * 
	 */
	public void copy(Symptom that) {
		setId(that.getId());
		setDescrib(that.getDescrib());
		setSymptomField(that.getSymptomField());
		setNormal(that.getNormal());
		setType(that.getType());
		setCategory(that.getCategory());
		setMedicineSymptoms(new java.util.LinkedHashSet<edu.yangsheng.domain.MedicineSymptom>(
				that.getMedicineSymptoms()));
	}

	/**
	 * Returns a textual representation of a bean.
	 * 
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("describ=[").append(describ).append("] ");
		buffer.append("symptomField=[").append(symptomField).append("] ");
		buffer.append("normal=[").append(normal).append("] ");
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
		if (!(obj instanceof Symptom))
			return false;
		Symptom equalCheck = (Symptom) obj;
		if ((id == null && equalCheck.id != null)
				|| (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
