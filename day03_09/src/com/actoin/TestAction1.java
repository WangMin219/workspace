package com.actoin;

import org.apache.coyote.ActionCode;

import com.opensymphony.xwork2.ActionContext;

public class TestAction1 {
	private int a;
	private int b;
	private int c;
	public TestAction1() {
		super();
	}
	public TestAction1(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public String execute() {
		ActionContext.getContext().getSession().put("a",a );
		ActionContext.getContext().getSession().put("b",b);
		ActionContext.getContext().getSession().put("c",c);
		return "success1";
	}
	

}
