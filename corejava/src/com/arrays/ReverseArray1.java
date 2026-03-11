package com.arrays;

public class ReverseArray1 {
	void main() {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = new int[arr1.length];
		int i = 0;
		for (int n : arr1) {
			arr2[arr1.length - 1 - i] = n;
			i++;
		}
		for (int n2 : arr2) {
			System.out.print(n2 + " ");
		}
	}

}
