package com.vo;

public class T6 {

	/*
	 * �жϴ� s ���Ƿ����ظ����ֵ��ַ� ������ظ��򷵻� true ����������� false �жϵ�˼·�ǣ�������ɨ��ÿ���ַ� �Ե�ǰ���ַ�������������
	 * s �����������ĳ���λ�ã������� lastIndexOf ���� ����ҵ���λ���뵱ǰ��λ�ò�ͬ�����Ȼ���ڸ��ַ����ظ����󣬼��ɷ��� true
	 * ����������� false ����������£����紫����ǿ�ָ�룬���� s Ϊ�մ�������ֻ���� 1 ���ַ����������ܺ��� �ظ��ַ��� ��ˣ���Щ���ֱ�ӷ���
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
		System.out.println(hasSameChar("abcdebfg")); // true�� 7/15 ҳ
		System.out.println(hasSameChar("76534822")); // true�� 7/15 ҳ
	}
}
