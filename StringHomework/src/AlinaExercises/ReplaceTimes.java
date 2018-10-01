package AlinaExercises;

public class ReplaceTimes {
    public static String replaceCharTimes(String stringToBeModified,
                                              char toBeReplaced, char replace, int counter) {
        char [] newChar = stringToBeModified.toCharArray();
        int counter2 = 0;
        for(int i = 0; i < newChar.length; i++){
            if(toBeReplaced == newChar[i]){
                newChar[i] = replace;
                counter2++;
                if(counter2 == counter){
                    break;
                }
            }
        }
        return new String(newChar);
    }
}
