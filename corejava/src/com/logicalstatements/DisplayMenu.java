package com.logicalstatements;

import java.util.Scanner;

public class DisplayMenu {
	void main() {
		String choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1st number : ");
			int a = sc.nextInt();
			System.out.println("Enter 2nd number : ");
			int b = sc.nextInt();

			System.out.println("1. Addition ");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");

			System.out.println("Enter operation to perform :");
			int op = sc.nextInt();

			switch (op) {
			case 1 -> System.out.println("SUM= " + (a + b));
			case 2 -> System.out.println("DIFFERENCE=" + (a - b));
			case 3 -> System.out.println("PRODUCT=" + (a * b));
			case 4 -> {
				if (b != 0)
					System.out.println("QUOTIENT=" + (a / b));
				else
					System.out.println("divide by zero error");

			}
			case 5 -> System.out.println("exiting....");
			default -> System.out.println("Invalid option");
			}

			System.out.println("do you want to continue (yes/no) :");
			choice = sc.next();

		} while (choice.equalsIgnoreCase("yes"));
		System.out.println("..............thank you.............");
	}
}
