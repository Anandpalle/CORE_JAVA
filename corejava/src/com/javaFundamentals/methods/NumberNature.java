package com.javaFundamentals.methods;
//no return type no arguments
import java.util.Scanner;

public class NumberNature {
	static void natureOfNumber() {
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println(num + " is +ve number");
		} else if (num < 0) {
			System.out.println(num + " is -ve number");
		} else {
			System.out.println("zero");
		}
	}

	static Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		natureOfNumber();
		sc.close();
	}

}
