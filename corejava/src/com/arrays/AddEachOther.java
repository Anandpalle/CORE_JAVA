package com.arrays;

/* 
  Input:
arr = [2, 4, 6]

Output:
Result: [10, 8, 6]
 */
public class AddEachOther {
	void main() {
		int arr[] = { 2, 4, 6 };
		int l = arr.length;
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				System.out.print(arr[l - 1 - i] + arr[l - 1 - j] + " ");
			}
		}

	}

}
