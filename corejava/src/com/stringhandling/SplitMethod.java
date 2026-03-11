package com.stringhandling;

public class SplitMethod {
	public static void main(String[] args) {
		String str = "Anand - Reddy - palle";
		String[] astr = str.split("-", 3);
		for (String s : astr) {
			System.out.println(s);
		}
	}
}
