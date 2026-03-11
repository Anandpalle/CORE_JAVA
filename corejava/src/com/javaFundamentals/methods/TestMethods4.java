package com.javaFundamentals.methods;

import java.util.Scanner;

//with return type  & with arguments
public class TestMethods4 {
	static int add(int a1, int b1) {
		int sum = a1 + b1;
		return sum;
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		System.out.println("sum="+add(a,b));

	}

}
