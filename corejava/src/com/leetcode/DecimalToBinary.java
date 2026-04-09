package com.leetcode;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int binary[] = new int[32]; 
        int i = 0;

        while (num > 0) {
            binary[i] = num % 2;   
            num = num / 2;         
            i++;
        }

        System.out.print("Binary number: ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }
    }
}