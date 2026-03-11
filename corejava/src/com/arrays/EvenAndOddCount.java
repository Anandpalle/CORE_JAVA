package com.arrays;

public class EvenAndOddCount {
	void main() {
		int oddCount = 0;
		int evenCount = 0;
		int[] arr = { 2, 5, 7, 8, 10 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Even Count :" + evenCount);
		System.out.println("Odd count  :" + oddCount);
	}
}
