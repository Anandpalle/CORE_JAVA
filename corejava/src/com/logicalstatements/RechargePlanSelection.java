package com.logicalstatements;

import java.util.Scanner;

public class RechargePlanSelection {
	void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("select yout paln :");
		System.out.println("1 → ₹199 (28 days, 1.5GB/day) ");
		System.out.println("2 → ₹399 (56 days, 1.5GB/day) ");
		System.out.println("3 → ₹599 (84 days, 2GB/day)   ");

		int choice = sc.nextInt();
//		switch (choice) {
//		case 1: {
//			System.out.println("your recharge plan successful !!");
//			System.out.println("Recharge plan :₹199 (28 days, 1.5GB/day)");
//			break;
//		}
//		case 2: {
//			System.out.println("your recharge plan successful !!");
//			System.out.println("Recharge plan :₹399 (56 days, 1.5GB/day)");
//			break;
//		}
//		case 3: {
//			System.out.println("your recharge plan successful !!");
//			System.out.println("Recharge plan :₹599 (84 days, 2GB/day) ");
//			break;
//		}
//		default:
//			System.out.println("Enter valid Recharge plan");
//
//		}
		
		
		
		switch(choice) {
		case 1->{
			System.out.println("your recharge plan successful !!");
			System.out.println("Recharge plan :₹199 (28 days, 1.5GB/day)");
			
		}
		case 2-> {
			System.out.println("your recharge plan successful !!");
			System.out.println("Recharge plan :₹399 (56 days, 1.5GB/day)");
			
		}
		case 3-> {
			System.out.println("your recharge plan successful !!");
			System.out.println("Recharge plan :₹599 (84 days, 2GB/day) ");
			
		}
		default->
			System.out.println("Enter valid Recharge plan");
		}
		sc.close();

	}

}

//1 → ₹199 (28 days, 1.5GB/day)
//2 → ₹399 (56 days, 1.5GB/day)
//3 → ₹599 (84 days, 2GB/day)
