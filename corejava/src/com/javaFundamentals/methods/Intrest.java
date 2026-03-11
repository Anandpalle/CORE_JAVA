package com.javaFundamentals.methods;

import java.util.Scanner;
//import java.math.BigInteger;

public class Intrest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal Amount");
		double p = sc.nextDouble();
		System.out.println("Rate of intrest(%)");
		double r = sc.nextDouble();
		System.out.println("Time(in years)");
		double t = sc.nextDouble();

		simpleIntrest(p, t, r);
		Intrest i = new Intrest();
		i.compoundIntrest(p, t, r);

		sc.close();
	}

	static void simpleIntrest(double p, double t, double r) {
		double si = (p * t * r) / 100;
		System.out.println("Simple Intrest :" + si);

	}

	void compoundIntrest(double p, double t, double r) {
		double ci = p * (Math.pow((1 + r / 100), t)) - p;
		System.out.println("Compound Intrest:" + ci);

	}

}
