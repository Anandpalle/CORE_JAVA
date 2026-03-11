package com.logicalstatements;

import java.util.Scanner;

public class CourseSelection {
	void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Program (1-Computer Science, 2-Electronics, 3-Mechanical):");
		int program = sc.nextInt();

		switch (program) {

		case 1 -> {

			System.out.println("Enter Course Code (CS101/CS102/CS103):");
			String course = sc.next();

			String p1 = "COMPUTER SCIENCE";
			System.out.println("Program Selected :" + p1);

			switch (course.toUpperCase()) {

			case "CS101" -> {
				String c1 = "DATA STRUCTURES";
				System.out.println("Course selected :" + c1);
			}
			case "CS102" -> {
				String c2 = "OPERAING SYSTEMS";
				System.out.println("Course selected :" + c2);
			}
			case "CS103" -> {
				String c3 = "COMPUTER NETWORS";
				System.out.println("Course selected :" + c3);
			}
			default -> System.out.println("select available course only !!");
			}

		}
		case 2 -> {

			System.out.println("Enter Course Code (EC201/EC02/EC203):");
			String course = sc.next();

			String p2 = "ELECTRONICS";
			System.out.println("Program Selected :" + p2);

			switch (course.toUpperCase()) {
			case "EC201" -> {
				String c1 = "DIGITAL ELECTRONICS";
				System.out.println("Course selected :" + c1);
			}
			case "EC202" -> {
				String c2 = "ANALOG CIRCUITS";
				System.out.println("Course selected :" + c2);
			}
			case "EC203" -> {
				String c3 = "MICROPROCESSORS";
				System.out.println("Course selected :" + c3);
			}
			default -> System.out.println("select available course only !!");
			}

		}
		case 3 -> {

			System.out.println("Enter Course Code (ME301/ME302/ME303):");
			String course = sc.next();

			String p3 = "MECHANICAL";
			System.out.println("Program Selected :" + p3);

			switch (course.toUpperCase()) {
			case "ME301" -> {
				String c1 = "THERMODYNAMICS";
				System.out.println("Course selected :" + c1);
			}
			case "ME302" -> {
				String c2 = "FLUID MECHANICS";
				System.out.println("Course selected :" + c2);
			}
			case "ME303" -> {
				String c3 = "MECHANICAL DESIGN";
				System.out.println("Course selected :" + c3);
			}
			default -> System.out.println("select available course only !!");
			}

		}
		default -> System.out.println("select available program only !!  ");
		}
		sc.close();
	}

}
