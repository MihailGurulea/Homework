package com.javaOCA;


public class Demo {
    public static void main(String[] args) {
        Machine machine = new Machine();
        Athlete athlete = new Athlete();
        PoliticalCandidate politicalCandidate = new PoliticalCandidate();

        machine.run();
        athlete.run();
        politicalCandidate.run();
    }
}
