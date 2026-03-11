package com.arrays;

public class Array2D_sorting {
	void main() {
		//int temp = 0;
		int arr[][] = { { 3, 5, 1 }, { 7, 6, 5 }, { 1, 2, 10 } };
		System.out.println("Orginal Array :");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("sorted array by rows:");
		for (int i = 0; i < arr.length; i++) {
            for (int a = 0; a < arr[i].length; a++) {
                for (int b = 0; b < arr[i].length - 1; b++) {
                    if (arr[i][b] > arr[i][b + 1]) {
                        int temp = arr[i][b + 1];
                        arr[i][b + 1] = arr[i][b];
                        arr[i][b] = temp;
                    }
                }
            }
        }

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
