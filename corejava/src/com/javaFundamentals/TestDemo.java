package com.javaFundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestDemo {

	BigInteger i1 = new BigInteger("12345677777709865788");
	BigInteger i2 = new BigInteger("23456789009876598767");

	BigDecimal d1 = new BigDecimal("1234567898747874466.980");
	BigDecimal d2 = new BigDecimal("1234567890873789789900.000");

	public static void main(String[] args) {
		TestDemo td = new TestDemo();

		BigInteger sum = (td.i1).add(td.i2);
		System.out.println("sum:" + sum);

		BigInteger product = (td.i1).multiply(td.i2);
		System.out.println("product:" + product);

		BigInteger quotient = (td.i1).divide(td.i2);
		System.out.println("quotient:" + quotient);

		BigInteger remainder = (td.i1).remainder(td.i2);
		System.out.println("remainder:" + remainder);

		BigDecimal sum1 = (td.d1).add(td.d2);
		System.out.println("sum:" + sum1);

		BigDecimal product1 = (td.d1).multiply(td.d2);
		System.out.println("product:" + product1);

		BigDecimal quotient1 = (td.d1).divide(td.d2);
		System.out.println("quotient:" + quotient1);

		BigDecimal remainder1 = (td.d1).remainder(td.d2);
		System.out.println("remainder:" + remainder1);

	}

}
