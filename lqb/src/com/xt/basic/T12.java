package com.xt.basic;

import java.util.Scanner;

public class T12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer c=sc.nextInt(16);
		System.out.println(c.toOctalString(c));
	}

}
