import java.util.Scanner;

public class DemoMajors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Input the desired Major type: ");
        String input = s.nextLine();
        Majors m = new Majors();
        m.majors(input);
    }
}
