package com.evil.emisions;

public class Bicycle implements CarbonFootprint{
    private String bicycleDescription;

    public Bicycle(String bicycleDescription) {
        this.bicycleDescription = bicycleDescription;
    }

    public String getBicycleDescription() {
        return bicycleDescription;
    }

    public void setBicycleDescription(String bicycleDescription) {
        this.bicycleDescription = bicycleDescription;
    }

    @Override
    public void getCarbonFootprint() {
        System.out.println(bicycleDescription);
    }
}
