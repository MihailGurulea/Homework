package VacationHomeWrk;

import java.util.Random;
import java.util.Scanner;

public class FlowControl {
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
