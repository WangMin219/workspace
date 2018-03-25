package com.s8;

import java.util.Scanner;

public class T9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int a=1;a<=9;a++) {
			for(int b=0;b<=9;b++) {
				for(int c=0;c<=9;c++) {
					for(int d=0;d<=9;d++) {
						for(int e=0;e<=9;e++) {
							if(a==e&&b==d&&(a+b+c+d+e==n)) {
								System.out.println(a+""+b+""+c+""+d+""+e);
							}
							
							
						}
					}
				}
			}
			
		}
		for(int a=1;a<=9;a++) {
			for(int b=0;b<=9;b++) {
				for(int c=0;c<=9;c++) {
					for(int d=0;d<=9;d++) {
						for(int e=0;e<=9;e++) {
							for(int f=0;f<=9;f++) {
								if(a==f&&b==e&&c==d&&(a+b+c+d+e+f==n)) {
									System.out.println(a+""+b+""+c+""+d+""+e+""+f);
								}
							}
							
						}
					}
				}
			}
			
		}
	}

}
