package com.logicalstatements;

import java.util.Scanner;

public class PrimeNum {
	int primeSeries(int n) {

		System.out.println("prime numbers are :");
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= n; j++) {
				if (i % j == 0) {
					count++;
				}

			}
			if (count <= 2) {

				System.out.println(i);
			}

		}

		return 0;
	}

	void main() {
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		primeSeries(n);
		sc.close();
	}
}
