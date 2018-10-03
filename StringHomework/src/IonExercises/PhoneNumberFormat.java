package IonExercises;

import java.util.Scanner;

public class PhoneNumberFormat {
    public static void PhoneFormat(){
        int sentinel = 0;
        Scanner s = new Scanner(System.in);
        while(sentinel != 999){
            System.out.println("Please input a 10 digit phone number: ");
            String newString = s.nextLine();

            if(newString.equals("999")){
                sentinel = 999;
            }

            if(newString.length() > 10){
                System.out.println("Your number contains more than 10 digits!");
                continue;
            }

            if(newString.length() < 10){
                System.out.println("Your number contains less than 10 digits!");
                continue;
            }

            System.out.println("Formated number:" + "(" + newString.substring(0,3) + ")" + " " + newString.substring(3,7) + "-" + newString.substring(7));
        }
    }
}
