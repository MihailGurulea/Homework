import java.util.Scanner;

public class Lease {
    private String name;
    private int number;
    private int rent;
    private int term;

    public Lease() {
        this.name = "XXX";
        this.number = 0;
        this.rent = 1000;
        this.term = 12;
    }

    public void showValues(){
        System.out.println("Name of the apartment: " + getName());
        System.out.println("Number of the apartment: " + getNumber());
        System.out.println("Rent of the apartment: " + getRent());
        System.out.println("Terms of the rent: " + getTerm() + "\n");

    }

    public void addPetFee(){
        rent += 10;
        explainPetPolicy();
    }
    private static void explainPetPolicy(){
        System.out.println("If you have a pet, the rent will increase by 10$ per month!");
    }

    public void getData(){
        Scanner s = new Scanner(System.in);

        System.out.println("Input the name: ");
        setName(s.nextLine());
        System.out.println("Input the number: ");
        setNumber(s.nextInt());
        System.out.println("Input the rent: ");
        setRent(s.nextInt());
        System.out.println("Input the terms: ");
        setTerm(s.nextInt());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
