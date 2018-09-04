public class Sandwich {
    private String sandwichType;
    private String breadType;
    private double price;

    public Sandwich() {
        this.sandwichType = "tuna";
        this.breadType = "wheat";
        this.price = 4.99;
    }

    public void setSandwichType(String sandwichType) {
        this.sandwichType = sandwichType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public void showSandwich(){
        System.out.println("Sandwich type: " + sandwichType);
        System.out.println("BreadType: " + breadType);
        System.out.println("Price: " + price);
    }
}
