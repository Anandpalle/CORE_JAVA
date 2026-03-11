package com.arrays;

public class ReverseDigits {
	void main() {
		int arr[] = { 12, 305, 44, 9 };
		for (int n : arr) {
			int rev = 0;
			while (n != 0) {
				int rem = n % 10;
				rev = rev * 10 + rem;
				n = n / 10;
			}
			System.out.print(rev + " ");
		}

	}
}
