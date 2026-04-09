package com.mechanicbuddy.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static String url = "jdbc:mysql://localhost:3306/mechanic_buddy";
	private static String username = "root";
	private static String password = "root";

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL Driver Loaded...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {

		Connection con = null;

		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}
}
