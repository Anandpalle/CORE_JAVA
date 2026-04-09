package com.leetcode;

import java.util.Scanner;

public class ChoclateFactory1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size:");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int j = 0; // position for next non-zero

		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				j++;
			}
		}

		// Output
		System.out.println("Result:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}
}