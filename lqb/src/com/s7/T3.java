package com.s7;
/*
平方怪圈

如果把一个正整数的每一位都平方后再求和，得到一个新的正整数。
对新产生的正整数再做同样的处理。

如此一来，你会发现，不管开始取的是什么数字，
最终如果不是落入1，就是落入同一个循环圈。

请写出这个循环圈中最大的那个数字。

请填写该最大数字。
注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
145
*/
import java.util.Scanner;

public class T3 {
	public static void main(String[] args) {
	
		int n=89;
	    long sum=0;
	    int max=0;
		do {
			System.out.println(sum);
			sum=(long) (Math.pow(n%10, 2)+Math.pow(n/10%10, 2)+Math.pow(n/100, 2));
			n=(int) sum;
			if(n>max) {
				max=n;
			}
			System.out.println(max+"------------------");
			System.out.println(sum);
		}while(n!=1);


		
	}

	

}
