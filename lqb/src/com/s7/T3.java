package com.s7;
/*
ƽ����Ȧ

�����һ����������ÿһλ��ƽ��������ͣ��õ�һ���µ���������
���²���������������ͬ���Ĵ���

���һ������ᷢ�֣����ܿ�ʼȡ����ʲô���֣�
���������������1����������ͬһ��ѭ��Ȧ��

��д�����ѭ��Ȧ�������Ǹ����֡�

����д��������֡�
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�
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
