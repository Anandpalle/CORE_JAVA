package com.arrays;

public class ZeroesToLast {
	void main() {
		int arr[] = { 1, 2, 0, 5, 2, 0, 4, 8, 0 };
		int count = 0;
		for (int n : arr) {

			if (n == 0) {
				count++;
				continue;
			}
			System.out.print(n + " ");

		}
		for (int i = 1; i <= count; i++) {
			System.out.print("0" + " ");
		}

	}
}
