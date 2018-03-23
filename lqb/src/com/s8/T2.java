package com.zt.s8;

public class T2 {
	public static void main(String[] args) {
		int j=0;
		for(int i=1;i<=9;i++) {
			long sum=(i*i*i)%10;
			if(i==sum) {
				j=j+1;
				System.out.println(i);
			}
		}
	
		
		
		for(int i=10;i<=99;i++) {
			long sum=(i*i*i)%100;
			if(i==sum) {
				j=j+1;	
				System.out.println(i);
			}
		}
	
		for(int i=100;i<=999;i++) {
			long sum=(i*i*i)%1000;
			if(i==sum) {
				j=j+1;	
				System.out.println(i);
			}
		}
	
		for(long i=1000;i<=9999;i++) {
			long sum=(i*i*i)%10000;
			if(i==sum) {
				j=j+1;	
				System.out.println(i);
			}
		}
		System.out.println(j);
		System.out.println(1003003001%10000);
		
		
		
		
		

	}
}
