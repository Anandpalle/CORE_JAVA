package com.javaFundamentals.methods;

import java.util.Scanner;

public class Bank {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter Account Number  ");
		long accNo = sc.nextLong();
		System.out.println("Enter Account Holder Name ");
		String accHolName = sc.next();
		System.out.println("Enter PIN");
		int pin = sc.nextInt();
		System.out.println("Enter balance");
		int accBal = sc.nextInt();

		System.out.println("Account Number      : " + accNo);
		System.out.println("Account Holder Name :" + accHolName);
		System.out.println("PIN                 :" + pin);
		System.out.println("Balance             :" + accBal);
		withdraw(accBal);
       
	}

	static void withdraw(int accBal) {
		System.out.println("Enter withdrawl amount");
		int wdAmount = sc.nextInt();
		System.out.println("Withdrawl amount  :" + wdAmount);
		int updBal =accBal - wdAmount;
		System.out.println("updated balance " +updBal );
		 deposit(updBal);

	}

	static void deposit(int updBal) {
		System.out.println("Enter deposit amount");
		int depAmount = sc.nextInt();
		System.out.println("Deposit Amount  :" + depAmount);
		System.out.println("updated balance :" + (updBal + depAmount));
	}
}
