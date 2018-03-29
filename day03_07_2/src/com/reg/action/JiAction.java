package com.reg.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class JiAction {
	private int num1;
	private int num2;
	public JiAction() {
		super();
	}
	public JiAction(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public String jia() {
	ActionContext.getContext().getSession().put("result", this.num1+this.num2);
	return "su1";
		
	}
	public String jian() {
		ActionContext.getContext().getSession().put("result", this.num1-this.num2);
		return "su2";
			
		}
	public String cheng() {
		ActionContext.getContext().getSession().put("result", this.num1*this.num2);
		return "su3";
			
		}
	public String chu() {
		ActionContext.getContext().getSession().put("result", this.num1/this.num2);
		return "su4";
			
		}
}
