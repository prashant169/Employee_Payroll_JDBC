package com.bridgelabz.employeepayrolejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeConfig {

	private static Connection connection = null;

	static {
		String URL_JD = "jdbc:mysql://localhost:3306/payrollservice";
		String USER_NAME = "prashant";
		String PASSWORD = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL_JD, USER_NAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			throw new EmployeeException("invalid driver");
		} catch (SQLException throwable) {
			throw new EmployeeException("Invalid get connection parameters");
		}
	}

	public static Connection getConfig() {
		return connection;
	}

}