package com.logicalstatements;

import java.util.Scanner;

public class ReverseNumber {
	void main() {

		System.out.println("Enter a number :");// 123
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem;
		int revnum = 0;

		for (; n != 0; n /= 10) {

			rem = n % 10;
			revnum = revnum * 10 + rem;
		}
		System.out.println("Reverse Number " + revnum);
		sc.close();
	}
}
