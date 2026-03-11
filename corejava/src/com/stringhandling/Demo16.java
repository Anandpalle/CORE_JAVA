package com.stringhandling;

public class Demo16 {
	public static void main(String[] args) {
		String str = "engineering";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'e') {
				count++;
			}
		}
		System.out.println("no. of e's :" + count);
	}

}
