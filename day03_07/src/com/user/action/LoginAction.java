package com.user.action;

import com.user.dao.IUserDao;
import com.user.dao.UserDao;

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
		IUserDao ud=new UserDao();
		boolean oo=ud.checkUser(username, password);
		if(oo) {
			return "success";
		}
		else {
			return "error";
		}
	
	
	}
	

}
