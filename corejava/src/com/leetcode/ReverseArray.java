package com.leetcode;

import java.util.Scanner;

public class ReverseArray {
	public static void rev(int arr[], int size) {

		for (int i = 0; i < size / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[size - i - 1];
			arr[size - i - 1] = temp;
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		System.out.println("Enter elements into an array :");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		rev(arr, size);
		sc.close();

	}

}
