package com.logicalstatements;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber2 {
	void main() {
		System.out.println("....welcome to number guessing game.....");
		int maxAttempts = 3;
		Random rd = new Random();
		int randomNumber = rd.nextInt(10) + 1;

		System.out.println("Guess the number (1-10)  :");
		Scanner sc = new Scanner(System.in);
		int num;
		for (int attempts = 1; attempts <= maxAttempts; attempts++) {

			num = sc.nextInt();
			if (num == randomNumber) {
				System.out.println("you won !!");
				break;
			} else if (num > randomNumber) {
				System.out.println("Too high !!");
			} else {
				System.out.println("Too low !!");
			}
			if (attempts == maxAttempts) {
				System.out.println("you attempts are completed !! game over !!");
				System.out.println("Random Number " + randomNumber);
				break;
			}

		}

	}
}
