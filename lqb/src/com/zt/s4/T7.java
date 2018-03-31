package com.zt.s4;

import java.util.Scanner;

public class T7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
	    int d=T7.GBS(a, b);
	    System.out.println(T7.GBS(d, c));
	    T7.gys(15, 3);
		
		
		
	}
	public static int GBS(int a,int b) {
		if(a>=b&&a%b==0) {
			return a;
			}
		if(b>a&&b%a==0) {
			return b;
		}
		
		if(a>b&&a%b!=0) {
			return a*b;
			}
		else{
			
		
			return a*b;
		}

		
		
		
	}
	public static int gys(int a,int b) {
		if(a%b==0) {
			return b;
		}
		else {
			gys(b,a%b);
		}
		
		return b;
	}
	
	

}
