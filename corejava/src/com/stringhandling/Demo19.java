package com.stringhandling;

public class Demo19 {

	public static void main(String[] args) {
		String str = "Digital";
		String str1 = "Software";
		String str2 = " java";
		String str3 = "red,green,blue";
		
		String result = str.substring(2);
		System.out.println(result);

		boolean starts = str1.startsWith("Soft");
		boolean ends = str1.endsWith("ware");

		System.out.println(starts);
		System.out.println(ends);

		System.out.println(str2.trim());
		String[] result1 = str3.split(",", 3);
		for (String s : result1) {
			System.out.println(s);
		}
	
	}

}
