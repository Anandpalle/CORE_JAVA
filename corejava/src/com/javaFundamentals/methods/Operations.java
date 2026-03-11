package com.javaFundamentals.methods;

import java.util.Scanner;

public class Operations {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter 1'st number");
		int a = sc.nextInt();
		System.out.println("Enter 2'nd number");
		int b = sc.nextInt();
		Operations op = new Operations();
		op.add1(a, b);

	}

	void add1(int x, int y) {
		int sum = x + y;
		System.out.println("sum=" + sum);
		System.out.println(".............................................");
		System.out.println("first number "+sum);
		System.out.println("enter 2nd number");
		int x1 = sc.nextInt();
		add2(sum, x1);
	}

	void add2(int sum, int x2) {
		int sum1 = sum + x2;
		System.out.println("sum1=" + sum1);
		System.out.println(".............................................");
		System.out.println("first number="+sum1);
		System.out.println("enter 2nd number");
		int x3 = sc.nextInt();
		add3(sum1, x3);
	}

	static void add3(int sum1, int x3) {
		int sum2 = sum1 + x3;
		System.out.println("sum2=" + sum2);
		System.out.println(".............................................");
		System.out.println("first number= "+sum2);
		System.out.println("enter 2nd number");
		int x4 = sc.nextInt();
		add4(sum2, x4);
	}

	static void add4(int sum2, int x4) {
		int sum3 = sum2 + x4;
		System.out.println("sum3=" + sum3);
	}
}
