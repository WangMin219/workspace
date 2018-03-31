package com.zt.s4;

import java.util.Scanner;

public class T1 {
	public static void main(String[] args) {
		int n,k,m;
		Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		k=(int) Math.sqrt(n);
		for(m=2;m<=k;m++) {
			if(n%m==0) break;
		}
		if(m>k) {
			System.out.println("是素数");
		}
		else{
			System.out.println("不是素数");
		}
		
		
	}
	

}
