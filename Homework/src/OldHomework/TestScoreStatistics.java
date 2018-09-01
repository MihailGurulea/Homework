package OldHomework;

import java.util.Scanner;

public class TestScoreStatistics {
    public static void studentScores() {
        Scanner s = new Scanner(System.in);
        int input = 0;
        int min = 99;
        int counter = 0;
        int max = 1;
        double average = 1;
        outer:
        while (input != 999) {
            System.out.println("Input the scores of the students: ");
            input = s.nextInt();
            if (input < 0 || input > 100) {
                System.out.println("Scores should be between 1 and 100, try again: ");
                continue outer;
            }
            counter++;
            average += input;
            if (input > max){max = input;}
            if (input < min){min = input;}
        }
        System.out.println(" Maximum score is: "+max+"\n Lowest score is: "+min+"\n Average score is:"+average/counter+"\n Number of scores inputed = "+counter);
    }
}

