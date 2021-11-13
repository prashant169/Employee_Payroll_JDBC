package com.bridgelabz.employeepayrolejdbc;

import java.util.Scanner;

public class EmployeePayRoll {
	public static void main(String[] args) {
		EmployeePayRollService employeePayRollService = new EmployeePayRollService();
		Scanner scanner = new Scanner(System.in);

		final int EXIT = 10;
		int choice = 0;
		while (choice != EXIT) {
			System.out.println(
					"enter your choice\n1. Execute query\n2. update basic pay\n3. display employee roll\n10. EXIT");
			choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				String query = "select * from employee_payroll";
				employeePayRollService.queryExecute(query);
				employeePayRollService.display();
			}
			case 2: {
				System.out.println("enter employee name");
				String empName = scanner.next();
				System.out.println("enter basic pay you want to update");
				double basicPay = scanner.nextDouble();
				employeePayRollService.updateBasicPay(empName, basicPay);
			}
			case 3:
				employeePayRollService.display();
			case 10:
				System.out.println("good bye");
			}
		}
	}
}