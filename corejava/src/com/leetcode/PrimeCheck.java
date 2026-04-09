package com.leetcode;

import java.util.Scanner;

public class PrimeCheck {
	public static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return status;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean status = isPrime(n);
		if (status == true) {
			System.out.println("Prime number");
		}{
			System.out.println("not a prime Number");
		}
		sc.close();
	}

}
