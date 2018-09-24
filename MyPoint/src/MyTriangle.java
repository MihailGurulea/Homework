public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return "MyTriangle[v1=" + v1.toString() + ",v2=" + v2.toString() + ",v3=" + v3.toString() + "]";
    }

    public double distance(MyPoint first, MyPoint second) {
        return Math.sqrt(Math.pow((first.getX() - second.getX()), 2) + Math.pow((first.getY() - second.getY()), 2));
    }

    public double getPerimeter() {
        return distance(v1, v2) + distance(v2, v3) + distance(v3, v1);
    }

    public String getType() {
        if (distance(v1, v2) == distance(v2, v3) || distance(v1, v2) == distance(v3, v1) || distance(v3, v1) == distance(v3, v2)){
            return "Isosceles";
        } else if (distance(v1, v2) != distance(v2, v3) && distance(v1, v2) != distance(v3, v1) && distance(v1, v3) != distance(v3, v2)) {
            return "Scalene";
        } else return "Equilateral";
    }
}
