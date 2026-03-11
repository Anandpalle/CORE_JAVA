package com.leetcode;

public class Demo1 {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 4, 1 };

        // Initialize with first element
        int max = arr[0];
        int second_max = arr[0];
        int third_max = arr[0];

        for (int num : arr) {
            if (num > max) {
                third_max = second_max;
                second_max = max;
                max = num;
            } else if (num > second_max && num < max) {
                third_max = second_max;
                second_max = num;
            } else if (num > third_max && num < second_max) {
                third_max = num;
            }
        }

        System.out.println("Second max = " + second_max);
        System.out.println("Third max = " + third_max);
        System.out.println("Sum = " + (second_max + third_max));
    }
}
