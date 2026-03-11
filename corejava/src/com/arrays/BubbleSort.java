package com.arrays;

public class BubbleSort {
	void main() {
	int arr[] = { 20, 40, 30, 10, 15 };
	
		int temp = 0;
         boolean isswapped;
		for (int i = 0; i < arr.length-1; i++) {
			isswapped=false;
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isswapped=true;

				}
			}
			if (!isswapped) {
				break;
			}
		}
		for(int n:arr) {
			System.out.print(n+" ");
			
		}
	}
}
