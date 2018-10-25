package com.evil.java.oca.demo;

import com.evil.java.oca.demo.testsandassignments.Essay;
import com.evil.java.oca.demo.testsandassignments.FinalExam;
import com.evil.java.oca.demo.testsandassignments.Lab;
import com.evil.java.oca.demo.testsandassignments.PassFailExam;

public class Demo {
    public static void main(String[] args) {
        Lab labScore = new Lab(75.5);
        PassFailExam passFailScore = new PassFailExam(88.7);
        Essay essayScore = new Essay(55.5);
        FinalExam finalExamScore = new FinalExam(91);

        CourseGrades courseGrades = new CourseGrades(labScore, passFailScore, essayScore, finalExamScore);

        System.out.println(courseGrades.toString());

        System.out.println("----------------------");

        System.out.println("The average score is: " + courseGrades.getAverage());
        System.out.println("The Highest score is: " + courseGrades.getHighest().toString());
        System.out.println("The Lowest score is: " + courseGrades.getLowest().toString());

    }
}
