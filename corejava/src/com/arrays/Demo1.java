package com.arrays;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 3, 2, 1, 4 };
		int start = 0;
		int jump_count = 0;
		boolean[] visited = new boolean[arr.length];
		while (visited[start] && start < arr.length) {
			if (visited[start]) {
				System.out.println("cycle detected at index " + start);
				break;
			}
			visited[start] = true;
			jump_count++;
			int jump = arr[start];
			if (jump == 0) {
				System.out.println("stuck at index" + start + "with zero jump");
				break;
			}
			start += jump;
		}
		System.out.println("jump count " + jump_count);
	}

}
