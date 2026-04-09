package com.leetcode;

import java.util.Scanner;

public class QuadraticEquation {
	public static void findRoots(int a, int b, int c) {
		double d = b * b - 4 * a * c;
		if (d > 0) {
			double r1 = (-b + Math.sqrt(d)) / (2 * a);
			double r2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("roots are real and distinct");
			System.out.println("roots are : " + r1 + "," + r2);
		} else if (d == 0) {
			double r1 = -b / (2 * a);
			System.out.println("roots are real and equal");
			System.out.println("roots are : " + r1 + "," + r1);

		} else {
			double realPart = -b / (2 * a);
			double imgPart = Math.sqrt(-d) / (2 * a);
			System.out.println("roots are imaginary and distinct");
			System.out.println("root1 :" + realPart + "+" + imgPart + "i");
			System.out.println("root1 :" + realPart + "-" + imgPart + "i");
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value :");
		int a = sc.nextInt();

		System.out.println("Enter b value :");
		int b = sc.nextInt();

		System.out.println("Enter c value :");
		int c = sc.nextInt();

		findRoots(a, b, c);
		sc.close();

	}
}
