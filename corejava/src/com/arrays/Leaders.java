package com.arrays;

public class Leaders {

	public static void main(String[] args) {
		int arr[] = { 16, 17, 4, 3, 5, 2 };
		int leader = arr[arr.length - 1];
		System.out.println(leader);
		for (int i = arr.length - 1; i > 0; i--) {
			if (leader < arr[i]) {
				leader = arr[i];
				System.out.println(leader);
			}
 
		}

	}

}
