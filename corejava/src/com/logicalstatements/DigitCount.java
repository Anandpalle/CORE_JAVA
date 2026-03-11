package com.logicalstatements;

import java.util.Scanner;

public class DigitCount {
	void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();// 123
		int count = 0;

		for (int i = n; i > 0;) {
			i = i / 10;
			count++;

		}

		System.out.println("digit count :" + count);

		sc.close();
	}
}
