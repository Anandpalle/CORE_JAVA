package com.javaFundamentals;

public class User {
   int amount;
   int pencost;
   
	public static void main(String[] args) {
		User u=new User();
		u.amount=100;
		  u.pencost=7;
		
		System.out.println("pens purchased :"+u.amount/u.pencost);
		System.out.println("reamaining money :"+u.amount%u.pencost);
		
	}

}
