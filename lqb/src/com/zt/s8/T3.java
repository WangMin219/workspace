package com.zt.s8;

/*标题：纸牌三角形

A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。
下图就是一种排法（如有对齐问题，参看p1.png）。

      A
     9 6
    4   8
   3 7 5 2

这样的排法可能会有很多。

如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？

请你计算并提交该数字。

注意：需要提交的是一个整数，不要提交任何多余内容。

---------------------------

笨笨有话说：
    感觉可以暴力破解哦。
    麻烦的是，对每个排法还要算出它的旋转、镜像排法，看看有没有和历史重复。

歪歪有话说：
    人家又不让你把所有情况都打印出来，只是要算种类数。
    对于每个基本局面，通过旋转、镜像能造出来的新局面数目不是固定的吗？*/




public class T3 {
	public static void main(String[] args) {

		int count = 0;
		for (int A = 1; A <= 9; A++) {
			for (int B = 1; B <= 9; B++) {
				for (int C = 1; C <= 9; C++) {
					for (int D = 1; D <= 9; D++) {
						for (int E = 1; E <= 9; E++) {
							for (int F = 1; F <= 9; F++) {
								for (int G = 1; G <= 9; G++) {
									for (int H = 1; H <= 9; H++) {
										for (int I = 1; I <= 9; I++) {
											if (((A + B + C + D) == (D + E + F + G))
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

										}

									}

								}

							}

						}

					}

				}
				

			}

		}
		// TODO Auto-generated method stub
		// int count = 0;
		// for (int i = 1; i < 10; i++) {
		// for (int j = 1; j < 10; j++) {
		// for (int k = 1; k < 10; k++) {
		// for (int l = 1; l < 10; l++) {
		// for (int m = 1; m < 10; m++) {
		// for (int n = 1; n < 10; n++) {
		// for (int o = 1; o < 10; o++) {
		// for (int p = 1; p < 10; p++) {
		// for (int q = 1; q < 10; q++) {
		// if ((i + j + k + l) == (l + m + n + o) && (i + j + k + l) == (o + q + p + i)
		// && i != j && i != k && i != l && i != m && i != n && i != o
		// && i != p && i != q && j != k && j != l && j != m && j != n
		// && j != o && j != p && j != q && k != l && k != m && k != n
		// && k != o && k != p && k != q && l != m && l != n && l != o
		// && l != p && l != q && m != n && m != o && m != p && m != q
		// && n != o && n != p && n != q && o != p && o != q && p != q) {
		// count++;
		// }
		// }
		// }
		// }
		// }
		// }
		// }
		// }
		// }
		// }
		// System.out.println(count / 6);// 旋转是三种相同的，镜像也是三种相同的。所以除以6
		System.out.println(count/6);
	}
}