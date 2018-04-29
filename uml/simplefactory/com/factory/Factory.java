package com.factory;

import com.operation.Add;
import com.operation.Div;
import com.operation.Mul;
import com.operation.Operator;
import com.operation.Sub;

public class Factory {

	public static Operator creatOprater(String aa) {
		if(aa=="+") {
			return new Add();	
		}
		if(aa=="-") {
			return new Sub();	
		}
		if(aa=="*") {
			return new Mul();	
		}
		
		if(aa=="/") {
			return new Div();	
		}
		return null;

	}

}
