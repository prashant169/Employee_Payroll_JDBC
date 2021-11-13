package com.bridgelabz.employeepayrolejdbc;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class EmployeePayRollTest {
	EmployeePayRollService employeePayRollService = new EmployeePayRollService();

	@Test
	public void givenEmployeePayrollDB_WhenRetrieved_ShouldMatchEmployeeCount() {
		String sql = "select * from employee_payroll";
		List<Employee> employeePayrollDataList = employeePayRollService.queryExecute(sql);
		Assert.assertEquals(8, employeePayrollDataList.size());
	}

	@Test
	public void givenUpdatingTerisaBasicPay_whenUpdate_ShouldReturnUpdatedPay() {
		double BasicPay = 3000000;
		String Name = "Terisa";
		double salaryUpdated = employeePayRollService.updateBasicPay(Name, BasicPay);
		Assert.assertEquals(BasicPay, salaryUpdated, 0.0);
	}

	@Test
	public void givenUpdatingRahulBasicPay_whenUpdate_ShouldReturnUpdatedPay() {
		double BasicPay = 800000;
		String Name = "rahul";
		double salaryUpdated = employeePayRollService.updateBasicPay(Name, BasicPay);
		Assert.assertEquals(BasicPay, salaryUpdated, 0.0);
	}

}