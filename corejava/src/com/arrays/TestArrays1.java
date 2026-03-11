package com.arrays;

public class TestArrays1 {
	void main() {
		String[] names = new String[4];
		names[0] = "abc";
		names[1] = "def";
		names[2] = "ghi";
		names[3] = "jkl";
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
		}
	}
}
