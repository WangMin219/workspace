package com.zt.s7;
/*
凑算式

     B      DEF
A + --- + ------- = 10
     C      GHI
     
（如果显示有问题，可以参见【图1.jpg】）
	 
	 
这个算式中A~I代表1~9的数字，不同的字母代表不同的数字。

比如：
6+8/3+952/714 就是一种解法，
5+3/1+972/486 是另一种解法。

这个算式一共有多少种解法？

注意：你提交应该是个整数，不要填写任何多余的内容或说明性文字。
*/

public class T6 {
	public static void main(String[] args) {
		int k=0;
		for(int A=1;A<=9;A++) {
			for(int B=1;B<=9;B++) {
				for(int C=1;C<=9;C++) {
					for(int D=1;D<=9;D++) {
						for(int E=1;E<=9;E++) {
							for(int F=1;F<=9;F++) {
								for(int G=1;G<=9;G++) {
									for(int H=1;H<=9;H++) {
										for(int I=1;I<=9;I++) {
											if(((C*A+B)*(100*G+10*H+I))+(100*D+10*E+F)*C==10*C*(100*G+10*H+I)
											&&(A!=B)&&(A!=C)&&(A!=D)&&(A!=E)&&(A!=F)&&(A!=G)&&(A!=H)&&(A!=I)
											&&(B!=C)&&(B!=D)&&(B!=E)&&(B!=F)&&(B!=G)&&(B!=H)&&(B!=I)
											&&(C!=D)&&(C!=E)&&(C!=F)&&(C!=G)&&(C!=H)&&(C!=I)
											&&(D!=E)&&(D!=F)&&(D!=G)&&(D!=H)&&(D!=I)
											&&(E!=F)&&(E!=G)&&(E!=H)&&(E!=I)
											&&(F!=G)&&(F!=H)&&(F!=I)
											&&(G!=H)&&(G!=I)
											&&(H!=I)) {
												
												k++;
												System.out.println(A+"+"+B+"/"+C+"+"+D+""+E+""+F+"/"+G+""+H+""+I);
												
											}
											
											
										}
										
									}
									
								}
								
								
							}
							
						}
						
					}
					
				}
				
			}
			
		}
		System.out.println(k);
	}

}
