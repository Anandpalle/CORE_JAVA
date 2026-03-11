package com.logicalstatements;

public class EvenNumbers {
	void main() {
		System.out.println("....Even numbers 0-100......");
		for (int i = 0; i <= 100; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("....Odd numbers 0-100.....");
		for (int i = 1; i <= 100; i = i + 2) {
			System.out.print(i + " ");
		}

	}
}
