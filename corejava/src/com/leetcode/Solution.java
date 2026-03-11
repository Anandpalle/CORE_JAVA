package com.leetcode;

class Solution {

	public int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {

			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}

			digits[i] = 0;
		}

		int[] result = new int[digits.length + 1];
		result[0] = 1;

		return result;
	}

	public static void main(String[] args) {

		Solution s = new Solution();
		int digits[] = { 8, 9, 9 };

		int[] ans = s.plusOne(digits);

		for (int n : ans)
			System.out.print(n + " ");
	}
}
