package com.arrays;

public class TransposeMatrix {
	void main() {
		int[][] org_matrix = { { 1, 2, 3 }, { 4, 5,6} };

		int rowlength = org_matrix.length;
		int columnlength = org_matrix[0].length;

		    
		int[][] t_matrix = new int[columnlength][rowlength];
		System.out.println("orginal matrix :");
		for (int i = 0; i < rowlength; i++) {
			for (int j = 0; j < columnlength; j++) {
				System.out.print(org_matrix[i][j] + " ");
				t_matrix[j][i] = org_matrix[i][j];
			}
			System.out.println();
		}
		System.out.println("Transepose Matrix.........");
		for (int i = 0; i < columnlength; i++) {
			for (int j = 0; j < rowlength; j++) {
				System.out.print(t_matrix[i][j] + " ");

			}
			System.out.println();
		}

	}
}
