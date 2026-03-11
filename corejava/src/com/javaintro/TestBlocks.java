package com.javaintro;

public class TestBlocks {
	static {
		System.out.println("static block");

	}
	{
		System.out.println("instance block");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		TestBlocks tb = new TestBlocks();
	}

}
