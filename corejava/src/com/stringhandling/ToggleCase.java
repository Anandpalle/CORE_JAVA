package com.stringhandling;
public class ToggleCase {
    public static void main(String[] args) {
        String input = "JaVa";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}
