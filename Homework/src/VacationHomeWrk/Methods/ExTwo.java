package VacationHomeWrk.Methods;

import java.util.Scanner;

public class ExTwo {
    public static void exTwo(){
        String name;
        double grade;
        Scanner s = new Scanner(System.in);
        System.out.println("Input the name of the student: ");
        name = s.nextLine();
        System.out.println("Input the GPA: ");
        grade = s.nextDouble();
        ExTwo.bonusCredit(name, grade);
    }
    private static void bonusCredit(String name, double gpa){
        System.out.println("Student: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println("Bookstore credit: $" + gpa*10);
    }
}
