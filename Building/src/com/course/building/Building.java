package com.course.building;

public class Building {
    private double squareFootage;
    private int stories;

    public Building(double squareFootage, int stories) {
        this.squareFootage = squareFootage;
        this.stories = stories;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getStories() {
        return stories;
    }

    public void setStories(int stories) {
        this.stories = stories;
    }

    @Override
    public String toString() {
        return  "squareFootage=" + squareFootage +
                ", stories=" + stories + ", ";
    }
}
