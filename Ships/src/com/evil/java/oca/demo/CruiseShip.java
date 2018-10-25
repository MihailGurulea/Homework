package com.evil.java.oca.demo;

public class CruiseShip extends Ship {
    private int maxNumberOfPax;

    public CruiseShip(String nameOfTheShip, String constructionYearOfTheShip, int maxNumberOfPax) {
        super(nameOfTheShip, constructionYearOfTheShip);
        this.maxNumberOfPax = maxNumberOfPax;
    }

    public int getMaxNumberOfPax() {
        return maxNumberOfPax;
    }

    public void setMaxNumberOfPax(int maxNumberOfPax) {
        this.maxNumberOfPax = maxNumberOfPax;
    }

    @Override
    public String toString() {
        return "CruiseShip{" +
                "nameOfTheShip= " + getNameOfTheShip() +
                ", maxNumberOfPax= " + maxNumberOfPax +
                '}';
    }
}
