package com.javaFundamentals;

public class TestMethods {

	public static void main(String[] args) {
		TestMethods t = new TestMethods();

		int a3 = t.mul();
		System.out.println(" product = " + a3);

	}

	int add() {
		
		int a = 2;
		int b = 4;
		return a + b;
	}

	int sub() {
		int a1 = add();
		System.out.println(" sum = " + a1);

		int a = 2;
		int b = 3;
		return b - a;

	}

	int mul() {
		int a2 = sub();
		System.out.println(" difference = " + a2);
		
		int a = 4;
		int b = 8;
		return a * b;

	}

}
