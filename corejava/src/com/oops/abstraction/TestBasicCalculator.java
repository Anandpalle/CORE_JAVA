package com.oops.abstraction;

import java.util.Scanner;

public class TestBasicCalculator {

	public static void main(String[] args) {
		ArithmeticOperations op = new BasicCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("sum        :"+op.add(a, b));
		System.out.println("difference :"+op.subtract(a, b));
		System.out.println("product    :"+op.multiply(a, b));
		System.out.println("quoitent   :"+op.division(a, b));
		System.out.println("remainder  :"+op.moduloDivision(a, b));
		
		
		
		
		 

	}

}
