package com.stringhandling;

import java.util.Scanner;

public class Demo7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.next();
		String rev = "";

		for (int i = str.length()-1; i >= 0; i--) {
			char ch = str.charAt(i);
			rev = rev + ch;
		}
		System.out.println("Reverse String :" + rev);
		System.out.println("Orginal String :" + str);
		if (str.equals(rev)) {
			System.out.println("polindrome");

		} else {
			System.out.println("not a polindrome");
		}
		sc.close();
	}

}
