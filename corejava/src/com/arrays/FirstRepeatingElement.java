package com.arrays;

public class FirstRepeatingElement {
	void main() {
		int arr[] = { 5, 3, 4, 3, 5, 6, 7 };
		System.out.println("First repeating element :");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
					return;
				}
			}
		}
	}
}
