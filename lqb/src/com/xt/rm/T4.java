package com.xt.rm;


import java.util.Scanner;

public class T4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(F(n)%10007);
		
	}
	public static int F(int n) {
		if(n==1||n==2) {
			return 1;
		}
		else {
			return F(n-1)+F(n-2);
		}
		
	}

}
