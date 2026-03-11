package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Student {

	int id;
	String name;
	int marks;

	Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	public static void main(String args[]) {

		Student s1 = new Student(101, "x", 99);
		Student s2 = new Student(102, "y", 98);
		Student s3 = new Student(103, "z", 50);
		Student s4 = new Student(104, "t", 60);

		List<Student> list = new ArrayList<>();

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		Predicate<Student> p = s -> s.marks > 65;
		Consumer<Student> c = s -> {
			if (s.marks > 35) {
				System.out.println("grade : pass");
			} else {
				System.out.println("grade : fail");
			}
		};

		for (Student s : list) {
			c.accept(s);
			if (p.test(s)) {
				System.out.println(s);
			}
		}
	}
}