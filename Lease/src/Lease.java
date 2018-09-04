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

    public static void main(String[] args) {

    }

}
