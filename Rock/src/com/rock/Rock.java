package com.rock;

public class Rock {
    private String rockDescription;
    private int numberOfSamples;
    private int weight;

    public Rock(int numberOfSamples, int weight) {
        this.rockDescription = "Unclassified";
        this.numberOfSamples = numberOfSamples;
        this.weight = weight;
    }

    public String getRockDescription() {
        return rockDescription;
    }

    public int getNumberOfSamples() {
        return numberOfSamples;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Rock{" +
                "numberOfSamples=" + numberOfSamples +
                ", weight=" + weight +
                '}';
    }
}
