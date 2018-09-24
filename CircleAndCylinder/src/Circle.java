public class Circle {
    private double radius;
    private String color;

    Circle(){
        this(0.0, "red");
    }

    Circle(double radius){
        this.radius = radius;
        this.color = "red";
    }

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    public String toSring(){
        return "Circle[radius = " + getRadius() + ",color = " + getColor() + "]";
    }
}
