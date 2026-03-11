package com.java8features;

interface in2 {
	void message();
}

public class Main {

	public static void main(String[] args) {
		in2 i = () -> System.out.println("Happy morning !!");

		i.message();
	}

}
