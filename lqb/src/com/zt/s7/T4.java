package com.zt.s7;


/*
������Ϸ

��������һ����Ϸ��
ͬʱ����3����ͨ���ӣ�6�����ϵ����ֱַ���1~6����
�������һ�������ϵ����ֵ������������ĺͣ����Ӯ�ˡ�

����ĳ����������ܻ�ʤ�ľ�ȷ���ʣ��Լ�Լ������ʾ��


public class Main
{
	public static int gcd(int a, int b)
	{
		if(b==0) return a;
		return gcd(b,a%b);
	}
	
	public static void main(String[] args)
	{	
		int n = 0;
		for(int i=0; i<6; i++)
		for(int j=0; j<6; j++)
		for(int k=0; k<6; k++){
			if(___(i+j==k)||(i+k==j)||(j+k==i)_____________________________) n++;   //���λ��
		}
		
		int m = gcd(n,6*6*6);
		System.out.println(n/m + "/" + 6*6*6/m);
	}
}
��ϸ�Ķ����룬��д���߲���ȱ�ٵ����ݡ�

*/
public class T4 {
	public static int gcd(int a, int b)
	{
		if(b==0) return a;
		return gcd(b,a%b);
	}
	
	public static void main(String[] args)
	{	
		int n = 0;
		for(int i=0; i<5; i++)
		for(int j=0; j<5; j++)
		for(int k=0; k<5; k++){
			if((i+j+2==k+1)||(i+k+2==j+1)||(j+k+2==i+1)) n++;   //���λ��
		}
		
		int m = gcd(n,6*6*6);
		System.out.println(n/m + "/" + 6*6*6/m);
	}
	

}
