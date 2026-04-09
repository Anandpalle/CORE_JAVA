package com.leetcode;

import java.util.Scanner;

public class AmstrongNumber {
    private static boolean isArmstrong(int n) {
        int power = 0;
        int temp = n;
        int sum = 0;

        // count digits
        while (temp > 0) {
            temp = temp / 10;
            power++;
        }

        temp = n; 

  
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, power);
            temp = temp / 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
        sc.close();
    }
}