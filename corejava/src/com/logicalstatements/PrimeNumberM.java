package com.logicalstatements;

import java.util.Scanner;

public class PrimeNumberM {
	boolean isPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count <= 2) {
			return true;
		} else {
			return false;
		}
	}

	void main() {
		System.out.println("Enter  a number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (isPrime(n)) {
			System.out.println("prime number");
		} else {
			System.out.println("not a prime number");
		}
		sc.close();
	}
}
