package com.arrays;

public class SubArray {
	void main() {
		int arr[] = { 10, 2, -2, -20, 10 };
		int sum = -10;
		for (int i = 0; i < arr.length; i++) {
			int currentsum = 0;
			for (int j = i; j < arr.length; j++) {
				currentsum += arr[j];
				if (currentsum == sum) {
					System.out.println("sub array found from " + i + "," + j);
					return;
				}
			}
		}
	}
}
