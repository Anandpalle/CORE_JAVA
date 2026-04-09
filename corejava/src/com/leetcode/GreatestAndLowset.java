package com.leetcode;

import java.util.Scanner;

public class GreatestAndLowset {
	public static void greater(int a, int b) {
		int max = (a > b) ? a : b;
		System.out.println("Maximum number is" + max);

	}

	public static void lowest(int a, int b) {
		int min = (a < b) ? a : b;
		System.out.println("Minimum number is" + min);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number :");
		int b = sc.nextInt();

		greater(a, b);
		lowest(a, b);
	}

}
