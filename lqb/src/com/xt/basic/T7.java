package com.xt.basic;


import java.math.*;
public class T7 {
	


	

	
public static void main(String[] args) {
	for(int i=1;i<=9;i++) {
		for(int j=0;j<=9;j++) {
			for(int z=0;z<=9;z++) {
				if(i*i*i+j*j*j+z*z*z==i*100+j*10+z) {
					System.out.println(i+""+j+""+z);
				}
			}
		}
	}
	
	

//	System.out.println("153"+"="+"1"+"*"+"1"+"+"+"1"+"+"+"5"+"*"+"5"+"*"+"5"+"+"+"3"+"*"+"3"+"*"+"3");
//	System.out.println("371"+"="+"3"+"*"+"3"+"*"+"3"+"+"+"7"+"*"+"7"+"*"+"7"+"+"+"1"+"*"+"1"+"*"+"1");
	
}
}

