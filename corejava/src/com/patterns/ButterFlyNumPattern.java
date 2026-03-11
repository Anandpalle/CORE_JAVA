package com.patterns;

public class ButterFlyNumPattern {
	void main() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for(int k=1;k<=2*(n-i);k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i-j+1);
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=n-i; j++) {
				System.out.print(j);
			}
			for(int k=1;k<=2*i;k++) {
				System.out.print(" ");
			}
			for(int j=n;j>i;j--) {
				System.out.print(j-i);
			}
			System.out.println();
		}
	}
}
