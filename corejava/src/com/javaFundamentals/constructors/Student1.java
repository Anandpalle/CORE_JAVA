package com.javaFundamentals.constructors;
public class Student1 {
	int id;
	String name;
	int marks;
	
	
	static int count=0;
	Student1() {
		
		count=count+1;
		
		id = 10;
		name = "xxxxx";
		marks = 80;
		System.out.println("id=" + id);
		System.out.println("name=" + name);
		System.out.println("marks=" + marks);
		System.out.println("*************************************************");
		
	}
	

	public static void main(String[] args) {
		Student1 c = new Student1();
		Student1 c1=new Student1();
		Student1 c2=new Student1();
		System.out.println("object count="+count);
	}

}
