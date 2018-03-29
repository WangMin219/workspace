package com.action.user;

import com.opensymphony.xwork2.ActionContext;
import com.user.User;

public class UserAction {
	private User user;

	public UserAction() {
		super();
	}

	public UserAction(User user) {
		super();
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public String execute() {
		ActionContext.getContext().getSession().put("result", user.getID());
		return "success";
		
	}

}
