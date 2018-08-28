package Group;

import java.util.Scanner;

public class Inbetween {
    public static void Integers() {
        Scanner s = new Scanner(System.in);

        int input1;
        int input2;

        System.out.println("Please input 2 integers: ");
        input1 = s.nextInt();
        input2 = s.nextInt();

        while (input1 == input2 || input1 == input2 + 1 || input1 == input2 - 1) {
            System.out.println("There are no Integers between this two numbers!");
            System.out.println("Please input 2 integers: ");
            input1 = s.nextInt();
            input2 = s.nextInt();
        }
        if (input1 < input2) { input1++;
            for (; input1 < input2; input1++) {
                System.out.println(input1);
            }
        } else {input1--;
            for (; input1 > input2; input1--) {
                System.out.println(input1);
             }
        }
    }
}

