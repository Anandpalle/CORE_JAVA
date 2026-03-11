package com.javaFundamentals.methods;

import java.util.Scanner;
//without return type with parameters
public class TestMethods2 {
	
	static void add(int a1,int b1) {
		int sum = a1 + b1;
		System.out.println("Sum = " + sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		add(a,b);
       sc.close();
	}

}
