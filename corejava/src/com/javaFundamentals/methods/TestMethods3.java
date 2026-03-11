package com.javaFundamentals.methods;

//with return type without arguments
import java.util.Scanner;

public class TestMethods3 {
	static int add() {
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		int sum = a + b;
		return sum;
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Sum= " + add());
	}

}
