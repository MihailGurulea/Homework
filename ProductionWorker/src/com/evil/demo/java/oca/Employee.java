package com.evil.demo.java.oca;

import java.time.LocalDate;
import java.time.Month;

public class Employee {
    private String empName;
    private String empNumber;
    private LocalDate hireDate;

    public Employee() {
        this.empName = "John";
        this.hireDate = LocalDate.of(2015, Month.JANUARY,1);
    }



    public Employee(String empName, String empNumber, LocalDate hireDate) {
        this.empName = empName;
        this.empNumber = empNumber;
        this.hireDate = hireDate;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empNumber='" + empNumber + '\'' +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}
