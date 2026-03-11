package com.arrays;

public class SecondMinAndMax {
	void main() {
		int[] arr = { 2, 1, 3, 6, 5 };
		int max = arr[0];
		int min = arr[0];
		int second_max = arr[0];
		int second_min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (second_max != arr[i]&& second_max < arr[i]) {
				second_max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			} else if (second_min !=arr[i] && second_min > arr[i]) {
				second_min = arr[i];
			}
		}
		System.out.println("First Max:" + max);
		System.out.println("First min:" + min);
		System.out.println("Second Highest=" + second_max);
		System.out.println("Second lowest=" + second_min);
	}
}
