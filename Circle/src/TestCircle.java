public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();

        circle1.setRadius(5);
        circle2.setRadius(7);

        circle1.printObject(circle1);
        circle2.printObject(circle2);
        circle3.printObject(circle3);

    }
}
