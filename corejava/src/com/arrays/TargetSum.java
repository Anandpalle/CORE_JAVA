package com.arrays;

public class TargetSum {
	void main() {
		int arr[] = { 1, 5, 7, -1, 5 };

		int targetSum = 6;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == targetSum) {
					System.out.println(" " + arr[i] + " " + arr[j]);
				}

			}
		}
	}
}
