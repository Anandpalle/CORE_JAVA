package com.operators;

public class TestOperators {

	public static void main(String[] args) {
		int a=10;
		System.out.println(a++);//10
		System.out.println(a++);//11
		System.out.println(++a);//13
		System.out.println(++a);//14
		System.out.println(++a);//15
		System.out.println(a++);//15
		System.out.println(a++);//16
		System.out.println(a);//17
		
		System.out.println(--a);//16
		System.out.println(a--);//16
		System.out.println(a--);//15
		System.out.println(--a);//13
		System.out.println(a--);//13
		System.out.println(a);//12
		
	}

}
