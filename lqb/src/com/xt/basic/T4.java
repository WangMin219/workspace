package com.xt.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class T4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			 a[i]= sc.nextInt();
			 sum+=a[i];
		}
		Arrays.sort(a);
//		for(int i=0;i<n-1;i++) {
		
//			for(int j=0;j<n;j++) {
//				if(a[i]>a[j]) {
//					int t=a[i];
//					a[i]=a[j];
//					a[j]=t;
//					
//				}
//				
//			}
			
//		}
		
		
		//ð�ݵ������ǶԵģ����Ǹ������Ե�ʱ��������
		
		System.out.println(a[n-1]);
		System.out.println(a[0]);
		System.out.println(sum);
		
	}
	
	
	
		
}




