package com.logicalstatements;

import java.util.Scanner;

public class SimpleCalculator {
	void main() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st number :");
		double a = sc.nextDouble();
		System.out.println("Enter 2nd number :");
		double b = sc.nextDouble();

		System.out.println(".........Simple Calculator.................");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulo division");

		System.out.println("Select operation to perform :");
		int choice = sc.nextInt();

		System.out.println("Result=" + operations(a, b, choice));

		sc.close();

	}

	double printMessage() {
		System.out.println("Select valid option");
		return 0;
	}

	double operations(double x1, double x2, int choice) {
		return switch (choice) {
		case 1 -> (x1 + x2);
		case 2 -> (x1 - x2);
		case 3 -> (x1 * x2);
		case 4 -> (x1 / x2);
		case 5 -> (x1 % 2);
		default -> printMessage();
		};

	}

}
