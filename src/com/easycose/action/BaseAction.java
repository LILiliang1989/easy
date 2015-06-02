package com.easycose.action;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public abstract class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	protected HttpServletResponse response = ServletActionContext.getResponse();
	protected HttpServletRequest request = ServletActionContext.getRequest() ;
	protected HttpSession session =  ServletActionContext.getRequest().getSession();
	protected ServletContext application =  session.getServletContext();
	
	public final static String SESSION_USERINFO = "userinfo";
	
	public final static String MD5SAULT = "!@*&%ghjg~$^*987#$%&n";
	 /**
	  * �?��返回前台的信�?
	  */
	 protected String msg ;
	 
	 protected String url ;

	/**
	 * 获取复�?框所选择的项�?
	 */
	 protected String[] checkbox ;
	 
		/**
		 * 错误状�? 1:成功  SUCCESS_STATUS      0：失�?  ERROR_STATUS
		 */
		public static final String RETRUEN_STATUS = "status"; 
	 /**
		 * 成功状�?
		 */
		public static final int SUCCESS_STATUS = 1;
		
		/**
		 * 失败状�?
		 */
		public static final int ERROR_STATUS = 0;
	/**
	/**
	 * 初始化out对象,用于输出相应格式文档到前�?
	 */
	public static void outPrint(String s) {
		 HttpServletResponse response;
		 PrintWriter out;
		try {
			response = ServletActionContext.getResponse();
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html;utf-8");
			out = response.getWriter();
			//输出到前�?
			out.print(s);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String[] getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(String[] checkbox) {
		this.checkbox = checkbox;
	}

	
	public String getMsg() {
		if("".equals(msg.trim()))
			return null;
		else
			return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getUrl() {
		if("".equals(url.trim()))
			return null;
		else
			return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public static String getSessionUserinfo() {
		return SESSION_USERINFO;
	}

	public static String getRetruenStatus() {
		return RETRUEN_STATUS;
	}

	public static int getSuccessStatus() {
		return SUCCESS_STATUS;
	}

	public static int getErrorStatus() {
		return ERROR_STATUS;
	}


}
