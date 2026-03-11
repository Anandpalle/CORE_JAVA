package com.logicalstatements;

import java.util.Scanner;

public class RevNum {
	int rev = 0;
	int rem = 0;

	int printRevNum(int n) {
       while(n!=0) {
    	   rem=n%10;
    	   n=n/10;
    	   rev=rev*10+rem;
       }
		return rev;
	}

	void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		
		System.out.println("Reverse Number :" + printRevNum(n));

		sc.close();
	}
}
