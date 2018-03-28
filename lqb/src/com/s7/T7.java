package com.s7;
/*
搭积木

小明最近喜欢搭数字积木，
一共有10块积木，每个积木上有一个数字，0~9。

搭积木规则：
每个积木放到其它两个积木的上面，并且一定比下面的两个积木数字小。
最后搭成4层的金字塔形，必须用完所有的积木。

下面是两种合格的搭法：

   0
  1 2
 3 4 5
6 7 8 9

   0
  3 1
 7 5 2
9 8 6 4    

请你计算这样的搭法一共有多少种？

请填表示总数目的数字。
注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。*/


public class T7 {
	public static void main(String[] args) {
		int count = 0;
		for (int A = 0; A <= 0; A++) {
			for (int B = 1; B <= 9; B++) {
				for (int C = 1; C <= 9; C++) {
					for (int D = 1; D <= 9; D++) {
						for (int E = 1; E <= 9; E++) {
							for (int F = 1; F <= 9; F++) {
								for (int G = 1; G <= 9; G++) {
									for (int H = 1; H <= 9; H++) {
										for (int I = 1; I <= 9; I++) {
											for (int J = 1; J <= 9; J++) {
												if ( (A != B) && (A != C) && (A != D) && (A != E) && (A != F) && (A != G) && (A != H) && (A != I) && (A != J)
												&& (B != C) && (B != D) && (B != E) && (B != F) && (B != G) && (B != H) && (B != I) && (B != J) 
												&& (C != D) && (C != E) && (C != F) && (C != G) && (C != H) && (C != I) && (C != J)
												&& (D != E) && (D != F) && (D != G) && (D != H) && (D != I) && (D != J)
												&& (E != F) && (E != G) && (E != H) && (E != I) && (E != J)
												&& (F != G) && (F != H) && (F != I) && (F != J)
												&& (G != H) && (G != I) && (G != J) 
												&& (H != I) && (H != J)
												&& (I != J) 
												&& (D>B)&&(E>B)&& (F>C)&&(E>C)&&(G>D)&&(H>D)&&(H>E)&&(I>E)&&(I>F)&&(J>F)) {
											    count++;
											    System.out.println(A+""+B+""+C+""+D+""+E+""+F+""+G+""+H+""+I+""+J);

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

		}
		System.out.println(count);
		
	}
	

}
/*if (((A + B + C + D) == (D + E + F + G))
		&& ((A + B + C + D) == (A + I + H + G)) && (A != B) && (A != C)
		&& (A != D) && (A != E) && (A != F) && (A != G) && (A != H)
		&& (A != I) && (B != C) && (B != D) && (B != E) && (B != F)
		&& (B != G) && (B != H) && (B != I) && (C != D) && (C != E)
		&& (C != F) && (C != G) && (C != H) && (C != I) && (D != E)
		&& (D != F) && (D != G) && (D != H) && (D != I) && (E != F)
		&& (E != G) && (E != H) && (E != I) && (F != G) && (F != H)
		&& (F != I) && (G != H) && (G != I) && (H != I)) {
	count++;

}
*/
