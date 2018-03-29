package com.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

public class LoginAction {
	private String username;
	private String password;
	private int radio;
	public LoginAction() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}


	
	public String execute() {
		ActionContext.getContext().getSession().put("username", username);
		
		if(this.getRadio()==1) {
			return "adim";
     }
		else {
			return "user";
		}
		
	}

}
