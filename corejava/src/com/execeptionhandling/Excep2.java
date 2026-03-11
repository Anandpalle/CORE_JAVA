package com.execeptionhandling;

public class Excep2 {
	public static void main(String args[]) {
		System.out.println("main method started");
		String s1 = null;

		try {
			System.out.println(s1.length());
		} catch (Throwable ne) {
			System.err.println(ne.getMessage());

		}
	}
}
