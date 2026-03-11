package com.operators;

import java.util.Scanner;

public class Grade {
	void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name :");
		String name = sc.nextLine();
		System.out.println("Enter student marks");
		int marks = sc.nextInt();

		String grade = marks >= 90 ? "A"
				: marks >= 80 ? "B" : marks >= 70 ? "C" : marks >= 50 ? "D" : marks >= 35 ? "E" : "Fail";
		System.out.println("Student Name=" + name);
		System.out.println("Student marks=" + marks);
		System.out.println("Student grade=" + grade);
		sc.close();
	} 

}
