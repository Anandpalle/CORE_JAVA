package com.arrays;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements :");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Represent an Array");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i]+" ");
		}

		System.out.println();
		System.out.println("prime numbers are");

		for (int n : arr) {
			boolean isPrime = true;
			if (n == 0 || n == 1) {
				isPrime = false;
			}
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(n);
			}
		}
	}
}
