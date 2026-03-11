package com.arrays;

public class DuplicateElements {
	void main() {
		System.out.println("Duplicate elements are: ");
		int arr[] = { 1, 2, 5, 7, 3, 9, 3, 2 };

		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}

			}
			if (isDuplicate) {
				System.out.print(arr[i] + " ");

			}

		}
		
	}
}
