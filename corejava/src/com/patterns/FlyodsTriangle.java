package com.patterns;

public class FlyodsTriangle {

	public static void main(String[] args) {
		int n = 5;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				sum = sum + 1;
				System.out.print(" " + sum);

			}
			System.out.println();
		}

	}

}
