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

}
