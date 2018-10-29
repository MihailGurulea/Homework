package com.evil.java.oca.demo;

import com.evil.java.oca.demo.testsandassignments.Essay;
import com.evil.java.oca.demo.testsandassignments.FinalExam;
import com.evil.java.oca.demo.testsandassignments.Lab;
import com.evil.java.oca.demo.testsandassignments.PassFailExam;

import java.util.Arrays;
import java.util.Comparator;

public class CourseGrades implements Analyzable{
    private GradedActivity[] grades = new GradedActivity[4];

    CourseGrades(Lab lab, PassFailExam passFailExam, Essay essay, FinalExam finalExam) {
        setLab(lab);
        setPassFailExam(passFailExam);
        setEssay(essay);
        setFinalExam(finalExam);
    }

    CourseGrades(){
        grades[0] = new Lab(99);
        grades[1] = new PassFailExam(77);
        grades[2] = new Essay(56);
        grades[3] = new FinalExam(81);
    }

    private void setLab(Lab lab) {
        grades[0] = lab;
    }

    private void setPassFailExam(PassFailExam passFailExam) {
        grades[1] = passFailExam;
    }

    private void setEssay(Essay essay) {
        grades[2] = essay;
    }

    private void setFinalExam(FinalExam finalExam) {
        grades[3] = finalExam;
    }

    @Override
    public String toString() {
        return "--- Course Scores and Grades ---" + "\n" + "Lab: " + grades[0].toString() + ", Grade= " + grades[0].getGrade() + "\n" +
                "Pass/Fail Exam: " + grades[1].toString() + ", Grade= " + grades[1].getGrade() + "\n" +
                "Essay: " + grades[2].toString() + ", Grade= " + grades[2].getGrade() + "\n" +
                "Final Exam: " + grades[3].toString() + ", Grade= " + grades[3].getGrade();
    }


    @Override
    public double getAverage() {
        return (grades[0].getScore() + grades[1].getScore() + grades[2].getScore() + grades[3].getScore()) / 4;
    }

    @Override
    public GradedActivity getHighest() {
        /*GradedActivity tempMax = grades[0];
        for (GradedActivity grade : grades) {
            if (tempMax.getScore() < grade.getScore()) {
                tempMax = grade;
            }
        }
        for(int i = 0; i < grades.length; i++){
//            if(tempMin == grades[i].getScore())
//                returnIndex = i;
//        }
//        return grades[returnIndex];*/
        return Arrays.stream(grades).max(Comparator.comparing(GradedActivity::getScore)).get();
    }

    @Override
    public GradedActivity getLowest() {
//        double tempMin = grades[0].getScore();
//        int returnIndex = 0;
//        for (GradedActivity grade : grades) {
//            if (tempMin > grade.getScore()) {
//                tempMin = grade.getScore();
//            }
//        }
//        for(int i = 0; i < grades.length; i++){
//            if(tempMin == grades[i].getScore())
//                returnIndex = i;
//        }
//        return grades[returnIndex];

        return Arrays.stream(grades).min(Comparator.comparing(GradedActivity::getScore)).get();
    }
}
