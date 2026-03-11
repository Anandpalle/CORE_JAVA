package com.logicalstatements;

import java.util.Scanner;

public class Factorial {
	void main() {
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + n + " is :" + fact);
		sc.close();

	}
}
