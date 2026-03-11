package com.javaFundamentals;

public class FindingNum1 {

	public static void main(String[] args) {
		int a = 987;
		int b = a / 100;
		System.out.println("100s :" + b);
		int c = a / 10;
		c = c % 10;
		System.out.println("10s :" + c);
		int d = a % 100;
		d = d % 10;

		System.out.println("1s :" + d);

	}

}
