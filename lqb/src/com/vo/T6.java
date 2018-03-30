package com.vo;

public class T6 {

	/*
	 * 判断串 s 中是否含有重复出现的字符 如果有重复则返回 true 其它情况返回 false 判断的思路是：从左到右扫描每个字符 对当前的字符，从右向左在
	 * s 串中搜索它的出现位置，可以用 lastIndexOf 方法 如果找到的位置与当前的位置不同，则必然存在该字符的重复现象，即可返回 true
	 * 其它情况返回 false 在特殊情况下，比如传入的是空指针，或者 s 为空串，或者只含有 1 个字符，都不可能含有 重复字符， 因此，这些情况直接返回
	 * false
	 */
	public static boolean hasSameChar(String s) {
		if (s == null || s.length() < 2)
			return false;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int k = s.lastIndexOf(c);
			if (k != i)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(hasSameChar("a")); // false
		System.out.println(hasSameChar("abcdefg")); // false
		System.out.println(hasSameChar("abacdefag")); // true
		System.out.println(hasSameChar("abcdebfg")); // true第 7/15 页
		System.out.println(hasSameChar("76534822")); // true第 7/15 页
	}
}
