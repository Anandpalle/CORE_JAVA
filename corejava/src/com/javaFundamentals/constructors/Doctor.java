package com.javaFundamentals.constructors;

class Doctor {
	String name;
	long phoneno;
	char gender;
	double salary;
    Doctor (String name,long phoneno,char gender,double salary){
    	this.name=name;
    	this.phoneno=phoneno;
    	this.gender=gender;
    	this.salary=salary;
    }
	Doctor(Doctor d) {
		this.salary = d.salary*(15/100);
	     

	}

	void display() {
		System.out.println("doctor name :" + name);
		System.out.println("phone number :" + phoneno);
		System.out.println("gender :" + gender);
		System.out.println("salary :" + salary);
	}

	public static void main(String[] args) {
		Doctor d = new Doctor("x",987654333,'M',60000);
		Doctor d1=new Doctor(d);
         d.display();
         d1.display();
	}

}
