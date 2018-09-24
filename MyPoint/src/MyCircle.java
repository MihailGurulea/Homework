public class MyCircle {
    private MyPoint center;
    private int radius;

    MyCircle() {
        this(0, 0, 1);
    }

    MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int centerX) {
        this.center.setX(centerX);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int centerY) {
        this.center.setY(centerY);
    }

    public int [] getCenterXY() {
        int [] a = {center.getX(), center.getY()};
        return a;
    }

    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    public String toString(){
        MyPoint point = new MyPoint(getCenterX(), getCenterY());
        return "MyString[radius=" + getRadius() + ",center=" + point.toString();
    }

    public double getArea(){
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double getCircumference(){
        return 2 * Math.PI * getRadius();
    }

    public double distance(MyCircle anotherCircle){
        MyPoint point = new MyPoint(getCenterX(),getCenterY());
        return point.distance(anotherCircle.getCenterX(), anotherCircle.getCenterY());
    }
}
