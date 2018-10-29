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

        CourseGrades grades = new CourseGrades(labScore, passFailScore, essayScore, finalExamScore);

        System.out.println(grades.toString());

        System.out.println("----------------------");

        System.out.println("The average score is: " + grades.getAverage());
        System.out.println("The Highest score is: " + grades.getHighest().toString());
        System.out.println("The Lowest score is: " + grades.getLowest().toString());

    }
}
