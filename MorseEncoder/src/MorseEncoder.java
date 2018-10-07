public class MorseEncoder {
    public static void morseEncoder(String input){
        input = input.toLowerCase();
        char[] arrayOfChars = input.toCharArray();
        String returnArrayOfChars = "";

        for (char c : arrayOfChars) {
            switch (c) {
                case 'a':
                    returnArrayOfChars += ".- ";
                    break;
                case 'b':
                    returnArrayOfChars += "-... ";
                    break;
                case 'c':
                    returnArrayOfChars += "-.-. ";
                    break;
                case 'd':
                    returnArrayOfChars += "-.. ";
                    break;
                case 'e':
                    returnArrayOfChars += ". ";
                    break;
                case 'f':
                    returnArrayOfChars += "..-. ";
                    break;
                case 'g':
                    returnArrayOfChars += "--. ";
                    break;
                case 'h':
                    returnArrayOfChars += ".... ";
                    break;
                case 'i':
                    returnArrayOfChars += ".. ";
                    break;
                case 'j':
                    returnArrayOfChars += ".--- ";
                    break;
                case 'k':
                    returnArrayOfChars += "-.- ";
                    break;
                case 'l':
                    returnArrayOfChars += ".-.. ";
                    break;
                case 'm':
                    returnArrayOfChars += "-- ";
                    break;
                case 'n':
                    returnArrayOfChars += "-. ";
                    break;
                case 'o':
                    returnArrayOfChars += "--- ";
                    break;
                case 'p':
                    returnArrayOfChars += ".--. ";
                    break;
                case 'q':
                    returnArrayOfChars += "--.- ";
                    break;
                case 'r':
                    returnArrayOfChars += ".-. ";
                    break;
                case 's':
                    returnArrayOfChars += "... ";
                    break;
                case 't':
                    returnArrayOfChars += "- ";
                    break;
                case 'u':
                    returnArrayOfChars += "..- ";
                    break;
                case 'v':
                    returnArrayOfChars += "...- ";
                    break;
                case 'w':
                    returnArrayOfChars += ".-- ";
                    break;
                case 'x':
                    returnArrayOfChars += "-..- ";
                    break;
                case 'y':
                    returnArrayOfChars += "-.-- ";
                    break;
                case 'z':
                    returnArrayOfChars += "--.. ";
                    break;
                case '1':
                    returnArrayOfChars += ".---- ";
                    break;
                case '2':
                    returnArrayOfChars += "..--- ";
                    break;
                case '3':
                    returnArrayOfChars += "...-- ";
                    break;
                case '4':
                    returnArrayOfChars += "....- ";
                    break;
                case '5':
                    returnArrayOfChars += "..... ";
                    break;
                case '6':
                    returnArrayOfChars += "-.... ";
                    break;
                case '7':
                    returnArrayOfChars += "--... ";
                    break;
                case '8':
                    returnArrayOfChars += "---.. ";
                    break;
                case '9':
                    returnArrayOfChars += "----. ";
                    break;
                case '0':
                    returnArrayOfChars += "----- ";
                    break;
                case ' ':
                    returnArrayOfChars += "   ";
                    break;
                default:
                    returnArrayOfChars += c;
            }
        }
        System.out.println("The encoded string: " + returnArrayOfChars);
    }
    public static void morseDecoder(String input){
        input = input.toLowerCase();
        String [] arrayOfWords = input.split("   ");
        StringBuilder returnArrayOfChars = new StringBuilder();
        for (String word : arrayOfWords) {
            String[] arrayOfChars = word.split(" ");
            for (int j = 0; j < arrayOfChars.length; j++) {
                switch (arrayOfChars[j]) {
                    case ".-":
                        returnArrayOfChars.append("a");
                        break;
                    case "-...":
                        returnArrayOfChars.append("b");
                        break;
                    case "-.-.":
                        returnArrayOfChars.append("c");
                        break;
                    case "-..":
                        returnArrayOfChars.append("d");
                        break;
                    case ".":
                        returnArrayOfChars.append("e");
                        break;
                    case "..-.":
                        returnArrayOfChars.append("f");
                        break;
                    case "--.":
                        returnArrayOfChars.append("g");
                        break;
                    case "....":
                        returnArrayOfChars.append("h");
                        break;
                    case "..":
                        returnArrayOfChars.append("i");
                        break;
                    case ".---":
                        returnArrayOfChars.append("j");
                        break;
                    case "-.-":
                        returnArrayOfChars.append("k");
                        break;
                    case ".-..":
                        returnArrayOfChars.append("l");
                        break;
                    case "--":
                        returnArrayOfChars.append("m");
                        break;
                    case "-.":
                        returnArrayOfChars.append("n");
                        break;
                    case "---":
                        returnArrayOfChars.append("o");
                        break;
                    case ".--.":
                        returnArrayOfChars.append("p");
                        break;
                    case "--.-":
                        returnArrayOfChars.append("q");
                        break;
                    case ".-.":
                        returnArrayOfChars.append("r");
                        break;
                    case "...":
                        returnArrayOfChars.append("s");
                        break;
                    case "-":
                        returnArrayOfChars.append("t");
                        break;
                    case "..-":
                        returnArrayOfChars.append("u");
                        break;
                    case "...-":
                        returnArrayOfChars.append("v");
                        break;
                    case ".--":
                        returnArrayOfChars.append("w");
                        break;
                    case "-..-":
                        returnArrayOfChars.append("x");
                        break;
                    case "-.--":
                        returnArrayOfChars.append("y");
                        break;
                    case "--..":
                        returnArrayOfChars.append("z");
                        break;
                    case ".----":
                        returnArrayOfChars.append("1");
                        break;
                    case "..---":
                        returnArrayOfChars.append("2");
                        break;
                    case "...--":
                        returnArrayOfChars.append("3");
                        break;
                    case "....-":
                        returnArrayOfChars.append("4");
                        break;
                    case ".....":
                        returnArrayOfChars.append("5");
                        break;
                    case "-....":
                        returnArrayOfChars.append("6");
                        break;
                    case "--...":
                        returnArrayOfChars.append("7");
                        break;
                    case "---..":
                        returnArrayOfChars.append("8");
                        break;
                    case "----.":
                        returnArrayOfChars.append("9");
                        break;
                    case "-----":
                        returnArrayOfChars.append("0");
                        break;
                    default:
                        returnArrayOfChars.append("");
                }
            }
            returnArrayOfChars.append(" ");
        }
        System.out.println("The decoded string: " + returnArrayOfChars);
    }
}
