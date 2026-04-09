package com.leetcode;

import java.util.Scanner;;

public class ReverseNumber {
	public static void rev(int n) {
		int rev = 0;
		int temp = n;
		while (n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		System.out.println("orginal number :" + temp);
		System.out.println("Reverse number :" + rev);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		rev(n);
		sc.close();

	}

}
