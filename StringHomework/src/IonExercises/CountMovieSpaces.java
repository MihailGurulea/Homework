package IonExercises;

public class CountMovieSpaces {
    public static void countSpaces(){
        String myString = "I'm going to make him an offer he can't refuse.";
        char [] newString = myString.toCharArray();
        int counter = 0;
        for(int i = 0; i < newString.length; i++){
            if(newString[i] == ' '){
                counter++;
            }
        }
        System.out.println("The movie quote has: " + counter + " spaces in it.");
    }

    public static void countSpaces(String string){
        char [] newString = string.toCharArray();
        int counter = 0;
        for(int i = 0; i < newString.length; i++){
            if(newString[i] == ' '){
                counter++;
            }
        }
        System.out.println("The movie quote has: " + counter + " spaces in it.");
    }

}
