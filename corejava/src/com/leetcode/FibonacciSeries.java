package com.leetcode;

import java.util.Scanner;

public class FibonacciSeries {
    public static void fbs(int n) {
        int first = 0, second = 1;
        System.out.println("Fibonacci series:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many terms you want:");
        int a = sc.nextInt();
        fbs(a);
        sc.close();
    }
}