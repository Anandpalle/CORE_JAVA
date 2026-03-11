package com.javaFundamentals;

//we cannot access non-static feilds to static method
//we should use the static keyword to feilds
//or else we should inside the static-method
public class TestDemo1 {
	public static int add(int a,int b) {
		int sum;
		sum=a+b;
		return sum;
	}
	public static int add(int a,int b,int c) {
		int sum;
		sum=a+b+c;
		return sum;
	}

	public static void main(String[] args) {
		int sum1=TestDemo1.add(4, 6);
		int sum2=TestDemo1.add(2, 4,6);
		System.out.println("sum="+sum1);
		System.out.println("sum="+sum2);
		
		

		
	}

	
	}


