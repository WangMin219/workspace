package com.zt.s7;
/*
����ʽ

     B      DEF
A + --- + ------- = 10
     C      GHI
     
�������ʾ�����⣬���Բμ���ͼ1.jpg����
	 
	 
�����ʽ��A~I����1~9�����֣���ͬ����ĸ����ͬ�����֡�

���磺
6+8/3+952/714 ����һ�ֽⷨ��
5+3/1+972/486 ����һ�ֽⷨ��

�����ʽһ���ж����ֽⷨ��

ע�⣺���ύӦ���Ǹ���������Ҫ��д�κζ�������ݻ�˵�������֡�
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
