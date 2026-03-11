package com.fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Employee1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(" C:\\javaTextfiles\\employee.str");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee e = (Employee) ois.readObject();
		ois.close();

		System.out.println(e.eid);
		System.out.println(e.password);
	}

}
