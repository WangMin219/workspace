package com.zt.s4;

import java.util.Scanner;

public class T6 {
	public static void main(String[] args) {
		
	    T6.evaluate("3+5*(2+6)-1");
		
	}
	static int[] evaluate(String x)
	{
		if(x.length()==0) return new int[] {0,0};
		
		char c = x.charAt(0);
		if(c>='0' && c<='9') return new int[] {c-'0',1};
		
		int[] v1 = evaluate(x.substring(1));
		int[] v2 = evaluate(x + 1 + v1.length);  //Ìî¿ÕÎ»ÖÃ
		
		int v = Integer.MAX_VALUE;
		if(c=='+') v = v1[0] + v2[0];
		if(c=='*') v = v1[0] * v2[0];
		if(c=='-') v = v1[0] - v2[0];
		
		return new int[] {v,1+v1[1]+v2[1]};
	}
    

}
