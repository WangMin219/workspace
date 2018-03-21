package com.s7;

public class T2 {
	public static void main(String[] args) {
		int a[]=new int[101];
		long sum=0;
		for(int i=1;i<=100;i++) {
			int c=(1+i)*i;
			a[i]=c/2;
			 sum+=a[i];
			
		}
		System.out.println(sum);
	}

}
