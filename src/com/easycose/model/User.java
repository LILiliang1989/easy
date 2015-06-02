package com.easycose.model;

import java.util.Date;

/**
 * User ��
 */

public class User implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String userName;
	private String nickName;
	private String realName;
	private String password;
	private String age;
	private String sex;
	private String email;
	private String phone;
	private String userType;
	private Date createTime;

	public User() {
	}

	public User(Integer id, String userName, String nickName, String realName,
			String password, String email, String phone, Date createTime) {
		super();
		this.id = id;
		this.userName = userName;
		this.nickName = nickName;
		this.realName = realName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.createTime = createTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ",userName" + userName + ",nickName"
				+ nickName + ",realName" + realName + ",password" + password
				+ "age" + age + "sex" + sex + ",email" + email + ",phone"
				+ phone + ",createTime" + createTime + "]";
	}

}
