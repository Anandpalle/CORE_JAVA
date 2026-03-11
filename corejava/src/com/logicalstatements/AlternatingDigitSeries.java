package com.logicalstatements;

import java.util.Scanner;

public class AlternatingDigitSeries {
	int op = 1;
	int es = 0;
	int rem = 0;

	int oddProduct(int n) {
		while (n != 0) {
			rem = n % 10;//1234/10->4
			n = n / 100;//122
			op = op * rem;
		}
		return op;

	}

	int evenSum(int n) {
		while (n != 0) {
			n = n / 100;// 1234/100->123  //1/10->12
			rem = n % 10;// 123%10->3     //1%10->1
			es = es + rem;//
			
		}
		return es;
	}

	void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int op1 = oddProduct(n);
		int es1 = evenSum(n);
		System.out.println("odd product: " + op1);
		System.out.println("Even sum :" + es1);
		System.out.println("difference  :" + (op1 - es1));
		sc.close();
	}
}
