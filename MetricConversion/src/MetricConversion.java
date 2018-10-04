class MetricConversion {

    MetricConversion() {
    }

    private static boolean isPartOf(String string, String [] array){
        for(int i = 0; i < array.length; i++){
            if(string.equals(array[i])){
                return true;
            }
        }
        return false;
    }

    void metricConversion(String input) {
        String[] length = {"kilometers", "meters", "centimeters", "inches", "feet", "yards", "miles"};
        String[] mass = {"kilograms", "grams", "milligrams", "ounces", "pounds", "ton"};
        String[] volume = {"liters", "gallons", "quads", "pints"};
        String[] arrayOfParsedInput = input.split(" ");
        String amount = "";
        arrayOfParsedInput[6] = arrayOfParsedInput[6].substring(0,arrayOfParsedInput[6].length()-1);
        char[] arrayOfDigits = input.toCharArray();

        for (int i = 0; i < arrayOfDigits.length; i++) {
            if(Character.isDigit(arrayOfDigits[i])) {
                amount += arrayOfDigits[i];
            }
        }
        double intAmount = Integer.parseInt(amount);

        if (MetricConversion.isPartOf(arrayOfParsedInput[2],length) && MetricConversion.isPartOf(arrayOfParsedInput[6],length)){
            if(arrayOfParsedInput[2].equals(length[1]) && arrayOfParsedInput[6].equals(length[0])){
                System.out.println(amount + " kilometers equals " + intAmount * 1000 + " meters!");
            }
        } else if (MetricConversion.isPartOf(arrayOfParsedInput[2],mass) && MetricConversion.isPartOf(arrayOfParsedInput[6],mass)){
            if(arrayOfParsedInput[2].equals(mass[0]) && arrayOfParsedInput[6].equals(mass[1])){
                System.out.println(amount + " grams equals " + intAmount / 1000 + " kilograms!");
            }
        } else if (MetricConversion.isPartOf(arrayOfParsedInput[2],volume) && MetricConversion.isPartOf(arrayOfParsedInput[6],volume)){
            if(arrayOfParsedInput[2].equals(volume[0]) && arrayOfParsedInput[6].equals(volume[1])){
                System.out.println(amount + " gallons equals " + intAmount * 3.7854 + " liters!");
            }
        } else System.out.println("You are trying to compare some incomparable types of measurements!");
    }
}
