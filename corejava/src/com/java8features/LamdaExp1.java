package com.java8features;

@FunctionalInterface
interface in1 {
	void sum(int a, int b);
}

//class Addition implements in1 {

//	@Override
//	public void sum(int a, int b) 

//}

public class LamdaExp1 {

	public static void main(String[] args) {
		in1 i = (a, b) -> {
			System.out.println("Sum : " + (a + b));
		};
		i.sum(2, 5);

	}
}
