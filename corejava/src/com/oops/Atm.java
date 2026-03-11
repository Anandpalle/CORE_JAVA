package com.oops;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		Account[] users = new Account[3];
		users[0] = new Account(11111, 1000, 3000000);
		users[1] = new Account(22222, 1001, 4000000);
		users[2] = new Account(33333, 10002, 500000);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Account Number :");
		int accNum = sc.nextInt();
		Account curr = null;
		for (Account a : users) {
			if (a.accountNumber == accNum) {
				curr = a;
				break;
			}
		}
		if (curr == null) {
			System.out.println("invalid Account number !!");
			return;
		}
		System.out.println("Enter pin :");
		int pin = sc.nextInt();
		if (pin != curr.pin) {
			System.out.println("Incorrect Pin !!");
			return;
		}
		int choice;
		do {
			System.out.println("------------Welcome to ATM services-------------------");
			System.out.println("1. Check Balance");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit");
			System.out.println("4.change pin");
			System.out.println("5.Exit");
			System.out.println("Enter choice :");
			choice = sc.nextInt();

			switch (choice) {
			case 1 -> {
				System.out.println("Balanace :" + curr.balance);
				break;
			}
			case 2 -> {
				System.out.println("Enter amount to withdraw :");
				double wa = sc.nextDouble();
				if (wa <= 0) {
					System.out.println("Enter valid amount !!");
				} else if (wa>curr.balance) {
					System.out.println("insufficient balance !!");
				} else {
					curr.balance = curr.balance - wa;
					System.out.println("withdrawl successful !!");
				}
				break;
			}
			case 3 -> {
				System.out.println("Enter amount to deposit :");
				double da = sc.nextDouble();
				if (da <= 0) {
					System.out.println("Enter valid amount !!");
				} else {
					curr.balance = curr.balance + da;
					System.out.println("deposit suceessfull !!");
				}
				break;
			}
			case 4 -> {
				System.out.println("Enter new pin:");
				int newPin = sc.nextInt();
				curr.pin = newPin;
				System.out.println("pin changed successfully !!");
				break;
			}
			case 5 -> {
				System.out.println("Thanks for visiting ,visit again !!");
				break;
			}
			default -> System.out.println("Invalid choice !!");
			}

		} while (choice != 5);
	}
}
