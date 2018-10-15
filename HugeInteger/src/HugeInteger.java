public class HugeInteger {
    private int[] arrayOfInts = new int [40];
    private int universalCounter;

    HugeInteger(String input) {
        this.arrayOfInts = parse(input);
    }

    private int[] parse(String input){
        String[] newArrOfChars = input.split("");
        int counter = newArrOfChars.length - 1;
        int[] result = new int [40];
        this.universalCounter = counter;
        for(int i = arrayOfInts.length - 1; i >= 0 ; i--){
            result[i] = Integer.parseInt(newArrOfChars[counter]);
            if(counter == 0){
                break;
            }
            counter--;
        }
        return result;
    }

    public int[] add(String input){
        boolean plusOne = false;
        int[] temp = parse(input);
        int[] result = new int[40];
        for(int i = this.arrayOfInts.length - 1; i > 0; i--){
            int tempValue = temp[i] + this.arrayOfInts[i];
            if(tempValue > 9){
                if (plusOne) {
                    tempValue += 1;
                }
                plusOne = true;
                result[i] = tempValue - 10;

            } else {
                if (plusOne) {
                    result[i] = tempValue + 1;
                    plusOne = false;
                } else {
                    result[i] = tempValue;
                }
            }
        }
        return result;
    }

    public String toString(){
        String result = "HugeIntegers Array: {";
        for(int i = this.arrayOfInts.length - universalCounter - 1; i < this.arrayOfInts.length ; i++){
            result += this.arrayOfInts[i];
        }
        result += "}";

        return result;
    }

    public String toString1(int[] arr){
        String result = "{";
        for(int i = arr.length - 1 - universalCounter - 1; i < arr.length ; i++){
            result += arr[i];
        }
        result += "}";

        return result;
    }
}
