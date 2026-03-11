package com.leetcode;

import java.util.Arrays;

class TargetSum {
	public int[] twoSum(int[] nums, int target) {
		int[] ta = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++)
				if (nums[i] + nums[j] == target) {
					ta[0] = i;
					ta[1] = j;
					return ta;
				}

		}
		return ta;
	}

	public static void main(String[] args) {
		TargetSum ts = new TargetSum();
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int []arr=ts.twoSum(nums, target);
		System.out.println(Arrays.toString(arr));
	}
}