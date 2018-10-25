package com.evil.demo.java.oca;

public class Employee {
    private String empName;
    private String empNumber;
    private String hireDate;

    public Employee(String empName, String empNumber, String hireDate) {
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

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
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
