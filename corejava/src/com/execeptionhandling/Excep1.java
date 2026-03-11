package com.execeptionhandling;

import java.util.Scanner;

public class Excep1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = sc.nextInt();
		System.out.println("Enter second number :");
		int b = sc.nextInt();
		try {
			System.out.println("qoutient :" + a / b);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.getStackTrace();
		} finally {
			System.out.println("Execution completed !");
		}
		sc.close();

	}

}
