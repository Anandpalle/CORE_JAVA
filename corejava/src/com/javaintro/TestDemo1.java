package com.javaintro;

public class TestDemo1 {
	public static void method1() {
		System.out.println("static method");
		TestDemo1 t1 = new TestDemo1();
		t1.method2();

	}

	public void method2() {
		System.out.println("instance method");
		
		
	}

	static {
		System.out.println("static block");
		method1();

	}
	{
		System.out.println("instance block");

	}

	public static void main(String[] args) {
		System.out.println("main method ");

	}

}
