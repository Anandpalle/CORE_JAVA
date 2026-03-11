package com.oops;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("Enter \n 1.Name \n 2.Age \n 3.Marks");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		int marks = sc.nextInt();
		s.setName(name);
		s.setAge(age);
		s.setMarks(marks);
		System.out.println("Student name :" + s.getName());
		if (s.getAge() > 0) {
			System.out.println("Student Age :" + s.getAge());
		} else {
			System.out.println("Invalid Age!!");

		}
		if (s.getMarks() >= 0 && s.getMarks() <= 100) {
			System.out.println("Student Marks :" + s.getMarks());
		} else {
			System.out.println("invalid marks !!");
		}
	}
}
