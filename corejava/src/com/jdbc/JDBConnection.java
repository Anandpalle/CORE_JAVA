package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBConnection {
	public static void main(String[] args) {
		try {
			// 1. Load Driver

			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Database credentials
			String url = "jdbc:mysql://localhost:3306/anand_db";
			String user = "root";
			String password = "root";

			// 3. Establish connection
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Database connected successfully!");

			// 4. Create statement
			Statement st = con.createStatement();
			int n = st.executeUpdate("insert into student(student_name,student_marks) values('anand',98)");
			if (n > 0) {
				System.out.println(n + " rows affected");
			} else {
				System.out.println("something went wrong!!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
