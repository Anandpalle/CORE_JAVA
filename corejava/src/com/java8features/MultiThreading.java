package com.java8features;

public class MultiThreading {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Thread t = new Thread(() -> {

			for (int i = 0; i <= 10; i++) {
				System.out.println("Run method  :" + i);
			}
		});
		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("main method  :" + i);
		}

	}
}
