package com.leetcode;

import java.util.Scanner;

public class GCD {
	public static void gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		System.out.println("gcd is :" + a);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number :");
		int b = sc.nextInt();
		gcd(a, b);
		sc.close();
	}

}
