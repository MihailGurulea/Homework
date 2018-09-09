public class Circle {
    private double radius;
    private double diameter;
    private double area;

    public Circle() {
        this.radius = 1;
        this.diameter = radius * 2;
        this.area = (Math.PI * (radius * radius));
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.diameter = radius * 2;
        this.area = (Math.PI * (radius * radius));
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

    public void printObject(Circle circle){
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Area: " + circle.getArea() + "\n");
    }
}
