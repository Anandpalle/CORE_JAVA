package com.javaintro;

public class TestDemo{
	static TestDemo td=new TestDemo();
	public static void main(String[] args) {
		System.out.println("main method started");
		method1();
		System.out.println("main method  ended");

	}

	public static void method1() {
		System.out.println("hello method1");
		td.method5();
	}

	public static void method2() {
		System.out.println("hello method2");
		td.method6();
		
	}

	public static void method3() {
		System.out.println("hello method3");
		td.method7();
	}

	public static void method4() {
		System.out.println("hello method4");
		td.method8();
	}

	void method5() {
		System.out.println("hello method5");
		method2();
	}

	void method6() {
		System.out.println("hello method6");
		method3();
	}

	void method7() {
		System.out.println("hello method7");
		method4();
	}

	void method8() {
		System.out.println("hello method8");
	}

}
