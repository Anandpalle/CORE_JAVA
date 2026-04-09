package com.leetcode;

import java.util.Scanner;

public class DigitCount {
	public static void digiCount(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		System.out.println("number of digits :" + count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		digiCount(n);
		sc.close();

	}

}
