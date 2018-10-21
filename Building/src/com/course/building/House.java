package com.course.building;

public class House extends Building {
    private int numberOfBedrooms;
    private int numberOfBathrooms;

    public House(double squareFootage, int stories, int numberOfBedrooms, int numberOfBathrooms) {
        super(squareFootage, stories);
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                '}';
    }
}
