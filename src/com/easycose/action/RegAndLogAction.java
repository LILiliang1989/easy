package com.easycose.action;

public class RegAndLogAction extends BaseAction{
	
	private String userName;
	private String password;
	private String repassword;
	
	public String regDo() {
		String msg = "1234234";
		return "regDo";
	}
	public String loginDo() {
		String msg = "1234234";
		return "loginDo";
	}
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
}
