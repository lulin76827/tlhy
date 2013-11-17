package edu.yangsheng.domain;

import java.io.Serializable;
import java.util.Calendar;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllUsers", query = "select myUser from User myUser"),
		@NamedQuery(name = "findUserByBirthday", query = "select myUser from User myUser where myUser.birthday = ?1"),
		@NamedQuery(name = "findUserByBirthdayAfter", query = "select myUser from User myUser where myUser.birthday > ?1"),
		@NamedQuery(name = "findUserByBirthdayBefore", query = "select myUser from User myUser where myUser.birthday < ?1"),
		@NamedQuery(name = "findUserByBirthplace", query = "select myUser from User myUser where myUser.birthplace = ?1"),
		@NamedQuery(name = "findUserByBirthplaceContaining", query = "select myUser from User myUser where myUser.birthplace like ?1"),
		@NamedQuery(name = "findUserByCurrentAddress", query = "select myUser from User myUser where myUser.currentAddress = ?1"),
		@NamedQuery(name = "findUserByCurrentAddressContaining", query = "select myUser from User myUser where myUser.currentAddress like ?1"),
		@NamedQuery(name = "findUserByEmail", query = "select myUser from User myUser where myUser.email = ?1"),
		@NamedQuery(name = "findUserByEmailContaining", query = "select myUser from User myUser where myUser.email like ?1"),
		@NamedQuery(name = "findUserById", query = "select myUser from User myUser where myUser.id = ?1"),
		@NamedQuery(name = "findUserByInterest", query = "select myUser from User myUser where myUser.interest = ?1"),
		@NamedQuery(name = "findUserByInterestContaining", query = "select myUser from User myUser where myUser.interest like ?1"),
		@NamedQuery(name = "findUserByMobile", query = "select myUser from User myUser where myUser.mobile = ?1"),
		@NamedQuery(name = "findUserByMobileContaining", query = "select myUser from User myUser where myUser.mobile like ?1"),
		@NamedQuery(name = "findUserByName", query = "select myUser from User myUser where myUser.name = ?1"),
		@NamedQuery(name = "findUserByNameContaining", query = "select myUser from User myUser where myUser.name like ?1"),
		@NamedQuery(name = "findUserByPrimaryKey", query = "select myUser from User myUser where myUser.id = ?1"),
		@NamedQuery(name = "findUserBySex", query = "select myUser from User myUser where myUser.sex = ?1"),
		@NamedQuery(name = "findUserBySleepTime", query = "select myUser from User myUser where myUser.sleepTime = ?1") })
@Table(catalog = "tlhy", name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "tlhy/edu/yangsheng/domain", name = "User")
@XmlRootElement(namespace = "tlhy/edu/yangsheng/domain")
public class User implements Serializable {
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
	 * 生日
	 * 
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "birthday")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar birthday;
	/**
	 * 出生地
	 * 
	 */

	@Column(name = "birthplace", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String birthplace;
	/**
	 * 当前住址
	 * 
	 */

	@Column(name = "current_address", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String currentAddress;
	/**
	 * 邮箱
	 * 
	 */

	@Column(name = "email", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String email;
	/**
	 * 兴趣爱好
	 * 
	 */

	@Column(name = "interest", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String interest;
	/**
	 * 手机号码
	 * 
	 */

	@Column(name = "mobile", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String mobile;
	/**
	 * 姓名
	 * 
	 */

	@Column(name = "name", length = 45, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;
	/**
	 * 性别
	 * 
	 */

	@Column(name = "sex", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean sex;
	/**
	 * 睡眠时间
	 * 
	 */

	@Column(name = "sleep_time")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer sleepTime;

	/**
	 */
	@OneToMany(mappedBy = "user", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<edu.yangsheng.domain.Account> accounts;
	/**
	 */
	@OneToMany(mappedBy = "user", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<edu.yangsheng.domain.UserCategory> userCategories;
	/**
	 */
	@OneToMany(mappedBy = "user", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
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
	 * 生日
	 * 
	 */
	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}

	/**
	 * 生日
	 * 
	 */
	public Calendar getBirthday() {
		return this.birthday;
	}

	/**
	 * 出生地
	 * 
	 */
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	/**
	 * 出生地
	 * 
	 */
	public String getBirthplace() {
		return this.birthplace;
	}

	/**
	 * 当前住址
	 * 
	 */
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	/**
	 * 当前住址
	 * 
	 */
	public String getCurrentAddress() {
		return this.currentAddress;
	}

	/**
	 * 邮箱
	 * 
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 邮箱
	 * 
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * 兴趣爱好
	 * 
	 */
	public void setInterest(String interest) {
		this.interest = interest;
	}

	/**
	 * 兴趣爱好
	 * 
	 */
	public String getInterest() {
		return this.interest;
	}

	/**
	 * 手机号码
	 * 
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 手机号码
	 * 
	 */
	public String getMobile() {
		return this.mobile;
	}

	/**
	 * 姓名
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 姓名
	 * 
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 性别
	 * 
	 */
	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	/**
	 * 性别
	 * 
	 */
	public Boolean getSex() {
		return this.sex;
	}

	/**
	 * 睡眠时间
	 * 
	 */
	public void setSleepTime(Integer sleepTime) {
		this.sleepTime = sleepTime;
	}

	/**
	 * 睡眠时间
	 * 
	 */
	public Integer getSleepTime() {
		return this.sleepTime;
	}

	/**
	 */
	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

	/**
	 */
	public Set<Account> getAccounts() {
		if (accounts == null) {
			accounts = new java.util.LinkedHashSet<edu.yangsheng.domain.Account>();
		}
		return accounts;
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
	public User() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(User that) {
		setId(that.getId());
		setBirthday(that.getBirthday());
		setBirthplace(that.getBirthplace());
		setCurrentAddress(that.getCurrentAddress());
		setEmail(that.getEmail());
		setInterest(that.getInterest());
		setMobile(that.getMobile());
		setName(that.getName());
		setSex(that.getSex());
		setSleepTime(that.getSleepTime());
		setAccounts(new java.util.LinkedHashSet<edu.yangsheng.domain.Account>(that.getAccounts()));
		setUserCategories(new java.util.LinkedHashSet<edu.yangsheng.domain.UserCategory>(that.getUserCategories()));
		setAnswers(new java.util.LinkedHashSet<edu.yangsheng.domain.Answer>(that.getAnswers()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("birthday=[").append(birthday).append("] ");
		buffer.append("birthplace=[").append(birthplace).append("] ");
		buffer.append("currentAddress=[").append(currentAddress).append("] ");
		buffer.append("email=[").append(email).append("] ");
		buffer.append("interest=[").append(interest).append("] ");
		buffer.append("mobile=[").append(mobile).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("sex=[").append(sex).append("] ");
		buffer.append("sleepTime=[").append(sleepTime).append("] ");

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
		if (!(obj instanceof User))
			return false;
		User equalCheck = (User) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
