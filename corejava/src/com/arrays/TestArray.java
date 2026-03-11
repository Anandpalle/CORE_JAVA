package com.arrays;

public class TestArray {
	void main() {
		int count=0;
		int[] arr = { 4, 6, 3, 4, 5, 7, 6 };
		for (int i = 1; i < arr.length; i++) {
           if(arr[i]>=arr[i-1]||arr[i]>=arr[i+1]||(arr[i]<arr.length)) {
        	   count++;
           }
		}
		System.out.println(count);
	}
}
