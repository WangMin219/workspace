package com.xt.basic;

public class T8 {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j=0;j<=9;j++) {
				for(int z=0;z<=9;z++) {
					for(int y=0;y<=9;y++) {
						if(i==y&&j==z) {
							System.out.println(i+""+j+""+z+""+y);
						}
					}
				}
			}
		}
	}

}
