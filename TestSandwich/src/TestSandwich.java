import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Sandwich newSandwich = new Sandwich();

        newSandwich.setSandwichType(s.nextLine());
        newSandwich.setBreadType(s.nextLine());
        newSandwich.setPrice(s.nextDouble());

        newSandwich.showSandwich();
    }
}

