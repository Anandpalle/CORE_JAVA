package com.javaFundamentals.constructors;

public class Student {
	int rollno;
	String name = "Anand";
	String course = "jfs";
	double fee = 25000;

	Student(int rollno) {
		this.rollno = rollno;
	}

	Student(int rollno, String name) {
		this(rollno);
		this.name = name;
	}

	Student(int rollno, String name, String course) {
		this(rollno, name);
		this.course = course;
	}

	Student(int rollno, String name, String course, double fee) {
		this(rollno, name, course);
		this.fee = fee;

	}

	void display() {
		System.out.println("roll number :" + rollno);
		System.out.println("Name :" + name);
		System.out.println("Course name :" + course);
		System.out.println("course fee" + fee);
	}

	public static void main(String[] args) {
		Student s = new Student(64);
		s.display();

	}

}
