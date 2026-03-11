package com.multithreading;

class PrimePolindrome extends Thread {

	synchronized void primeNumbers() {
		for (int i = 1; i <= 50; i++) {
			int count = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println("Prime Number: " + i);
			}
		}
	}

	synchronized void polindromeNumbers() {

		for (int i = 0; i <= 50; i++) {
			int num = i;
			int rev = 0;

			while (num != 0) {
				rev = rev * 10 + num % 10;
				num = num / 10;
			}

			if (rev == i) {
				System.out.println("Palindrome Number: " + i);
			}
		}
	}

	@Override
	public void run() {
		primeNumbers();
		polindromeNumbers();
	}
}

public class Demo {
	public static void main(String[] args) {

		PrimePolindrome obj = new PrimePolindrome();

		obj.start();
	}
}