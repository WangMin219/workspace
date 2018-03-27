package com.xt.basic;

import java.util.Scanner;

public class T6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n+1][n+1];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				
				if((j==1)||(j==i)) {
					a[i][j]=a[i-1][j]+a[i-1][j-1];
					a[i][j]=1; //不管n=几，a[1][1],a[2][1],a[2][2]偶会赋值为1
					System.out.print(a[i][j]+" ");
				}
				else {
					a[i][j]=a[i-1][j]+a[i-1][j-1];
					System.out.print(a[i][j]+" ");
					
				}
			}
			System.out.println();
		}
		
	}
	

}

