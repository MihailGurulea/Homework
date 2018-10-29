package com.evil.demo.java.oca;

import java.time.LocalDate;

public class ProductionWorker extends Employee {
    private int shift;
    private double hourlyPayRate;

    public ProductionWorker(String empName, String empNumber, LocalDate hireDate, int shift, double hourlyPayRate) {
        super(empName, empNumber, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public ProductionWorker() {
        this("John","123ASD",LocalDate.now(), 1,9.00);
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift){
        if(shift != 2 && shift != 1){
            throw new IllegalArgumentException("Invalid shift, choose only between 1 or 2!");
        } else this.shift = shift;
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
