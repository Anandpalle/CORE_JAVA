package com.arrays ;

public class LongestSequence {
	void main() {
		int[] arr = { 5, 6, 3, 7, 8, 2, 3, 4, 5 };
		int curr_length = 1;
		int max_length = 1;
		int end_Index = 0;
		System.out.println("Longest sequence :");
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				curr_length++;
			} else {
				curr_length = 1;
			}
			if (curr_length >= max_length) {
				max_length = curr_length;// 4
				end_Index = i;
			}

		}
		int start_Index = end_Index - max_length - 1;
		for (int i = start_Index; i < end_Index; i++) {
			System.out.print(i + " ");

		}

	}

}
