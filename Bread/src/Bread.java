public class Bread {
    private String breadType;
    private double caloriesPerSlice;
    public final static String MOTTO = "The staff of life";

    public Bread(String breadType, double caloriesPerSlice) {
        this.breadType = breadType;
        this.caloriesPerSlice = caloriesPerSlice;
    }

    public String getBreadType() {
        return breadType;
    }

    public double getCaloriesPerSlice() {
        return caloriesPerSlice;
    }

    public void displayBread() {
        System.out.println("Bread type: " + getBreadType());
        System.out.println("Calories per slice: " + getCaloriesPerSlice());
        System.out.println("Company motto: " + MOTTO + "\n");
    }
}
