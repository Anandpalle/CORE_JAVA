package com.leetcode;

import java.util.Scanner;

public class LargestElement {
	public static void ge(int arr[],int size) {
		int largest=arr[0];
		for (int i = 0; i <size ; i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
          
		}
		System.out.println("largest Element in array :"+largest);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements into array :");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		ge(arr,size);
		sc.close();

	}

}
