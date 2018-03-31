package com.zt.s4;

public class T2 {
	public static void main(String[] args) {
		int a[]= {1,9,4,9};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				System.out.println(i+"  "+j);
				System.out.println(a[i]+""+a[j]);
			}
		}
		
	}

}
