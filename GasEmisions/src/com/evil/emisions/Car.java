package com.evil.emisions;

public class Car implements CarbonFootprint{
    private String carDescription;

    public String getCarDescription() {
        return carDescription;
    }

    public void setCarDescription(String carDescription) {
        this.carDescription = carDescription;
    }

    public Car(String carDescription) {
        this.carDescription = carDescription;
    }

    @Override
    public void getCarbonFootprint() {
        System.out.println(carDescription);
    }
}
