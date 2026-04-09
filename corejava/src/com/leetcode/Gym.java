package com.leetcode;

import java.util.Scanner;

public class Gym {
	public static void main(String[] args) {
		System.out.println("Enter number of Months :");
		Scanner sc = new Scanner(System.in);
		int months = sc.nextInt();

		if (months == 1) {
			System.out.println("20000");
		} else if (months == 2 || months == 3) {
			System.out.println("50000");
		} else if (months >= 4 && months <= 6) {
			System.out.println("90000");
		} else if (months == 9) {
			System.out.println("120000");
		} else if (months == 12) {
			System.out.println("150000");
		} else if (months < 0) {
			System.out.println("invalid input");
		} else if (months == 0) {
			System.out.println("0");
		} else {
			System.out.println("Error");
		}

		sc.close();
	}
}