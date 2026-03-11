package com.stringhandling;

public class MaxSubString {

	public static void maxSub(String str) {

		String current = "";
		String maxString = "";

		for (char c : str.toCharArray()) {

			if (current.contains(String.valueOf(c))) {

				System.out.println(current);

				if (current.length() > maxString.length()) {
					maxString = current;
				}

				current = "";
			}

			current = current + c;
		}

		if (!current.isEmpty()) {
			System.out.println(current);

			if (current.length() > maxString.length()) {
				maxString = current;
			}
		}

		System.out.println("Max Substring : " + maxString);
	}

	public static void main(String[] args) {
		maxSub("abcabcdd");
 	}
}