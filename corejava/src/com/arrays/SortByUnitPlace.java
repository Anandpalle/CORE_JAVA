package com.arrays;

public class SortByUnitPlace {

	public static void main(String[] args) {
		int arr[] = { 16, 92, 19, 73, 85, 96, 91 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int temp=0;
				if(arr[i]%10>arr[j]%10 ){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			System.out.print(arr[i]+" ");

		}
	}
}
