package com.oops;

public class TestBankAccont {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		SavingsAccount sa = new SavingsAccount();

		sa.setAccountNumber(1234567);
		sa.setAccountHolderName("Anand");
		sa.setAccountBalance(1000000);
		sa.setIntrestRate(0.5);
		System.out.println("-------------------------Savings Account----------------------------------------");
		sa.displayAccountdetails();
		System.out.println("Intrest rate :" + sa.getIntrestRate());
		sa.calculateIntrest();

		CurrentAccount ca = new CurrentAccount();
		ca.setAccountNumber(74321008);

		ca.setAccountHolderName("Reddy");
		ca.setAccountBalance(6000000);
		ca.setOverDraftLimit(40000);
		System.out.println("-----------------------Current Account----------------------------------------------");
		ca.displayAccountdetails();
		System.out.println("Over draft Limit :" + ca.getOverDraftLimit());

	}
}
