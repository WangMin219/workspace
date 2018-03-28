package com.action;

public class LoginAction {
	private String username;
	private String password;
	public LoginAction() {
		super();
	}
	public LoginAction(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
	public String execute() {
		return "success";
	}

}
