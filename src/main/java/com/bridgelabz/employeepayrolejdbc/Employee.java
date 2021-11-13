package com.bridgelabz.employeepayrolejdbc;

import java.util.ArrayList;
public class Employee {
    int EmpId;
    String EmpName, Address, Department, EmpStart, Gender;
	int PhoneNumber;
    double BasicPay, Deductions, TaxablePay, IncomeTax, NetPay;
    ArrayList<Employee> empList;

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int i) {
        PhoneNumber = i;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getEmpStart() {
        return EmpStart;
    }

    public void setEmpStart(String empStart) {
        EmpStart = empStart;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public double getBasicPay() {
        return BasicPay;
    }

    public void setBasicPay(double basicPay) {
        BasicPay = basicPay;
    }

    public double getDeductions() {
        return Deductions;
    }

    public void setDeductions(double deductions) {
        Deductions = deductions;
    }

    public double getTaxablePay() {
        return TaxablePay;
    }

    public void setTaxablePay(double taxablePay) {
        TaxablePay = taxablePay;
    }

    public double getIncomeTax() {
        return IncomeTax;
    }

    public void setIncomeTax(double incomeTax) {
        IncomeTax = incomeTax;
    }

    public double getNetPay() {
        return NetPay;
    }

    public void setNetPay(double netPay) {
        NetPay = netPay;
    }

    @Override
    public String toString() {
        return "model.Employee{" +
                "EmpId=" + EmpId +
                ", EmpName='" + EmpName + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Address='" + Address + '\'' +
                ", Department='" + Department + '\'' +
                ", EmpStart='" + EmpStart + '\'' +
                ", Gender='" + Gender + '\'' +
                ", BasicPay=" + BasicPay +
                ", Deductions=" + Deductions +
                ", TaxablePay=" + TaxablePay +
                ", IncomeTax=" + IncomeTax +
                ", NetPay=" + NetPay +
                '}';
    }
}