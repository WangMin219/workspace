package com.s6;

import java.util.Scanner;

public class T8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k1=sc.nextInt();
		int k2=sc.nextInt();
		int a[][] = new int[Integer.MAX_VALUE][n];
		int b[][]=new int[Integer.MAX_VALUE][n];
		int c=0;int d=0;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					a[i][j] = i * n + (j + 1);
					b[c++][d++]=a[i][j];
					System.out.print(a[i][j] + " ");
				}
			}

			else {
				for (int j = n - 1; j >= 0; j--) {

					a[i][j] = i * n + (j + 1);
					b[c++][d++]=a[i][j];

					System.out.print(a[i][j] + " ");
				}

			}
		
			System.out.println();
			int g=0;
			int g1=0;
			int x=0;
			int x1=0;
			if((a[c][d]==k1)) {
				 g=c;
				 x=d;
				
			}
			if((a[c][d]==k2)) {
				 g1=c;
				 x1=d;
				
			}
			System.out.println((g1-g)+(x1-x));

		}

	}

}
