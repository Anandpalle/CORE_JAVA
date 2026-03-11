package com.arrays;

public class SumOfArrays {
	void main() {
		int arr1[] = { 20, 30, 40 };
		int arr2[] = { 40, 50, 60 };
		int arr1_length = arr1.length;
		int arr2_length = arr2.length;
		int arr3[] = new int[arr1.length];
		if (arr1_length == arr2_length) {

			for (int i = 0; i < arr1.length; i++) {
				arr3[i] = arr1[i] + arr2[i];

			}
		}
		System.out.println("sum of two arrays : ");
		for (int n : arr3) {
			System.out.print(n + " ");
		}
	}
}
