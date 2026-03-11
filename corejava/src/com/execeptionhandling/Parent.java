package com.execeptionhandling;

public class Parent {
	void method1() {
		System.out.println("parent  class Method called");
	}
}

class Child extends Parent {
	void method2() {
		System.out.println("Child class Method called !!");
	}
}

class Main {
	public static void main(String[] args) {
		Child c = (Child) new Parent();
		try {
			c.method1();
			c.method2();

		} catch (ClassCastException cce) {
			System.err.println(cce.getMessage());
		}
	}
}