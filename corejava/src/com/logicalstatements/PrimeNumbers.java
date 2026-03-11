package com.logicalstatements;

import java.util.Scanner;

public class PrimeNumbers {
	static long series(long num) {
		while(num>0) {
			int t=(int) (num%10);
			
		}
		return num;
	}
	static boolean isPrime1(long num) {
		if (num <= 1) {
			return false;
		} else {
			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		long num = sc.nextLong();
		series(num);
		if(isPrime1(num))
		System.out.println("prime number");
		else
			System.out.println("not a prime number");
	}
   
}
//123456