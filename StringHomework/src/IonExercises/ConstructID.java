package IonExercises;

public class ConstructID {
    public static void construct(String string){
        char [] charString = string.toCharArray();
        String finalString = "";
        for(int i = 0; i < charString.length; i++){
            if(Character.isUpperCase(charString[i])){
                finalString += charString[i];
            } else if(Character.isDigit(charString[i])){
                finalString +=charString[i];
            }
        }
        System.out.println("Your ID is: " + finalString.substring(0,finalString.length()-1) );
    }
}
