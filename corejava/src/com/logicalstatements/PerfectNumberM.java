package com.logicalstatements;

import java.util.Scanner;

public class PerfectNumberM {
	boolean isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n)
			return true;
		else
			return false;

	}

	void main() {
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (isPerfect(n))
			System.out.println(n + " is a perfect Number");
		else
			System.out.println(n + " is not a perfect Number");

		sc.close();
	}
}
