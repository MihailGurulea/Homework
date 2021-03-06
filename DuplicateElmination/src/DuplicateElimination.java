import java.util.Scanner;

public class DuplicateElimination {
    private static boolean isNotPresent(int input, int[] array) {
        for (int anArray : array) {
            if (anArray == input) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] intArray = new int[5];
        Scanner s = new Scanner(System.in);
        int counter = 0;
        int temp;

        while (intArray[4] == 0) {
            System.out.println("Please input a number between 10 and 100: ");
            temp = s.nextInt();
            if (temp > 10 && temp <= 100) {
                if (DuplicateElimination.isNotPresent(temp, intArray)) {
                    intArray[counter] = temp;
                    counter++;
                }
                if (counter < intArray.length) {
                    for (int anIntArray : intArray) {
                        if (anIntArray != 0) {
                            System.out.println(anIntArray);
                        }
                    }
                }
            } else {
                System.out.println("Your number is out of range 10-100!");
                continue;
            }
        }
        for(int i : intArray){
            System.out.println(i);
        }
    }
}
