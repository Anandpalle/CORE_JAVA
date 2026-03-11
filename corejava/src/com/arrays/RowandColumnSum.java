package com.arrays;

public class RowandColumnSum {
	void main() {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		// 1 2 3
		// 4 5 6
//row sum
		for (int i = 0; i < arr.length; i++) {
			int row_sum = 0;

			for (int j = 0; j < arr[0].length; j++) {
				row_sum += arr[i][j];
			}
			System.out.println(" row  " + i + " sum :" + row_sum);
			System.out.println();
		}
		// column sum

		for (int i = 0; i < arr[0].length; i++) {
			int column_sum = 0;
			for (int j = 0; j < arr.length; j++) {
				column_sum += arr[j][i];
				
			}
			System.out.println(" column " + i + " sum :" + column_sum);
			System.out.println();
		}

	}
}
