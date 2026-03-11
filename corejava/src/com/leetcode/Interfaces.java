package com.leetcode;
interface i1{
	public static void hello(){
		System.out.println("hello method from 1i default method");
	}
	public static void hai() {
		System.out.println("hai method from 1i static  method");
	}
	public static void greetings() {
		System.out.println("greetings method from i1 default method");
	}
}
interface i2 extends i1{
	public default void hello(){
		System.out.println("hello method from 12 static method");
	}
	public default void hai() {
		System.out.println("hai method from 12 default method");
	}
	public default void greetings() {
		System.out.println("greetings method from i2 default method");
	}
}



public class Interfaces  {
	public static void main(String args[]) {
		Main m=new Main();
		m.hello();
		m.hai();
		m.greetings();
	}
}
