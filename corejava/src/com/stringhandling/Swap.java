package com.stringhandling;

public class Swap {

	public static boolean isAlphaNumeric(char ch) {
		return (ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90);
	}

	public static void swap(String str) {

		char[] arr = str.toCharArray();

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {

			if (!isAlphaNumeric(arr[left])) {
				left++;
			}

			else if (!isAlphaNumeric(arr[right])) {
				right--;
			}

			else {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--;
			}
		}

		System.out.println(arr);
	}

	public static void main(String[] args) {
		String str = "VC$123@JRE56#";
		swap(str);
	}

}