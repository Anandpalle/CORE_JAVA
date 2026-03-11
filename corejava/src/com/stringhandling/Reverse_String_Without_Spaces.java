package com.stringhandling;

public class Reverse_String_Without_Spaces {

	public static void main(String[] args) {
		char str1;
		
		String str = "    java    is    simple     ";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				str1=str.charAt(i);
			}
		}
	

	}

}
