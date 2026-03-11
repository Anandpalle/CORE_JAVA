package com.javaFundamentals.methods;

import java.util.Scanner;

public class ZoomCar {
	static String greetings() {
		String g = "Welcome to Zoom Car Rental services";
		return g;
	}

	static String companyName() {
		String cn = "Zoom Car";
		return cn;
	}

	static double dailyRentalRate() {
		double rp = 1500;
		return rp;
	}

	static double baseRentalCost(int n1) {
		double brc = n1 * dailyRentalRate();
		return brc;
	}

	static double fixedInsurance() {
		int fi = 500;
		return fi;
	}

	static double totalCost(int n1) {
		double tc = baseRentalCost(n1) + fixedInsurance();
		return tc;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of days rented");
		int n = sc.nextInt();

		System.out.println(" " + greetings());
		System.out.println(" Company Name       :  " + companyName());
		System.out.println("No.of days Rented   :  " + n);
		System.out.println(" Daily Rental Rate  :  " + dailyRentalRate());
		System.out.println(" Base Rental Cost   :  " + baseRentalCost(n));
		System.out.println(" Total cost         :  " + totalCost(n));

		sc.close();
	}

}
