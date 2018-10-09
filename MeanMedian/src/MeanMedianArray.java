import java.util.Scanner;

public class MeanMedianArray {
    public static void main(String[] args) {

        int [] arrOfNumbers = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Please provide 5 integers: ");
        double total = 0;
        int tempForSorting = 0;

        for (int i = 0; i < arrOfNumbers.length; i++){
            arrOfNumbers[i] = s.nextInt();
            total += arrOfNumbers[i];
        }

        for (int i = 1; i < arrOfNumbers.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arrOfNumbers[j] < arrOfNumbers[j - 1]) {
                    tempForSorting = arrOfNumbers[j];
                    arrOfNumbers[j] = arrOfNumbers[j - 1];
                    arrOfNumbers[j - 1] = tempForSorting;
                }
            }
        }

        System.out.println("The mean of the array is: " + total / 5);
        System.out.println("The median of the array is: " + arrOfNumbers[2]);
    }
}
