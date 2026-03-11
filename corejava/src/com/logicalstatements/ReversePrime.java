package com.logicalstatements;

import java.util.Scanner;

public class ReversePrime {
	void revNum(int n) {
		int rn = 0;
		int r;
		while (n != 0) {
			r = n % 10;
			rn = rn * 10 + r;
			n = n / 10;
		}
		boolean isP = isPrime(rn);
		if (isP) {
			System.out.println(rn + " is a prime number");
		} else {
			System.out.println(rn + " is not a prime number");
		}
		

	}

	boolean isPrime(int rn) {
		int count = 0;
		for (int i = 1; i <= rn; i++) {
			if (rn % i == 0) {
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
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		revNum(n);

		sc.close();
	}
}
