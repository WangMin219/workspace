package com.action;

public class LoginAction {
	private double score;

	public LoginAction() {
		super();
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	public String execute() {
		return "success";
	}
	

}
