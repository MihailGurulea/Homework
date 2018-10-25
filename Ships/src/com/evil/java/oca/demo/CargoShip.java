package com.evil.java.oca.demo;

public class CargoShip extends Ship {
    private int cargoCapacityTons;

    public CargoShip(String nameOfTheShip, String constructionYearOfTheShip, int cargoCapacityTons) {
        super(nameOfTheShip, constructionYearOfTheShip);
        this.cargoCapacityTons = cargoCapacityTons;
    }

    public int getCargoCapacityTons() {
        return cargoCapacityTons;
    }

    public void setCargoCapacityTons(int cargoCapacityTons) {
        this.cargoCapacityTons = cargoCapacityTons;
    }

    @Override
    public String toString() {
        return "CargoShip{" +
                "nameOfTheShip= " + getNameOfTheShip() +
                ", cargoCapacityTons= " + cargoCapacityTons +
                '}';
    }
}
