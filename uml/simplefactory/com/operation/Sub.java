package com.operation;

public class Sub extends Operator {
	public double getResult() {
		double result=0;
		result=this.getStrA()-this.getStrB();
		return result;
	}


}
