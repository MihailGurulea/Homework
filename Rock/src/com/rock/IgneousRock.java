package com.rock;

public class IgneousRock extends Rock {
    private String description;

    public IgneousRock(int numberOfSamples, int weight) {
        super(numberOfSamples, weight);
        this.description = "Nice Rock Type!";
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "IgneousRock{" + super.toString() +
                "description='" + description + '\'' +
                '}';
    }
}
