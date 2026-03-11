package com.stringhandling;

public class Demo17 {

	public static void main(String[] args) {
		String str = "Anand123";
		int alphaCount = 0;
		int digitCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				alphaCount++;

			} else if (Character.isDigit(ch)) {
				digitCount++;
			}
		}
		System.out.println("no. of alphabets :" + alphaCount + "," + "no. of digits :" + digitCount);
	}

}
