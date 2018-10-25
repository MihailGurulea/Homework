package com.evil.java.oca.demo;

public class Ship {
    private String nameOfTheShip;
    private String constructionYearOfTheShip;

    public Ship(String nameOfTheShip, String constructionYearOfTheShip) {
        this.nameOfTheShip = nameOfTheShip;
        this.constructionYearOfTheShip = constructionYearOfTheShip;
    }

    public String getNameOfTheShip() {
        return nameOfTheShip;
    }

    public void setNameOfTheShip(String nameOfTheShip) {
        this.nameOfTheShip = nameOfTheShip;
    }

    public String getConstructionYearOfTheShip() {
        return constructionYearOfTheShip;
    }

    public void setConstructionYearOfTheShip(String constructionYearOfTheShip) {
        this.constructionYearOfTheShip = constructionYearOfTheShip;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "nameOfTheShip='" + nameOfTheShip + '\'' +
                ", constructionYearOfTheShip='" + constructionYearOfTheShip + '\'' +
                '}';
    }
}
