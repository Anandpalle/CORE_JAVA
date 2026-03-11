package com.javaFundamentals.methods;

import java.util.Scanner;

public class CompareTwoNumbers {
	void greatestOfTwoNumbers() {
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b) {
			System.out.println(a + " is greater");
		} else if (a <b) {
			System.out.println(b + " is greater");
		} else {
			System.out.println("both are equal");
		}
		sc.close();
	}

	public static void main(String[] args) {
		CompareTwoNumbers ct = new CompareTwoNumbers();
		ct.greatestOfTwoNumbers();

	}

}
