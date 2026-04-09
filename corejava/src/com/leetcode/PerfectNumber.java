package com.leetcode;

import java.util.Scanner;

public class PerfectNumber {
	public static boolean isPerfect(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
	
		return sum==n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		System.out.println(a + (isPerfect(a) ? " is a Perfect Number" : " is NOT a Perfect Number"));
		sc.close();

	}

}
