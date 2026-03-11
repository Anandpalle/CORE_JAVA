package com.oops;
//Write a Java program using Encapsulation with the following requirements:

//
//Create a class Student with the following private fields:
//
//name
//
//age
//
//marks
//
//Provide getters and setters for all fields.
//
//Apply simple validation:
//
//age must be greater than 0
//
//marks must be between 0 and 100
//
//If invalid, print an error message

public class Student {
	private String name;
	private int age;
	private int marks;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {

		return age;
	}

	public void setMarks(int marks) {
		this.marks = marks;

	}

	public int getMarks() {
		return marks;

	}

}
