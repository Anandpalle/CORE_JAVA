package com.javaFundamentals.methods;

import java.util.Scanner;
//without  return type without arguments

public class TestMethods1 {
	static void add() {
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("Sum = " + sum);
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		add();

	}

}
