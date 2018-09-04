import java.util.Scanner;

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        Scanner s = new Scanner(System.in);
        System.out.println("Input the month: ");
        date.setMonth(s.nextInt());
        System.out.println("Input the day: ");
        date.setDay(s.nextInt());
        System.out.println("Input the year: ");
        date.setYear(s.nextInt());

        date.showDate();


    }
}
