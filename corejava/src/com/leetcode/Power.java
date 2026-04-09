package com.leetcode;
//Power of a number (without Math.pow)
import java.util.Scanner;

public class Power {
	public static void pow(int m,int  n) {
		int product=1;
		for(int i=1;i<=n;i++) {
			product *=m;
		}
		System.out.println(" "+product);

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		System.out.println("Enter its power :");
		int b = sc.nextInt();
		pow(a,b);
		sc.close();
	}
}
