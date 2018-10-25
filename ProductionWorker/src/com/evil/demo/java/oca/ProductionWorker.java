package com.evil.demo.java.oca;

public class ProductionWorker extends Employee {
    private int shift;
    private double hourlyPayRate;

    public ProductionWorker(String empName, String empNumber, String hireDate, int shift, double hourlyPayRate) {
        super(empName, empNumber, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift() {
        return shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    @Override
    public String toString() {
        return "ProductionWorker{" + super.toString() +
                "shift=" + shift +
                ", hourlyPayRate=" + hourlyPayRate +
                '}';
    }
}
