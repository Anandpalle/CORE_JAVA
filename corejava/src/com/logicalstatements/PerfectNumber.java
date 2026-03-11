package com.logicalstatements;

import java.util.Scanner;

public class PerfectNumber {
	void main() {
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
		 		
			}
		}
		if (sum==n) {
 			System.out.println(n+" is perfect number ");
 		}else {
 			System.out.println(n+" is not a perfect number");
 		}
      sc.close();
	}
}
