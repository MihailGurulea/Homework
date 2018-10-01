package AlinaExercises;

public class ReplaceFromIndex {
    public static String replaceCharFromIndex(String stringToBeModified,
                                              char toBeReplaced, char replace, int index) {
        char [] newChar = stringToBeModified.toCharArray();
        for(int i = index; i < newChar.length; i++){
            if(toBeReplaced == newChar[i]){
                newChar[i] = replace;
            }
        }
        return new String(newChar);
    }
}
