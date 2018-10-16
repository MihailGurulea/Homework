package com.horse;

public class RaceHorse extends Horse {
    private int numberOfRaces;

    RaceHorse(String name, String color, int birthYear, int numberOfRaces) {
        super(name, color, birthYear);
        this.numberOfRaces = numberOfRaces;
    }

    public int getNumberOfRaces() {
        return numberOfRaces;
    }

    public void setNumberOfRaces(int numberOfRaces) {
        this.numberOfRaces = numberOfRaces;
    }

    @Override
    public String toString() {
        return "RaceHorse{" + super.toString() +
                "numberOfRaces=" + numberOfRaces +
                '}';
    }
}
