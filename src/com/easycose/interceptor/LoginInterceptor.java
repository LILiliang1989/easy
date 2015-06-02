package com.easycose.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.easycose.util.Constants;

public class LoginInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {

		// ȡ��������ص�ActionContextʵ��
		ActionContext ctx = invocation.getInvocationContext();
		Map session = ctx.getSession();
		String user = (String) session.get(Constants.USER_SESSION);

		// ���û�е�½�����ߵ�½���е��û�����yuewei�����������µ�½

		if (user != null && user.equals("yuewei")) {
			System.out.println("test");
			return invocation.invoke();
		}

		ctx.put("tip", "未登录");
		return Action.LOGIN;

	}

}
