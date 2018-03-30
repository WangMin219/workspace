package com.vo;

import java.util.Scanner;

public class T2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		char a[]=n.toCharArray();
		int b[]=new int[a.length];
		int k=0;
		int js=0;
		int os=0;
		for(int i=a.length-1;i>=0;i--) {
			b[k++]=a[i]-'0';
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]);
		}
		System.out.println();

		for(int j=0;j<b.length;j++) {
		
			if(j%2==0) {
				js+=b[j];
				System.out.print(j+"   ");
				System.out.print(b[j]+"   ");
				System.out.println(os);
			}
			if(j%2!=0) {
				if(b[j]*2/10==0) {
				
					os+=b[j]*2;
				}
				else {
					
					os+=b[j]*2-9;
				}
				System.out.print(j+"   ");
				System.out.print(b[j]+"   ");
				System.out.println(os);
			}
			
			
		}
		if((js+os)%10==0) {
			System.out.println("³É¹¦");
		}
		else {
			System.out.println("Ê§°Ü");
		}
	}

}
