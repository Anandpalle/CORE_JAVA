package com.logicalstatements;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber {
	void main() {
		int attempts = 0;
		int maxAttempts = 3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess the number :");
		int num;
		Random rd = new Random();
		int randomNumber = rd.nextInt(10) + 1;
		while (attempts < maxAttempts) {

			num = sc.nextInt();
			attempts++;
			if (randomNumber == num) {
				System.out.println("you won !!");
			} else if (num > randomNumber) {
				System.out.println("you guessed number is greater than the random number");
			} else {
				System.out.println("you guessed number is less than the random number");
			}
			if (attempts == maxAttempts) {
				System.out.println("you lost !! your chances are over !! ");
				System.out.println("Random number =" + randomNumber);
			}

		}
	}
}
