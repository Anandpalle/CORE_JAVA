package com.javaFundamentals.methods;
//no return type no arguments
import java.util.Scanner;

public class EvenOdd {
	void findingEvenOdd() {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is an even number");
		} else {
			System.out.println(num + " is odd number");
		}
		sc.close();
	}

	public static void main(String[] args) {
		EvenOdd e = new EvenOdd();
		e.findingEvenOdd();
	}

}
