package com.leetcode;

/*A strong number, also known as a Krishnamurthy number or Factorion,
  is a number in which the sum of the factorials of its digits is equal to the number itself. 
 For example, the number 145 is a strong number because 1! + 4! + 5! = 1 + 24 + 120 = 145*/
import java.util.Scanner;

public class StrongNumber {
	public static boolean isStrong(int n) {
		int temp = n;
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + fact(digit);
			n = n / 10;
		}

		return temp == sum;
	}

	public static int fact(int n) {
		int fact = 1;


		for (int i = 2; i <= n; i++) {
			fact = fact * i;

		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		System.out.println(" " + isStrong(a));
		sc.close();
	}

}
