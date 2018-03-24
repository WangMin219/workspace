package com.xt.jc;

import java.util.Scanner;

public class T5 {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int  a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		int c=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]==c) {
				System.out.println(i+1);
				break;
			}
			else {
				System.out.println(-1);
				break;
			}
		}
	}

}
