package Group;

import java.util.Scanner;

public class EvenEntryLoop {
    public static void Number() {
        Scanner s = new Scanner(System.in);
        int input = 0;
        outer:
        while (input != 999) {
            System.out.println("Input a even number: ");
            input = s.nextInt();
            if (input % 2 == 0) {
                System.out.println("Good job!!!");
                continue outer;
            } else {
                continue outer;
            }
        }
    }
}
