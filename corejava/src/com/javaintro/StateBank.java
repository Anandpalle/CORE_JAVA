package com.javaintro;

public class StateBank {
	static long acc = 112233L;

	
	{
		acc++;
		System.out.println("Acount number:" + acc);
	}

	public static void main(String[] args) {

		// Account Holder1 details
		String name = "x";
		int bal = 9001;
		System.out.println("Name: " + name);
		System.out.println("Balance:" + bal);
		StateBank sb1 = new StateBank();

		// Account Holder2 details

		String name1 = "y";
		int bal1 = 9002;
		System.out.println("Name : " + name1);
		System.out.println("Balance: " + bal1);
		StateBank sb2 = new StateBank();

		// Account Holder3 details

		String name2 = "x";
		int bal2 = 10000;
		System.out.println("Name: " + name2);
		System.out.println("Balance: " + bal2);
		StateBank sb3 = new StateBank();

	}

}
