package com.asction.struts;

public class HelloWorld {
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String execute() {
		userName="ÍõÐ¡¶þ";
		return "success";
		
	}


}
