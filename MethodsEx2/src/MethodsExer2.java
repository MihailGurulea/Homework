import java.util.Scanner;

public class MethodsExer2 {
    public static void main(String[] args){
        String name;
        double gpa;

        Scanner s = new Scanner(System.in);

        System.out.println("Input the name of the student: ");
        name = s.nextLine();
        System.out.println("Input the GPA: ");
        gpa = s.nextDouble();

        creditComputer(name, gpa);
    }

    private static void creditComputer(String name, double gpa){
        System.out.println("Student name: " + name);
        System.out.println("The students GPA: " + gpa);
        System.out.println("Amount of credits: $" + (gpa*10));
    }
}
