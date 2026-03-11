package com.arrays;

public class ArrayRotation {

	public static void arrRotation(int arr[], int k) {
		k = k % arr.length;
		for (int i = k; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < k; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int k = 3;
		arrRotation(arr, k);

	}
}
