import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        BloodData data1 = new BloodData();
        System.out.println("Blood type is: " + data1.getBloodType());
        System.out.println("Rh factor is: " + data1.getRhFactor());

        Scanner s = new Scanner(System.in);
        System.out.println("Input the Blood Type: ");
        String bloodType = s.nextLine();
        System.out.println("Input the Rh Factor: ");
        String rhFactor = s.nextLine();
        BloodData data2 = new BloodData(bloodType,rhFactor);
        System.out.println("Blood type is: " + data2.getBloodType());
        System.out.println("Rh factor is: " + data2.getRhFactor());
    }
}
