package com.arrays;

public class PosNextNeg {

	public static void main(String[] args) {

		int[] arr = { -5, 2, 1, 3, -1, -7, 4 };
		int[] arr1 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0) {
				arr1[i] = arr[i];
			} else {
				// find next positive element
				int j = i + 1;
				while (j < arr.length && arr[j] < 0) {
					j++;
				}
				if (j < arr.length) {
					arr1[i] = arr[j];
				} else {
					arr1[i] = 0; // if no positive found
				}
			}
		}

		for (int n : arr1) {
			System.out.print(n + " ");
		}
	}
}
