package com.javaintro;

public class Operation {
       static int collegeId;
       static String collegeName;
       int studentId;
       String studentName;
	public static void main(String[] args) {
		collegeId=123;
		collegeName="x";
		
		System.out.println("college Id"+collegeId);
		System.out.println("collegename"+collegeName);
		
		Operation op=new Operation();
		op.studentId=1;
		op.studentName="xxxxx";
		System.out.println("student Id"+op.studentId);
		System.out.println("studentName"+op.studentName);
		
		

	}

}
