package com.oops.abstraction;

public class BasicCalculator implements ArithmeticOperations {

	@Override
	public double add(double a, double b) {
		double sum = a + b;
		return sum;

	}

	@Override
	public double subtract(double a, double b) {
		double difference = a - b;
		return difference;

	}

	@Override
	public double multiply(double a, double b) {
		double product = a * b;
		return product;

	}

	@Override
	public double division(double a, double b) {
		double quoitent = a / b;
		return quoitent;
	}

	@Override
	public double moduloDivision(double a, double b) {
		double remainder = a % b;
		return remainder;

	}

}
