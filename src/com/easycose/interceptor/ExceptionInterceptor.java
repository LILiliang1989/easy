package com.easycose.interceptor;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;


public class ExceptionInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 1008901298342362080L;
	private static final Logger log = Logger
			.getLogger(ExceptionInterceptor.class);

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		String actionName = invocation.getInvocationContext().getName();
		try {
			String result = invocation.invoke();
			System.out.println(actionName+"_"+result);
			return result;
		} catch (Exception e) {
			log.error(actionName, e);
			System.out.println(actionName+"_"+e.getMessage());
			return "error";
		}
	}

}
           