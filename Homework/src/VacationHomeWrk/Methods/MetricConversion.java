package VacationHomeWrk.Methods;

import java.util.Scanner;

public class MetricConversion {
    public static void exThree(){
        Scanner s = new Scanner(System.in);
        System.out.println("Input an Int number: ");
        double input = s.nextInt();
        MetricConversion.inchesToCentimeters(input);
        MetricConversion.litresToGallons(input);
    }
    private static void inchesToCentimeters( double a){
        System.out.printf("%.2f Centimeters equals %.2f inches. \n", a, a*2.54);
    }
    private static void litresToGallons( double a){
        System.out.printf("%.2f Litres equals %.2f Gallons.", a, a/3.7854);
    }
}
