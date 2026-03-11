package com.javaFundamentals;

public class Calculator {
	String cousumerName = "x";
	int units = 200;

	static String companyName = "TSNPDCl";
	static float totalUnits=0;
	static float totalRevenue=0;
	final float unit_cost = 7.5f;

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setData();
		c.generateBill();
		
	}
	void setData() {
		System.out.println("...............Consumer Details.................");
		System.out.println("Consumer Name : "+cousumerName);
		System.out.println("Company Name  : "+Calculator.companyName);
		System.out.println("units consumed:"+units);
	  
	}
	void generateBill() {
		float tax=50.0f;
		float amount;
		amount=units*unit_cost;
		float billAmount=amount+tax;
		totalUnits=totalUnits+units;
		totalRevenue=totalRevenue+billAmount;
		System.out.println("..................bill details............................");
		System.out.println("Amount      :"+amount);
		System.out.println("Bill Amount :"+billAmount);
		System.out.println("Total Units  :"+totalUnits);
		System.out.println("Total Revenue:"+totalRevenue);
		
		
		
		
	}
}
