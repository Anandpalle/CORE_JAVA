package com.logicalstatements;

import java.util.Scanner;

public class FactorsM {
	static void printFactors(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Factors of " + n + " is :");
		printFactors(n);
		
		sc.close();
	}
}
