package com.action;

import org.eclipse.jdt.internal.compiler.ast.Invocation;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class WenInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Object object=invocation.getAction();
		if(object!=null) {
			if(object instanceof WenAction) {
				WenAction action=(WenAction) object;
				String content=action.getContent();
				System.out.println(content+"====");
				if(content.contains("²»")) {
					content.replaceAll("²»", "*");
					action.setContent(content);
					
				}
				return invocation.invoke();
				}
			else {
				return Action.LOGIN;
				
			}
			
		}
		return Action.LOGIN;
	}

}
