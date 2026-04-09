package com.leetcode;

import java.util.Scanner;

public class PolindromeNumber {
	public static boolean isPolindrome(int n) {
		int rev = 0;
		int temp = n;
		while (n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;

		}
		return rev==temp;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println(isPolindrome(n));
		sc.close();
	}
}
