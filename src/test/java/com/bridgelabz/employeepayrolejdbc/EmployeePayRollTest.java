package com.bridgelabz.employeepayrolejdbc;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class EmployeePayRollTest {

	EmployeePayRollService employeePayRollService = new EmployeePayRollService();

	@Test
	public void givenEmployeePayrollDB_WhenRetrieved_ShouldMatchEmployeeCount() {
		String sql = "select * from employeepayroll";
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
		String Name = "prashant";
		double salaryUpdated = employeePayRollService.updateBasicPay(Name, BasicPay);
		Assert.assertEquals(BasicPay, salaryUpdated, 0.0);
	}

}