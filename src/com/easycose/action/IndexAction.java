package com.easycose.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.easycose.util.Pager;

import net.sf.json.JSONObject;

public class IndexAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2572080550725277719L;

	/**
	 * 
	 */
	private String resultJson; // 返回Json
	
	private Map<String,String> jsonMap;
	
	private String userName;
	private String password;
	private String repassword;
	private String code;

	private Pager pager = new Pager();
	private int currentPage;
	private int totalPage;
	private int totalSize;
	private int pageSize = 13;

	public String toIndex() {
		System.out.println("ok");
		return "toIndex";
	}

	public String login() {
		return "toLogin";
	}
	public String register() {
		return "toReg";
	}
	public String regDo() {
		msg = "注册成功，正在返回登录界面....";
		url = "/login";
		return "regDo";
	}
	public String loginDo() {
		//jsonMap="";
		return "json";
	}
	public String getResultJson() {
		return resultJson;
	}

	public void setResultJson(String resultJson) {
		this.resultJson = resultJson;
	}

	public Pager getPager() {
		return pager;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
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
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
