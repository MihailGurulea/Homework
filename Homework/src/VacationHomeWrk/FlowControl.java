package VacationHomeWrk;

import java.util.Random;
import java.util.Scanner;

public class FlowControl {
    public static void exOne() {
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Input an integer: ");
        i = s.nextInt();
        if (i % 2 == 0) {
            System.out.println(i + " is an Even number!");
        } else {
            System.out.println(i + " is an Odd number!");
        }
    }

    public static void exTwo() {
        int max;
        int min;
        int middle;
        int input;
        Scanner s = new Scanner(System.in);
        System.out.println("Input 3 integers: ");
        input = s.nextInt();
        min = input;
        middle = input;
        max = input;
        input = s.nextInt();
        if (input > max) {
            max = input;
        }
        if (input < min) {
            min = input;
        }
        if (input >= min) {
            middle = input;
        }
        input = s.nextInt();
        if (input > max) {
            max = input;
        }
        if (input < min) {
            min = input;
        }
        if (input >= min && input < max) {
            middle = input;
        }
        System.out.println(min + "  " + middle + "  " + max);
        System.out.println(max + "  " + middle + "  " + min);
    }

    public static void exThree() {
        int minutes;
        int text;
        int data;
        Scanner s = new Scanner(System.in);
        System.out.println("Input the talk minutes you use per month: ");
        minutes = s.nextInt();
        System.out.println("Input the amount of text messages you use per month: ");
        text = s.nextInt();
        System.out.println("Input the amount of data(in Megabytes) you are using per month: ");
        data = s.nextInt();

        if (data >= 2000) {
            System.out.println("I would suggest our tariff plan F at $87/month.");
        } else if (data > 0) {
            System.out.println("I would suggest our tariff plan E at $79/month.");
        } else if (text >= 100) {
            System.out.println("I would suggest our tariff plan D at $70/month.");
        } else if (minutes >= 500 && data == 0) {
            System.out.println("I would suggest our tariff plan C at $61/month.");
        } else if (minutes < 500 && text > 0) {
            System.out.println("I would suggest our tariff plan B at $55/month.");
        } else if (minutes < 500 && text == 0 && data == 0) {
            System.out.println("I would suggest our tariff plan A at $49/month.");
        }
    }

    public static void exFour() {
        Random rand = new Random();
        int a = 1;//rand.nextInt(9);
        int b = 2;//rand.nextInt(9);
        int c = 3;//rand.nextInt(9);
        int input1;
        int input2;
        int input3;
        int award = 0;
        System.out.println("Input 3 numbers between 1 and 9: ");
        Scanner s = new Scanner(System.in);
        input1 = s.nextInt();
        input2 = s.nextInt();
        input3 = s.nextInt();
        if (input1 == a || input1 == b || input1 == c) {
            award += 1;
        }
        if (input2 == a || input2 == b || input2 == c) {
            award += 1;
        }
        if (input3 == a || input3 == b || input3 == c) {
            award += 1;
        }
        if (input1 == a && input2 == b && input3 == c) {
            award = 4;
        }
        switch (award) {
            case 0:
                System.out.println("You choose the following numbers: " + input1 + "  " + input2 + "  " + input3);
                System.out.println("The lottery numbers are: " + a + "  " + b + "  " + c);
                System.out.println("You did not guess anything... ");
                break;
            case 1:
                System.out.println("You choose the following numbers: " + input1 + "  " + input2 + "  " + input3);
                System.out.println("The lottery numbers are: " + a + "  " + b + "  " + c);
                System.out.println("You won: $10");
                break;
            case 2:
                System.out.println("You choose the following numbers: " + input1 + "  " + input2 + "  " + input3);
                System.out.println("The lottery numbers are: " + a + "  " + b + "  " + c);
                System.out.println("You won: $100");
                break;
            case 3:
                System.out.println("You choose the following numbers: " + input1 + "  " + input2 + "  " + input3);
                System.out.println("The lottery numbers are: " + a + "  " + b + "  " + c);
                System.out.println("You won: $1,000");
                break;
            case 4:
                System.out.println("You choose the following numbers: " + input1 + "  " + input2 + "  " + input3);
                System.out.println("The lottery numbers are: " + a + "  " + b + "  " + c);
                System.out.println("You won: $1,000,000");
                break;
        }
    }

    public static void exFive() {
        int input;
        Random choice = new Random();
        Scanner s = new Scanner(System.in);
        int aiInput = choice.nextInt(3) + 1;
        System.out.println("Select: 1 - Rock; 2 - Scissors; 3 - Paper");
        input = s.nextInt();
        if (input == aiInput) {
            System.out.println("It's a tie!");
        } else if (input == 2 && aiInput == 3) {
            System.out.println("You won! I've choose Paper.");
        } else if (input == 1 && aiInput == 2) {
            System.out.println("You won! I've choose Scissors.");
        } else if (input == 3 && aiInput == 1) {
            System.out.println("You won! I've choose Rock.");
        } else {
            System.out.println("You lost! I've choose: " + aiInput);
        }
    }

    public static void exSix() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == j) {
                    System.out.print("O");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void exSeven() {
        double mex = 121;
        double us = 315;
        int i;
        for (i = 1; mex < us; i++) {
            System.out.println(i + " year(s):");
            mex *= 1.0101;
            System.out.printf("Population of Mexico: %.2f mln.\n", mex);
            us *= 0.9985;
            System.out.printf("Population of US: %.2f mln.\n", us);
        }
    }

    public static void exEight() {
        int art;
        int bob;
        int cal;
        int dan;
        int eli;
        Scanner s = new Scanner(System.in);
        System.out.println("Input Art's scores: ");
        art = s.nextInt();
        System.out.println("Input Bob's scores: ");
        bob = s.nextInt();
        System.out.println("Input Cal's scores: ");
        cal = s.nextInt();
        System.out.println("Input Dan's scores: ");
        dan = s.nextInt();
        System.out.println("Input Eli's scores: ");
        eli = s.nextInt();

        System.out.println("    Points for game:\n");
        System.out.print("Art   ");
        for (int i = 0; i < art; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Bob   ");
        for (int i = 0; i < bob; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Cal   ");
        for (int i = 0; i < cal; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Dan   ");
        for (int i = 0; i < dan; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Eli   ");
        for (int i = 0; i < eli; i++) {
            System.out.print("*");
        }


    }

    public static void exNine() {
        int player;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (sum < 21) {
            int n = random.nextInt(3) + 1;
            System.out.println("Input a number between 1 and 3: ");
            player = scanner.nextInt();
            if (player < 1 || player > 3) {
                continue;
            }
            sum += player;
            if (sum == 21) {
                System.out.println("You won, the result is: 21");
            }
            if (sum <= 14) {
                sum += n;
            } else if (sum == 15) {
                sum += 2;
            } else if (sum == 16) {
                sum += 1;
            } else if (sum == 17) {
                sum += n;
            } else if (sum == 18) {
                System.out.println("You lost, the sum was 18, I've added 3 and the result is: 21");
                break;
            } else if (sum == 19) {
                System.out.println("You lost, the sum was 19, I've added 2 and the result is: 21");
                break;
            } else if (sum == 20) {
                System.out.println("You lost, the sum was 20, I've added 1 and the result is: 21");
                break;
            }

        }
    }
}
