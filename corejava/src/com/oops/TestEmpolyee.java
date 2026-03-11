package com.oops;

public class TestEmpolyee {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpno(33);
		e.setEname("Hardik");
		e.setSalary(1000000);
		System.out.println(e.getEmpno());
		System.out.println(e.getEname());
		System.out.println(e.getSalary());
	}
}

