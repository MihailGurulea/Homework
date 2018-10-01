package IonExercises;

import java.util.Scanner;

public class ValidatePassword {
    public static void validate() {
        Scanner s = new Scanner(System.in);
        boolean sentinel = true;

        while (sentinel) {
            int counterOfUpperCases = 0;
            int counterOfLowerCases = 0;
            int counterOfNumbers = 0;

            if (counterOfLowerCases < 2 && counterOfUpperCases < 2 && counterOfNumbers < 2) {
                System.out.println("Please input a password that contains 2 Uppercase letters," +
                        " 2 Lowercase letters and 2 numbers: ");
            }

            String password = s.nextLine();
            char[] newPassword = password.toCharArray();

            for (int i = 0; i < newPassword.length; i++) {
                if (Character.isUpperCase(newPassword[i])) {
                    counterOfUpperCases++;
                }

                if (Character.isLowerCase(newPassword[i])) {
                    counterOfLowerCases++;
                }

                if (Character.isDigit(newPassword[i])) {
                    counterOfNumbers++;
                }
            }

            if (counterOfLowerCases >= 2 && counterOfUpperCases >= 2 && counterOfNumbers >= 2) {
                System.out.println("The password you've provided is secure!");
                sentinel = false;
            }


        }
    }
}
