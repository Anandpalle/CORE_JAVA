package com.logicalstatements;

import java.util.Scanner;

public class Factors {
	void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		System.out.print("Factors of " + n + " is :");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(" " + i);
			}
		}
		sc.close();
	}
}
