package VacationHomeWrk;

import java.util.ArrayList;
import java.util.Scanner;

public class DataTypes {
    char firstName = 'M';
    char lastName = 'G';
    char middleName = 'M';

    public void exOne() {
        System.out.println(lastName + "." + firstName + "." + middleName);
    }

    public static void exTwo() {
        int numberOfEggs;
        int dozen;
        int loose;
        double dozenPrice = 3.25;
        double loosePrice = 0.45;
        double total;
        Scanner s = new Scanner(System.in);
        System.out.println("Input the amount of eggs you want to purchase: ");
        numberOfEggs = s.nextInt();
        dozen = numberOfEggs / 12;
        loose = numberOfEggs - dozen * 12;
        total = dozen * dozenPrice + loose * loosePrice;
        System.out.println("You ordered " + numberOfEggs + " eggs. That’s " + dozen + " dozen at $3.25 per dozen and " + loose + " loose eggs at 45 cents each for a total of $" + total + ".");
    }

    public static void exThree() {
        int adultPrice = 7;
        int adultMeal;
        int childPrice = 4;
        int childMeal;
        int total;
        System.out.println("Input the amount of Adult meals that have been ordered: ");
        Scanner s = new Scanner(System.in);
        adultMeal = s.nextInt();
        System.out.println("Input the amount of Child meals that have been ordered: ");
        Scanner s2 = new Scanner(System.in);
        childMeal = s2.nextInt();
        System.out.println("The total for the Adult meals sold is: $" + (adultMeal * adultPrice));
        System.out.println("The total for the Child meals sold is: $" + (childMeal * childPrice));
        total = adultMeal * adultPrice + childMeal * childPrice;
        System.out.println("The total amount collected for all meals is: $" + total);
    }

    public static void exFour() {
        int twenies = 0;
        int tens = 0;
        int fives = 0;
        int ones = 0;
        int amount;
        Scanner s = new Scanner(System.in);
        System.out.print("Input the amount: $");
        amount = s.nextInt();

        if (amount >= 20) {
            twenies = amount / 20;
        }
        if ((amount - twenies * 20) >= 10) {
            tens = (amount - twenies * 20) / 10;
        }
        if ((amount - twenies * 20) - (tens * 10) >= 5) {
            fives = ((amount - twenies * 20) - (tens * 10)) / 5;
        }
        if ((amount - twenies * 20) - (tens * 10) - (fives * 5) >= 1) {
            ones = (amount - twenies * 20) - (tens * 10) - (fives * 5);
        }
        System.out.println(twenies + " 20s.");
        System.out.println(tens + " 10s.");
        System.out.println(fives + " 5s.");
        System.out.println(ones + " 1s.");
    }

    public static void exFive() {
        double minutes;
        double hours;
        double days;

        Scanner s = new Scanner(System.in);
        System.out.println("Input the number of minutes: ");
        minutes = s.nextInt();
        hours = minutes / 60;
        days = minutes / 1440;
        System.out.println(minutes + " minutes is equal: ");
        System.out.printf("%.3f hours and %.3f days!", hours, days);
    }

    public static void exSix() {
        String i = "go";
        ArrayList<String> array = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Input from 4 to 5 words: ");

        while ( i != "stop"){
            i = s.nextLine();
            array.add(i);
        }
        for (String j : array){
            System.out.println(j);
        }
    }
}
