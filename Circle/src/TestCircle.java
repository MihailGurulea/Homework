public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7);
        Circle circle3 = new Circle();

        //circle1.setRadius(5);
        //circle2.setRadius(7);

        circle1.printObject(circle1);
        circle2.printObject(circle2);
        circle3.printObject(circle3);

    }
}
