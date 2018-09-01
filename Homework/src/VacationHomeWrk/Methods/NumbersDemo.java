package VacationHomeWrk.Methods;

import java.util.Scanner;

public class NumbersDemo {
    public static void exOne() {
        int first;
        int second;
        Scanner s = new Scanner(System.in);

        System.out.println("Input two int numbers: ");
        first = s.nextInt();
        second = s.nextInt();
        NumbersDemo.displayTwiceTheNumber(first);
        NumbersDemo.displayTwiceTheNumber(second);
        NumbersDemo.displayNumberPlusFive(first);
        NumbersDemo.displayNumberPlusFive(second);
        NumbersDemo.displayNumberSquared(first);
        NumbersDemo.displayNumberSquared(second);
    }

    public static void displayTwiceTheNumber(int a) {
        System.out.printf("TwiceTheNumber %d = %d \n", a, a * 2);
    }

    public static void displayNumberPlusFive(int a) {
        System.out.printf("NumberPlusFive %d = %d \n", a, a + 5);
    }

    public static void displayNumberSquared(int a) {
        System.out.printf("NumberSquared %d = %d \n", a, a * a);
    }

}
