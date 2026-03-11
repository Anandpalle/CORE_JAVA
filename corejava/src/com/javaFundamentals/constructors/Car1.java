package com.javaFundamentals.constructors;

public class Car1 {
	String carName = "x";
	static int carSpeed = 80;

	void display1() {
		System.out.println("car Name=" + carName);
		
	}

	static void display2() {
		System.out.println("Car Speed=" + carSpeed);
		Car1 c=new Car1();
		c.display1();
	}

	void main() {
		
		display2();
	}
}