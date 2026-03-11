package com.javaFundamentals.methods;

public class SimpleIntrest {
	SimpleIntrest(){
		
	}
	double calSI() {
		int p = 200000;
		int t = 3;
		int r = 2;
		double si = p * t * r / 100;
		return si;
	}

	public static void main(String[] args) {
		SimpleIntrest si = new SimpleIntrest();
		System.out.println("Simple Intrest : " + si.calSI());
	}

}
