package com.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class TestInterceptor extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
	    System.out.println("进入拦截器功能");
	    String result =invocation.invoke();
		return result;
	}
	

}
