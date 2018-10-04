public class MorseEncoder {
    public static void morseEncoder(String input){
        input = input.toLowerCase();
        char[] arrayOfChars = input.toCharArray();
        String returnArrayOfChars = "";

        for(int i = 0; i < arrayOfChars.length; i++){
            switch(arrayOfChars[i]){
                case 'a': returnArrayOfChars += ".- "; break;
                case 'b': returnArrayOfChars += "-... "; break;
                case 'c': returnArrayOfChars += "-.-. "; break;
                case 'd': returnArrayOfChars += "-.. "; break;
                case 'e': returnArrayOfChars += ". "; break;
                case 'f': returnArrayOfChars +=  "..-. "; break;
                case 'g': returnArrayOfChars +=  "--. "; break;
                case 'h': returnArrayOfChars +=  ".... "; break;
                case 'i': returnArrayOfChars +=  ".. "; break;
                case 'j': returnArrayOfChars +=  ".--- "; break;
                case 'k': returnArrayOfChars +=  "-.- "; break;
                case 'l': returnArrayOfChars +=  ".-.. "; break;
                case 'm': returnArrayOfChars +=  "-- "; break;
                case 'n': returnArrayOfChars +=  "-. "; break;
                case 'o': returnArrayOfChars +=  "--- "; break;
                case 'p': returnArrayOfChars +=  ".--. "; break;
                case 'q': returnArrayOfChars +=  "--.- "; break;
                case 'r': returnArrayOfChars +=  ".-. "; break;
                case 's': returnArrayOfChars +=  "... "; break;
                case 't': returnArrayOfChars +=  "- "; break;
                case 'u': returnArrayOfChars +=  "..- "; break;
                case 'v': returnArrayOfChars +=  "...- "; break;
                case 'w': returnArrayOfChars +=  ".-- "; break;
                case 'x': returnArrayOfChars +=  "-..- "; break;
                case 'y': returnArrayOfChars +=  "-.-- "; break;
                case 'z': returnArrayOfChars +=  "--.. "; break;
                case '1': returnArrayOfChars +=  ".---- "; break;
                case '2': returnArrayOfChars +=  "..--- "; break;
                case '3': returnArrayOfChars +=  "...-- "; break;
                case '4': returnArrayOfChars +=  "....- "; break;
                case '5': returnArrayOfChars +=  "..... "; break;
                case '6': returnArrayOfChars +=  "-.... "; break;
                case '7': returnArrayOfChars +=  "--... "; break;
                case '8': returnArrayOfChars +=  "---.. "; break;
                case '9': returnArrayOfChars +=  "----. "; break;
                case '0': returnArrayOfChars +=  "----- "; break;
                case ' ': returnArrayOfChars += "   "; break;
                default: returnArrayOfChars += arrayOfChars[i];
            }
        }
        System.out.println("The encoded string: " + returnArrayOfChars);
    }
    public static void morseDecoder(String input){
        input = input.toLowerCase();
        String [] arrayOfWords = input.split("   ");
        String returnArrayOfChars = "";
        for(int i = 0; i < arrayOfWords.length; i++) {
            String [] arrayOfChars = arrayOfWords[i].split(" ");
            for (int j = 0; j < arrayOfChars.length; j++) {
                switch (arrayOfChars[j]) {
                    case ".-":
                        returnArrayOfChars += "a";
                        break;
                    case "-...":
                        returnArrayOfChars += "b";
                        break;
                    case "-.-.":
                        returnArrayOfChars += "c";
                        break;
                    case "-..":
                        returnArrayOfChars += "d";
                        break;
                    case ".":
                        returnArrayOfChars += "e";
                        break;
                    case "..-.":
                        returnArrayOfChars += "f";
                        break;
                    case "--.":
                        returnArrayOfChars += "g";
                        break;
                    case "....":
                        returnArrayOfChars += "h";
                        break;
                    case "..":
                        returnArrayOfChars += "i";
                        break;
                    case ".---":
                        returnArrayOfChars += "j";
                        break;
                    case "-.-":
                        returnArrayOfChars += "k";
                        break;
                    case ".-..":
                        returnArrayOfChars += "l";
                        break;
                    case "--":
                        returnArrayOfChars += "m";
                        break;
                    case "-.":
                        returnArrayOfChars += "n";
                        break;
                    case "---":
                        returnArrayOfChars += "o";
                        break;
                    case ".--.":
                        returnArrayOfChars += "p";
                        break;
                    case "--.-":
                        returnArrayOfChars += "q";
                        break;
                    case ".-.":
                        returnArrayOfChars += "r";
                        break;
                    case "...":
                        returnArrayOfChars += "s";
                        break;
                    case "-":
                        returnArrayOfChars += "t";
                        break;
                    case "..-":
                        returnArrayOfChars += "u";
                        break;
                    case "...-":
                        returnArrayOfChars += "v";
                        break;
                    case ".--":
                        returnArrayOfChars += "w";
                        break;
                    case "-..-":
                        returnArrayOfChars += "x";
                        break;
                    case "-.--":
                        returnArrayOfChars += "y";
                        break;
                    case "--..":
                        returnArrayOfChars += "z";
                        break;
                    case ".----":
                        returnArrayOfChars += "1";
                        break;
                    case "..---":
                        returnArrayOfChars += "2";
                        break;
                    case "...--":
                        returnArrayOfChars += "3";
                        break;
                    case "....-":
                        returnArrayOfChars += "4";
                        break;
                    case ".....":
                        returnArrayOfChars += "5";
                        break;
                    case "-....":
                        returnArrayOfChars += "6";
                        break;
                    case "--...":
                        returnArrayOfChars += "7";
                        break;
                    case "---..":
                        returnArrayOfChars += "8";
                        break;
                    case "----.":
                        returnArrayOfChars += "9";
                        break;
                    case "-----":
                        returnArrayOfChars += "0";
                        break;
                    default:
                        returnArrayOfChars += "";
                }
            }
            returnArrayOfChars += " ";
        }
        System.out.println("The decoded string: " + returnArrayOfChars);
    }
}
