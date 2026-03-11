package com.operators;

public class Employee {
	String employeeName;
	boolean hasAccessCard;
	boolean biometricMatch;
	boolean isblockListed;
	boolean doorHasPower;

	Employee(String employeeName, boolean hasAccessCard, boolean isblockListed, boolean biometricMatch,
			boolean doorHasPower) {
		this.employeeName = employeeName;
		this.hasAccessCard = hasAccessCard;
		this.biometricMatch = biometricMatch;
		this.isblockListed = isblockListed;
		this.doorHasPower = doorHasPower;
	}

	boolean canAccess() {
		return hasAccessCard && biometricMatch && !(isblockListed) && doorHasPower;
		

	}

	void displayResult() {
		System.out.println("Employee name      :" + employeeName);
		String accessStatus=canAccess()?"granted":"deined";
		System.out.println("Acess status :"+accessStatus);
		System.out.println("----------------------------------------------------");
	}

	public static void main(String []args) {
		Employee e1 = new Employee("x", true, false, true, false);
		Employee e2 = new Employee("y", true, false, true, true);
		e1.displayResult();
		e2.displayResult();
	}

}
