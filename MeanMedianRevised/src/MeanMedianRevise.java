import java.util.ArrayList;
import java.util.Scanner;

public class MeanMedianRevise {
    public static void main(String[] args) {

        ArrayList <Integer> arrOfNumbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Please provide up to 20 integers: ");
        double total = 0;
        int tempForSorting;

        for(int counter = 0; counter < 19; counter++ ){
            int temp;
            temp = s.nextInt();
            if(temp == 999){
                break;
            }
            arrOfNumbers.add(temp);
            total += temp;
        }

        for (int i = 1; i < arrOfNumbers.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (arrOfNumbers.get(j) < arrOfNumbers.get(j - 1)) {
                    tempForSorting = arrOfNumbers.get(j);
                    arrOfNumbers.set(j, arrOfNumbers.get(j - 1));
                    arrOfNumbers.set(j - 1,tempForSorting);
                }
            }
        }

        System.out.println("The mean of the array is: " + total / arrOfNumbers.size());
        double median = 0.0;
        int half = (arrOfNumbers.size() / 2) - 1;
        if(arrOfNumbers.size() % 2 == 0) {
            median = (arrOfNumbers.get(half) + (double)(arrOfNumbers.get(half + 1)) / 2);
        } else {
            median = arrOfNumbers.get(half + 1);
        }
                    System.out.println("The median of the array is: " + median);

    }
}
