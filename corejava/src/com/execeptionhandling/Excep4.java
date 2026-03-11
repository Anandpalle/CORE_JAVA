package com.execeptionhandling;

public class Excep4 {

	public static void main(String[] args) {
		try {
			System.out.println(1 / 0);
		} catch (ArithmeticException ae) {
			System.out.println("catch block 1" + ae.getMessage());

		} catch (Exception e) {
			System.out.println("catch block 2" + e.getMessage());
		} catch (Throwable t) {
			System.out.println("catch block 3" + t.getMessage());
		}
	}

}
