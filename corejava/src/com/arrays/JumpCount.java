package com.arrays;

public class JumpCount {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 1, -1, 4, 8 };
		int start = 0;
		int jump_count = 0;
		boolean visited[] = new boolean[arr.length];
		while (start>=0 && start < arr.length) {
			if (visited[start]) {
				System.out.println("on loop");
				break;
			}
			visited[start] = true;
			jump_count++;
			int jump = arr[start];
			if (jump == 0) {
				System.out.println("stuck");
				break;
			}
			start += jump;

		}
		System.out.println("jump count : " + jump_count);

	}

}
