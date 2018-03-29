package com.zt.s8;

import java.util.Scanner;

public class T7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<27) {
			System.out.println((char)(n+64));
		}
		if(n>=27&&n<702) {
			int w=n/26;
			if(w>27)
			System.out.print((char)(64+w));
			int r=n-w*26;
			System.out.println((char)(r+64));
		}
		if(n==702) {
			System.out.println("zz");
		}
		
//	//	while(n!=0) {
//			int w=n/26;
//			System.out.print((char)(65+w));
//			int r=n-w*26;
//			System.out.println((char)(r+65));
//			//n=n/26;
//	

		
//		Scanner sc = new Scanner(System.in);
//		int i = 0;
//		// long a[]=new long[(int) Long.MAX_VALUE];
//		long n = sc.nextInt();
//		while (n != 0) {
//			if (n < 10) {
//				int z = (int) (n % 10);
//				if (z == 1) {
//					System.out.print("A");
//				}
//				if (z == 2) {
//					System.out.print("B");
//				}
//				if (z == 3) {
//					System.out.print("C");
//				}
//				if (z == 4) {
//					System.out.print("D");
//				}
//				if (z == 5) {
//					System.out.print("E");
//				}
//				if (z == 6) {
//					System.out.print("F");
//				}
//				if (z == 7) {
//					System.out.print("G");
//				}
//				if (z == 8) {
//					System.out.print("H");
//				}
//				if (z == 9) {
//					System.out.print("I");
//				}
//			} else {
//				int z = (int) (n % 100);
//				if (z == 10) {
//					System.out.print("J");
//				}
//				if (z == 11) {
//					System.out.print("K");
//				}
//				if (z == 12) {
//					System.out.print("L");
//				}
//				if (z == 13) {
//					System.out.print("M");
//				}
//				if (z == 14) {
//					System.out.print("N");
//				}
//				if (z == 15) {
//					System.out.print("O");
//				}
//				if (z == 16) {
//					System.out.print("P");
//				}
//				if (z == 17) {
//					System.out.print("Q");
//				}
//				if (z == 18) {
//					System.out.print("R");
//				}
//
//				if (z == 19) {
//					System.out.print("S");
//				}
//				if (z == 20) {
//					System.out.print("T");
//				}
//				if (z == 21) {
//					System.out.print("U");
//				}
//				if (z == 22) {
//					System.out.print("V");
//				}
//				if (z == 23) {
//					System.out.print("W");
//				}
//				if (z == 24) {
//					System.out.print("X");
//				}
//				if (z == 25) {
//					System.out.print("Y");
//				}
//				if (z == 26) {
//					System.out.print("Z");
//				}
//
//			}
//			n = n / 10;
//
//		}

	}

}
