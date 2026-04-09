package com.leetcode;

import java.util.Scanner;

public class BubbleSort {

	public static void bubbleSort(int arr[], int n) {
	    for (int i = 0; i < n - 1; i++) {
	        boolean swapped = false;

	        for (int j = 0; j < n - i - 1; j++) {
	            if (arr[j] > arr[j + 1]) {
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	                
	                swapped = true;
	            }
	        }

	        if (!swapped) break;
	        
	    }

	    for (int x : arr) {
	        System.out.print(x + " ");
	    }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size:");
		int n = sc.nextInt();

		int arr[] = new int[n];
		
		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		bubbleSort(arr, n);

		sc.close();
	}
}