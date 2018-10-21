package com.evil.emisions;

public class Building implements CarbonFootprint{
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Building(String description) {
        this.description = description;
    }

    @Override
    public void getCarbonFootprint() {
        System.out.println(description);
    }
}
