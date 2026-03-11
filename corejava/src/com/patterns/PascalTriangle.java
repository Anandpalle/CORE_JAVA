package com.patterns;

public class PascalTriangle {
	void main() {
		int n = 5;
		for (int i = 0; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			int num=1;
			for(int k=0;k<=i;k++) {
				System.out.print(num+" ");
				num=num*(i-k)/(k+1);
			}
			System.out.println();
		}
	}
}
