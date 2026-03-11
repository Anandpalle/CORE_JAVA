package com.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	int eid = 10;
	transient String password = "1234";

	public static void main(String[] args) throws IOException {
		Employee e = new Employee();
		FileOutputStream fos = new FileOutputStream("C:\\javaTextfiles\\employee.str");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
		System.out.println("Object Serialized");

	}

}
