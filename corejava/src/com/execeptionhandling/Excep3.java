package com.execeptionhandling;

public class Excep3 {

	public static void main(String[] args) {
		try {

			System.out.println(1 / 0);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.exit(0);
		} finally {
			System.out.println("finally block!!");
		}
	}

}
