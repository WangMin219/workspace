package com.study;

import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,1,2,3,4};
		Set set=new TreeSet();
		set.put(a);
		for(int i=0;i<set.size();i++) {
			System.out.println(a[i]);
		}
		
	}

}