import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Sandwich newSandwich = new Sandwich();

        System.out.println("Input the Sandwich type: ");
        newSandwich.setSandwichType(s.nextLine());
        System.out.println("Input the Bread type: ");
        newSandwich.setBreadType(s.nextLine());
        System.out.println("Input the Price: ");
        newSandwich.setPrice(s.nextDouble());

        newSandwich.showSandwich();
    }
}

