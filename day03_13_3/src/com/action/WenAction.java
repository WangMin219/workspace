package com.action;

public class WenAction {
	private String title;
	private String content;
	public WenAction() {
		super();
	}
	public WenAction(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String execute() {
		return "suceess";
	}

}
