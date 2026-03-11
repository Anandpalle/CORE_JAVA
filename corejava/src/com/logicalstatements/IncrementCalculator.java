package com.logicalstatements;

import java.util.Scanner;

public class IncrementCalculator {
	void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empolyee Salary :");
		double sal = sc.nextDouble();
		System.out.println("Enter employee experience :");
		double exp = sc.nextDouble();

		if (exp > 10) {
			System.out.println("Incriment is 10%");
			System.out.println("Incrimented salary :" + (sal + sal * 0.1));
		} else if (exp > 5) {
			System.out.println("Incriment is 5%");
			System.out.println("Incrimented salary :" + (sal + sal * 0.05));
		} else if (exp > 0) {
			System.out.println("Incriment is 0%");
			System.out.println("Incrimented salary :" + (sal));
		} else {
			System.out.println("Enter valid salary");

		}
		sc.close();
	}

}
