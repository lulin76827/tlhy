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
		@NamedQuery(name = "findAccountByAdministrator", query = "select myAccount from Account myAccount where myAccount.administrator = ?1"),
		@NamedQuery(name = "findAccountById", query = "select myAccount from Account myAccount where myAccount.id = ?1"),
		@NamedQuery(name = "findAccountByPassword", query = "select myAccount from Account myAccount where myAccount.password = ?1"),
		@NamedQuery(name = "findAccountByPasswordContaining", query = "select myAccount from Account myAccount where myAccount.password like ?1"),
		@NamedQuery(name = "findAccountByPrimaryKey", query = "select myAccount from Account myAccount where myAccount.id = ?1"),
		@NamedQuery(name = "findAccountByUsername", query = "select myAccount from Account myAccount where myAccount.username = ?1"),
		@NamedQuery(name = "findAccountByUsernameContaining", query = "select myAccount from Account myAccount where myAccount.username like ?1"),
		@NamedQuery(name = "findAllAccounts", query = "select myAccount from Account myAccount") })
@Table(catalog = "trhy", name = "account")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "trhy/edu/yangsheng/domain", name = "Account")
public class Account implements Serializable {
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
	 * 是否管理员
	 * 
	 */

	@Column(name = "administrator", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean administrator;
	/**
	 * 密码
	 * 
	 */

	@Column(name = "password", length = 45, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String password;
	/**
	 * 用户名
	 * 
	 */

	@Column(name = "username", length = 500, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String username;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_detail", referencedColumnName = "id") })
	@XmlTransient
	User user;

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
	 * 是否管理员
	 * 
	 */
	public void setAdministrator(Boolean administrator) {
		this.administrator = administrator;
	}

	/**
	 * 是否管理员
	 * 
	 */
	public Boolean getAdministrator() {
		return this.administrator;
	}

	/**
	 * 密码
	 * 
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 密码
	 * 
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * 用户名
	 * 
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 用户名
	 * 
	 */
	public String getUsername() {
		return this.username;
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
	public Account() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Account that) {
		setId(that.getId());
		setAdministrator(that.getAdministrator());
		setPassword(that.getPassword());
		setUsername(that.getUsername());
		setUser(that.getUser());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("administrator=[").append(administrator).append("] ");
		buffer.append("password=[").append(password).append("] ");
		buffer.append("username=[").append(username).append("] ");

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
		if (!(obj instanceof Account))
			return false;
		Account equalCheck = (Account) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
