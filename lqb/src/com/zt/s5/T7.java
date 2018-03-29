package com.zt.s5;

public class T7 {
	public static void main(String[] args) {
		int k=0;
		for(double a=1;a<=9;a++) {
			for(double b=1;b<=9;b++) {
				for(double c=1;c<=9;c++) {
					for(double d=1;d<=9;d++) {
						if(((a/b*c/d)==(a*10+c)/(b*10+d))&&(a!=b)&&(c!=d)) {
							System.out.println(a+" "+b+" "+c+" "+d);
							k++;
							System.out.println(k);
						}
					}
				}
			}
		}
	}

}
