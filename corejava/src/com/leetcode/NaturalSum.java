package com.leetcode;

import java.util.Scanner;

public class NaturalSum {
	public static void sum(int n) {
		int sum = n * (n + 1) / 2;
		System.out.println("Sum of natural numbers up to " + n + " is : " + sum);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		sum(a);
		sc.close();
	}

}
