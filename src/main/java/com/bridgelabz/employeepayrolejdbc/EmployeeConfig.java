package com.bridgelabz.employeepayrolejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeConfig {

    public Connection getConfig(){
        String URL_JD = "jdbc:mysql://localhost:3306/payrollservice";
        String USER_NAME = "root";
        String PASSWORD = "root";
        Connection connection;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers loaded!!");
            connection = DriverManager.getConnection(URL_JD,USER_NAME,PASSWORD);
            System.out.println("connection Established!!");
        } catch (ClassNotFoundException e) {
            throw new EmployeeException("invalid driver");
        } catch (SQLException throwables) {
            throw new EmployeeException("Invalid get connection parameters");
        }
        return connection;
    }
}