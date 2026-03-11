package com.java8features;

import java.util.function.Predicate;

public class TestPredicate {

    public static void main(String[] args) {

        Predicate<Integer> isPrime = (n) -> {
            if (n <= 1) return false;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        System.out.println("Prime numbers between 1-100:");

        for (int i = 1; i <= 100; i++) {
            if (isPrime.test(i)) {
                System.out.println(i);  
            }
        }
    }
}