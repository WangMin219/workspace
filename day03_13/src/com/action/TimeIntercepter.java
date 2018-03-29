package com.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TimeIntercepter implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		long startTime=System.currentTimeMillis();
		System.out.println("startTime="+startTime);		
		String result=invocation.invoke();	
		long endTime=System.currentTimeMillis();
		System.out.println("endTime="+endTime);
		System.out.println("Action Ö´ÐÐÊ±¼ä£º"+(endTime-startTime));
		return result;

	}

}
