public class Cylinder extends Circle {
    private double height;

    Cylinder(){
        this(1.0, 1.0, "red");
    }

    Cylinder(double radius){
        this(radius, 1.0, "red");
    }

    Cylinder(double radius, double height){
        this(radius, height, "red");
    }

    Cylinder(double radius, double height, String color){
        setRadius(radius);
        this.height = height;
        setColor(color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return Math.PI * Math.pow(getRadius(), 2) * getHeight();
    }
}
