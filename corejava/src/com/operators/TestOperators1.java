package com.operators;

import java.util.Scanner;

public class TestOperators1 {

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		String result = (a % 2 == 0) ? "even" : "odd";
		System.out.println(result);
		sc.close();

	}

}
