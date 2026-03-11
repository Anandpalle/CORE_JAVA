package com.oops;

public class BankAccount {
	private long accountNumber;
	private String accountHolderName;
	private double accountBalance;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void displayAccountdetails() {
		System.out.println("AccountNumber :" + accountNumber);
		System.out.println("Account Holder:" + accountHolderName);
		System.out.println("Balance       :" + accountBalance);
	}

}


class SavingsAccount extends BankAccount {
	private double intrestRate;

	public double getIntrestRate() {
		return intrestRate;
	}

	public void setIntrestRate(double intrestRate) {
		this.intrestRate = intrestRate;
	}

	public void calculateIntrest() {
		double intrest = (getAccountBalance() * intrestRate);
		System.out.println("Intrest :" + intrest);
	}

}

class CurrentAccount extends SavingsAccount {
	private double overDraftLimit;

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}

}
