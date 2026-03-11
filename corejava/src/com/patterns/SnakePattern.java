package com.patterns;

public class SnakePattern {
	void main() {
		int n = 4;
		int k = 1;
		for (int i = 1; i <= n; i++) {

			if (i % 2 != 0) {
				for (int j = 1; j <= n; j++) {
					System.out.print(k++ + " ");
				}

			} else {
				for (int j = 1; j <= n; j++) {
					System.out.print(2*k + " ");
				}
			}

			System.out.println();
		}
	}
}
