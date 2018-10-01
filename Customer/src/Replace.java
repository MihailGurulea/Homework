public class Replace {
    public String replaceChar(String str, char newChar, char oldChar){
        char [] newStr = str.toCharArray();

        for (int i = 0; i < newStr.length; i++) {
            if (oldChar == newStr[i]) {
                newStr[i] = newChar;
            }
        }
        return new String(newStr);
    }
}
