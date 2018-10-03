package IonExercises;

import java.util.Scanner;

public class PigLatin {
    public static boolean isVowel(char c) {
        boolean sentinel = false;
        String vowels = "aeiouAEIOU";
        char[] newString = vowels.toCharArray();
        for (int i = 0; i < newString.length; i++) {
            if (newString[i] == c) {
                sentinel = true;
                break;
            }
        }
        return sentinel;
    }

    public static boolean isConsonant(char c) {
        boolean sentinel = false;
        String consonant = "bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ";
        char[] newString = consonant.toCharArray();
        for (int i = 0; i < newString.length; i++) {
            if (newString[i] == c) {
                sentinel = true;
                break;
            }
        }
        return sentinel;
    }

    public static void validate() {
        Scanner s = new Scanner(System.in);
        String latinWord = "";

        System.out.println("Please input a the word: ");

        String word = s.nextLine();
        char[] newPassword = word.toCharArray();
        char firstConsonant;
        char secondConsonant;
        char thirdConsonant;

        if (PigLatin.isConsonant(newPassword[0]) && PigLatin.isConsonant(newPassword[1]) && PigLatin.isConsonant(newPassword[2])) {
            firstConsonant = newPassword[0];
            secondConsonant = newPassword[1];
            thirdConsonant = newPassword[2];
            latinWord = word.substring(3) + firstConsonant + secondConsonant + thirdConsonant + "ay";
        } else if (PigLatin.isConsonant(newPassword[0]) && PigLatin.isConsonant(newPassword[1])) {
            firstConsonant = newPassword[0];
            secondConsonant = newPassword[1];
            latinWord = word.substring(2) + firstConsonant + secondConsonant + "ay";
        } else if (PigLatin.isConsonant(newPassword[0])) {
            firstConsonant = newPassword[0];
            latinWord = word.substring(1) + firstConsonant + "ay";
        }

        if (newPassword[0] == 'y') {
            firstConsonant = newPassword[0];
            latinWord = word.substring(1) + firstConsonant + "ay";
        }

        if (PigLatin.isVowel(newPassword[0])) {
            latinWord = word + "ay";
        }

        System.out.println("The latin word is: " + latinWord);
    }
}
