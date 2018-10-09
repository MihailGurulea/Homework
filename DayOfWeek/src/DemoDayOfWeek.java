import java.util.Scanner;

public class DemoDayOfWeek {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DayOfWeek d = new DayOfWeek();

        for(String day : d.getWeekDays()){
            System.out.println(day);
        }

        for(String day : d.getWeekEnds()){
            System.out.println(day);
        }

        System.out.println("Input a day of the week to check the working hours: ");
        d.workingHours(s.nextLine());
    }
}
