package com.arrays;

import java.util.Scanner;

public class RotateArray {
	void main() {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 20, 30, 27, 40 };
		int result[] = new int[arr.length];
		System.out.println("Enter the position to rotate :");
		int r = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			result[(r + i) % arr.length] = arr[i];
		}
		System.out.println("Rotated Array");
		for (int n : result) {
			System.out.print(n + " ");
		}
	}
}
