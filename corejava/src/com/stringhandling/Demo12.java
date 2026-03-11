package com.stringhandling;

public class Demo12 {
	public static void main(String[] args) {
		String str1 = "JAVA";
		String str2 = "java";

		if ((str1.equalsIgnoreCase(str2))) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}

}
