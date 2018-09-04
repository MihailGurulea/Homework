public class NumbersDemo {
    public static void main(String args[]){
        int number1 = 55;
        int number2 = 77;

        displayTwiceTheNumber(number1, number2);
        displayNumberPlusFive(number1, number2);
        displayNumberSquared(number1, number2);
    }

    public static void displayTwiceTheNumber(int a, int b){
        System.out.println("The first number: " + a + " " + a*2);
        System.out.println("The second number: " + b + " " + b*2 + "\n");
    }

    public static void displayNumberPlusFive(int a, int b){
        System.out.println("The first number: " + a + " " + (a+5));
        System.out.println("The second number: " + b + " " + (b+5) + "\n");
    }

    public static void displayNumberSquared(int a, int b){
        System.out.println("The first number: " + a + " " + a*a);
        System.out.println("The second number: " + b + " " + b*b + "\n");
    }
}
