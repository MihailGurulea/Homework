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
        char first;
        char second;
        char third;

        if (PigLatin.isConsonant(newPassword[0]) && PigLatin.isConsonant(newPassword[1]) && PigLatin.isConsonant(newPassword[2])) {
            first = newPassword[0];
            second = newPassword[1];
            third = newPassword[2];
            latinWord = word.substring(3) + first + second + third + "ay";
        }else if (PigLatin.isConsonant(newPassword[0]) && PigLatin.isConsonant(newPassword[1])) {
            first = newPassword[0];
            second = newPassword[1];
            latinWord = word.substring(2) + first + second + "ay";
        } else if (PigLatin.isConsonant(newPassword[0])) {
            first = newPassword[0];
            latinWord = word.substring(1) + first + "ay";
        }

        if (newPassword[0] == 'y') {
            first = newPassword[0];
            latinWord = word.substring(1) + first + "ay";
        }

        if (PigLatin.isVowel(newPassword[0])) {
            latinWord = word + "ay";
        }

        System.out.println("The latin word is: " + latinWord);
    }
}
