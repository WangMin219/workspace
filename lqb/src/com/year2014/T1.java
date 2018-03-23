package com.year2014;

public class T1 {
	public static void main(String[] args) {
		for(int a=4;a<20;a++) {
			for(int b=4;b<20;b++) {
				if((a*b==(a+b)*6)&&a!=b) {
					System.out.println(a+" "+b);
				}
			}
		}
	}

}
