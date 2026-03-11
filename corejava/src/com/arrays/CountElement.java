package com.arrays;

public class CountElement {
	void main() {
		int[] arr = { 222, 12, 246, 210, 444 };
		int count = 0;
		for (int num : arr) {
			while (num != 0) {
				if ((num % 10) == 2) {
					count++;
				}
				num = num / 10;
			}
		}
		System.out.println("number of 2's :" + count);
	}
}
