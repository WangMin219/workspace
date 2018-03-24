package com.xt.basic;



import java.util.Scanner;

public class T13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
	    int t;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;					
				}
			}
		}
		
		for(int j=0;j<n;j++) {
			System.out.print(a[j]+" ");
		}
//		int t;
//		int a[]= {2,1,56,23,5};
//		for(int i=0;i<4;i++) {
//			for(int j=i+1;j<5;j++) {
//				if(a[i]>a[j]) {
//					t=a[i];
//					a[i]=a[j];
//					a[j]=t;					
//				}
//			}
//		}
//			for(int j=0;j<5;j++) {
//			System.out.print(a[j]+" ");		
//			}

		
		
		
		
	}
	
	
	

}
