package IonExercises;

public class Palindrome {
    public static boolean palindromeChecker(String string){
        char [] charPhrase = string.toCharArray();
        int i = 0;
        int j = charPhrase.length - 1;

        while(j > i){
            if(charPhrase[i] != charPhrase[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void palindrome(String string){
        if(palindromeChecker(string)){
            System.out.println("The phrase you provided is a palindrome!");
        } else System.out.println("The phrase you provided is NOT a palindrome!");

    }
}
