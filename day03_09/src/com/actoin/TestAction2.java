package com.actoin;

import com.opensymphony.xwork2.ActionContext;

public class TestAction2 {
	public String execute() {
		int a=(int) ActionContext.getContext().getSession().get("a");
		int b=(int) ActionContext.getContext().getSession().get("b");
		int c=(int) ActionContext.getContext().getSession().get("c");
		int s = (int)((1.0/4.0)*Math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(b+c-a)));
		 ActionContext.getContext().getSession().put("s",s);
		return "success2";
		 
	        
	}

}
