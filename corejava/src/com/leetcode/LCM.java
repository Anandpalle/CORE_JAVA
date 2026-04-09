package com.leetcode;

import java.util.Scanner;

public class LCM {
   
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; 
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number :");
        int b = sc.nextInt();

        System.out.println("GCD = " + gcd(a, b));
        System.out.println("LCM = " + lcm(a, b));

        sc.close();
    }
}