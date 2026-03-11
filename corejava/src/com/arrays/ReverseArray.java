package com.arrays;

public class ReverseArray {
	void main() {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("reversed array :  ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}
}
