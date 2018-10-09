import java.util.Scanner;

public class DemoDayOfWeek {
    public static void main(String[] args) {
        DayOfWeek day = new DayOfWeek();
        Scanner s = new Scanner(System.in);

        for(String anyDay : day.getArr()){
            System.out.println(anyDay);
        }
        System.out.println("Input a week day: ");
        String str = s.nextLine();
        day.inputDay(str);
    }
}
