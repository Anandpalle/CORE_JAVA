package com.logicalstatements;

import java.util.Scanner;

public class IncomeTaxCalculator {
	void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your annual income (in ₹):");
		double income = sc.nextDouble();
		if (income >= 1000000) {
			System.out.println("you fall under 30% tax ");
			System.out.println("Tax amount ₹:" + (income * 0.30));
		} else if (income >= 500000) {
			System.out.println("you fall under 20% tax ");
			System.out.println("Tax amount ₹:" + (income * 0.20));
		} else if (income >= 250000) {
			System.out.println("you fall under 5% tax ");
			System.out.println("Tax amount ₹:" + (income * 0.05));
		} else if (income >= 0) {
			System.out.println("you fall 0% under tax ");
			System.out.println("Tax amount ₹:" + (income * 0));
		} else {
			System.out.println("Enter valid amount ");
		}
		sc.close();
	}

}
//₹0 – ₹2.5L: No tax
//
//₹2.5L – ₹5L: 5%
//
//₹5L – ₹10L: 20%
//
//₹10L+: 30%