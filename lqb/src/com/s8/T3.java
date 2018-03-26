package com.s8;

public class T3 {
	public static void main(String[] args) {
		int a[][]=new int[10][10];
		for(int i=1;i<9;i++) {
			for(int j=1;j<=i;j++) {
				for(int z=1;z<=j;z++) {
					for(int s=1;s<=z;s++) {
						System.out.print(i+""+j+""+z+""+s);
					}
				}
			}
		}
	}
}
