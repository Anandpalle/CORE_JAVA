package com.arrays;

public class MissingNumber {
	void main() {
		int arr[] = { 1, 2, 3, 4, 6, 7 };
		int i=1;
		System.out.println("Missing number :");
		for(int n:arr) {
			if(n!=i++) {
				System.out.println(i-1);
				return;
			}
		}
	}
}
