package com.evil.demo.java.oca;

import java.time.LocalDate;

public class ShiftSupervisor extends Employee{
    private double salary;
    private double earlyBonus;

    public ShiftSupervisor(String empName, String empNumber, LocalDate hireDate, double salary, double earlyBonus) {
        super(empName, empNumber, hireDate);
        this.salary = salary;
        this.earlyBonus = earlyBonus;
    }

    public double getSalary() {
        return salary;
    }

    public double getEarlyBonus() {
        return earlyBonus;
    }

    @Override
    public String toString() {
        return "ShiftSupervisor{" + super.toString() +
                "salary=" + salary +
                ", earlyBonus=" + earlyBonus +
                '}';
    }
}
