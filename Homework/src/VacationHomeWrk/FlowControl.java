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

    public static void exFour(){
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
        if (input1 == a || input1 == b || input1 == c){
            award += 1;
        }
        if (input2 == a || input2 == b || input2 == c){
            award += 1;
        }
        if (input3 == a || input3 == b || input3 == c){
            award += 1;
        }
        if(input1 == a && input2 == b && input3 == c){
            award = 4;
        }
        switch (award){
            case 0:
                System.out.println("You choose the following numbers: " +input1+"  "+input2+"  "+input3);
                System.out.println("The lottery numbers are: "+a+"  "+b+"  "+c);
                System.out.println("You did not guess anything... "); break;
            case 1:
                System.out.println("You choose the following numbers: " +input1+"  "+input2+"  "+input3);
                System.out.println("The lottery numbers are: "+a+"  "+b+"  "+c);
                System.out.println("You won: $10"); break;
            case 2:
                System.out.println("You choose the following numbers: " +input1+"  "+input2+"  "+input3);
                System.out.println("The lottery numbers are: "+a+"  "+b+"  "+c);
                System.out.println("You won: $100"); break;
            case 3:
                System.out.println("You choose the following numbers: " +input1+"  "+input2+"  "+input3);
                System.out.println("The lottery numbers are: "+a+"  "+b+"  "+c);
                System.out.println("You won: $1,000"); break;
            case 4:
                System.out.println("You choose the following numbers: " +input1+"  "+input2+"  "+input3);
                System.out.println("The lottery numbers are: "+a+"  "+b+"  "+c);
                System.out.println("You won: $1,000,000"); break;
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
                System.out.println("You won, the result is: " + sum);
            }
            if (sum > 21) {
                System.out.println("You lost, the result is: " + sum);
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
