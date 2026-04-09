package com.leetcode;

/*An Automorphic number is a number
  whose square ends with the same digits
  as the number itself. For example, 
  5 is automorphic because ( 5^2 = 25 ),
  and the last digit of 25 is 5. 
 */
import java.util.Scanner;

public class AutomorphicNumber {
	public static boolean isAutomorphic(int n) {
		int square = n * n;
		int digit = n % 10;
		int squareDigit = square % 10;
		if (digit == squareDigit) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		System.out.println(" " + isAutomorphic(a));
		sc.close();

	}

}
