package com.evil.java.oca.demo;

public class GradedActivity {
    private double score;

    public GradedActivity(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public char getGrade() {
        if (getScore() < 60) {
            return 'F';
        } else if (getScore() >= 60 && getScore() < 70) {
            return 'D';
        } else if (getScore() >= 70 && getScore() < 80) {
            return 'C';
        } else if (getScore() >= 80 && getScore() < 90) {
            return 'B';
        } else return 'A';
    }

    @Override
    public String toString() {
        return "Score= " + score;
    }
}
