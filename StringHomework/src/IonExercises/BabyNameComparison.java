package IonExercises;

import java.util.Scanner;

public class BabyNameComparison {
    public static void nameComparison(){
        String firstName;
        String secondName;
        String thirdName;
        Scanner s = new Scanner(System.in);

        System.out.println("Please input the first name: ");
        firstName = s.nextLine();

        System.out.println("Please input the second name: ");
        secondName = s.nextLine();

        System.out.println("Please input the third name: ");
        thirdName = s.nextLine();

        System.out.println("These are the possible combinations: ");
        System.out.println(firstName + "-" + secondName);
        System.out.println(firstName + "-" + thirdName);
        System.out.println(secondName + "-" + thirdName);
        System.out.println(secondName + "-" + firstName);
        System.out.println(thirdName + "-" + firstName);
        System.out.println(thirdName + "-" + secondName);


    }
}
