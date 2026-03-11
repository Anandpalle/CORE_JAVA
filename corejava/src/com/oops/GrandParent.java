package com.oops;

public class GrandParent {
	void familyName() {
		System.out.println("Family Name : Palle's");
	}
}

class Parent extends GrandParent {
	void parentName() {
		System.out.println("Mother Name :Rajitha");
		System.out.println("Father name :Srinivas");
	}
}

class Child extends Parent {
	void childName() {
		System.out.println("Anand");
	}
}

class Main {
	public static void main(String[] args) {
        Child c=new Child();
       c.familyName();
       c.parentName();
       c.childName();
	}
}