import java.util.ArrayList;
import java.util.Collections;

class DayOfWeek {
    private String [] days = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY",
            "FRIDAY", "SATURDAY", "SUNDAY"};
    private ArrayList<String> arr = new ArrayList<>();

    ArrayList<String> getArr() {
        return arr;
    }

    {
        Collections.addAll(arr, days);
    }

    void inputDay(String day){
        if(day.equals(arr.get(5))){
            System.out.println("Working hours are 10AM to 6PM!");
        } else if(day.equals(arr.get(6))){
            System.out.println("Working hours are 11AM to 5PM!");
        } else System.out.println("Working hours are 9AM to 9PM!");
    }

}
