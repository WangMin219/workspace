package com.xt.jc;

import java.util.Arrays;
import java.util.Scanner;

public class T4 {
	
	
	public static void test()
	{
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int nums[] = new int[num];
		int sum =0;
		for(int i = 0; i< num ;i++)
		{
			nums[i]=scanner.nextInt();	
			sum+= nums[i];
		}
		Arrays.sort(nums);
		System.out.println(nums[num-1]);
		System.out.println(nums[0]);
		System.out.println(sum);
	}
	
	
	
	public static void main(String[] args) {
		test();
	}
		
}




