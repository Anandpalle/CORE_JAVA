package com.logicalstatements;

import java.util.Scanner;

public class BankLoanEligibilityChecker {
	void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age :");
		int age = sc.nextInt();

		System.out.println("Employement Type(Salaried / Self-Employed) :");
		String empType = sc.next();

		System.out.println("Enter monthly Income :");
		double inc = sc.nextDouble();

		System.out.println("Enter credit score (1-900)");
		double cs = sc.nextDouble();
		 
		if (age >= 28 && age < 60) {

			if (empType.equalsIgnoreCase("salaried")) {
				if (inc > 25000) {
					if (cs >= 700) {
						System.out.println("Eligible for Loan ");
						System.out.println("High credit score! Fast processing");
					} else {
						System.out.println("Not Eligible for Loan");
						System.out.println("Reason: Credit score must be at least 700 for salaried individuals.");

					}

				} else {
					System.out.println("Not eligible for loan");
					System.out.println("Reason: Minimum income for slaried  must be 25000");
				}
			}
			if (empType.equalsIgnoreCase("Self-Employeed")) {
				if (inc > 50000) {
					if (cs >= 750) {
						System.out.println("Eligible for Loan ");
						System.out.println("High credit score! Fast processing");
					} else {
						System.out.println("not Eligible for Loan");
						System.out.println("Reason: Credit score must be at least 750 for self-employeed individuals.");

					}

				} else {
					System.out.println("Not eligible for loan");
					System.out.println("Reason: Minimum income for slaried  must be 25000");
				}
			}
		} else {
			System.out.println("Not eligible for loan.");
			System.out.println("Reason: Age must be between 21 and 60.");

		}
		sc.close();
	}

}
