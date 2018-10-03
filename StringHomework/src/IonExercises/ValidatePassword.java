package IonExercises;

import java.util.Scanner;

public class ValidatePassword {
    public static void validate() {
        Scanner s = new Scanner(System.in);
        boolean sentinel = true;

        while (sentinel) {
            int counterOfUpperCases = 0;
            int counterOfLowerCases = 0;
            int counterOfDigits = 0;

            if (counterOfLowerCases < 2 && counterOfUpperCases < 2 && counterOfDigits < 2) {
                System.out.println("Please input a password that contains 2 Uppercase letters," +
                        " 2 Lowercase letters and 2 digits: ");
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
                    counterOfDigits++;
                }
            }

            if (counterOfLowerCases < 2 || counterOfUpperCases < 2 || counterOfDigits < 2){
                System.out.println("Your password contains " + counterOfUpperCases + " uppercase letter(s), "
                        + counterOfLowerCases + " lowercase letter(s) and " + counterOfDigits + " digit(s)!");
            }

            if (counterOfLowerCases >= 2 && counterOfUpperCases >= 2 && counterOfDigits >= 2) {
                System.out.println("The password you've provided is secure!");
                sentinel = false;
            }


        }
    }
}
