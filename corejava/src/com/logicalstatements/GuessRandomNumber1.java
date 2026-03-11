package com.logicalstatements;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber1 {

	void main() {
		int attempts = 0;
		int maxAttempts = 3;
		Random rd = new Random();
		int randomNumber = rd.nextInt(10) + 1;
		System.out.println("...welcome to number guessing game...");

		Scanner sc = new Scanner(System.in);
		System.out.println("Guess the number (1-10) :");
		do {

			int num = sc.nextInt();
			attempts++;
			if (randomNumber == num) {
				System.out.println("you won !!");
				break;
			} else if (num > randomNumber) {
				System.out.println("Too high !!");
			} else {
				System.out.println("Too low !!");
			}
			if (attempts == maxAttempts) {
				System.out.println("your attempts are completed you lost");
				System.out.println("Random number is " + randomNumber);
				break;
			}

		} while (attempts < maxAttempts);

	}
}
