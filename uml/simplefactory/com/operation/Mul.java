package com.operation;

public class Mul extends Operator {
	public double getResult() {
		double result=0;
		result=this.getStrA()*this.getStrB();
		return result;
	}


}
