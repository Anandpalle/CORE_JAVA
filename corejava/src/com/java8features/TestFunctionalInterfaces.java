package com.java8features;

import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestFunctionalInterfaces {

	public static void main(String[] args) {

		// Predicate
		Predicate<Integer> isEven = (n) -> n % 2 == 0;
		System.out.println(isEven.test(10));

		// Consumer
		Consumer<String> printName = (name) -> System.out.println("Hello " + name);

		printName.accept("Anand");

		// Function
		Function<Integer, String> convertString = (num) -> num.toString();

		System.out.println("number string " + convertString.apply(1000).getClass());

	}
}