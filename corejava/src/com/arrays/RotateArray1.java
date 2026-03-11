package com.arrays;

import java.util.Scanner;

public class RotateArray1 {
	public static void arrayRotation(int arr[],int r){
		r=r%arr.length;
		for(int i=r;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<r;i++) {
			System.out.print(arr[i]+" ");
		}
	}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int arr[]= {1,2,3,4,5,6,7};
	System.out.println("Enter position to rotate");
	int r=sc.nextInt();
	
          arrayRotation(arr,r);
	
}
}
