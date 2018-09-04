import java.util.Scanner;

public class TestStudent {
    private int idNumber;
    private double numberOfCreditHours;
    private double numberOfPointsEarned;

    public TestStudent() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input the Student ID: ");
        this.idNumber = s.nextInt();
        System.out.println("Input the number of credit hours earned: ");
        this.numberOfCreditHours = s.nextInt();
        System.out.println("Input the number of points earned: ");
        this.numberOfPointsEarned = s.nextInt();
    }

    public int getIdNumber() {
        return idNumber;
    }

    public double getNumberOfCreditHours() {
        return numberOfCreditHours;
    }

    public double getNumberOfPointsEarned() {
        return numberOfPointsEarned;
    }
}
