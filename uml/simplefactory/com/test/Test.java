package com.test;

import com.factory.Factory;
import com.operation.Operator;

public class Test {
	public static void main(String[] args) {
		Operator oper=Factory.creatOprater("+");
		oper.setStrA(3);
		oper.setStrB(4);
		System.out.println(oper.getResult());
		
	}

}
