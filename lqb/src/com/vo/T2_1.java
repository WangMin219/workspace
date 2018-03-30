package com.vo;

public class T2_1 {
	public static void main(String[] args) {
		int js=0;
		int os=0;
		int b[]= {1,2,3,45,45};
		for(int j=0;j<b.length;j++) {
//			if(j%2==0) {
//				js+=b[j];
//			}
			if(j%2!=0) {
				if(b[j]/10==0) {
				
					os+=b[j]*2;
				}
				else {
					
					os+=b[j]*2-9;
				}
//				System.out.print(j+"   ");
//				System.out.print(b[j]+"   ");
//				System.out.println(os);
			}
			
		//	System.out.println(os);
			
		}
	}


}
