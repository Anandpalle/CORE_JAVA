package com.logicalstatements;

import java.util.Scanner;

public class ArmstrongNumber {
	boolean isAmstrong(int n) {
		int temp = n;
		int count = 0;
		while (temp != 0) {
			temp = temp / 10;
			count++;
		}
		int rem;
		int asnum = 0;
		temp = n;
		while (temp != 0) {
			rem = temp % 10;
			asnum = asnum + (int)  Math.pow(rem, count);
			temp = temp / 10;
		}
		return n == asnum;
	}

	void main() {
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (isAmstrong(n)) {
			System.out.println(n + " is an Amstrong number");
		} else {
			System.out.println(n + " is not  an Amstrong number");
		}
		sc.close();

	}

}
