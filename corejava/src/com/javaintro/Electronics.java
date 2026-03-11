package com.javaintro;

public class Electronics {

	public static void laptop() {
		System.out.println("static method");
	}
	static {
		System.out.println("static block");
		laptop();
	}
	{
		System.out.println("instance block");
	}
	public void mouse() {
		System.out.println("instance method");
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Electronics e=new Electronics();
		
		e.mouse();
		

	}

}
