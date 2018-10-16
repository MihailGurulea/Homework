package com.quadrilateral;

public class Demo {
    public static void main(String[] args) {
        Point topLeft = new Point(2,4);
        Point topRight = new Point(6,4);
        Point bottomLeft = new Point(2,2);
        Point bottomRight = new Point(6,2);

        Square square = new Square(topLeft,topRight,bottomLeft,bottomRight);
        //System.out.println(square.calculateSquareArea());

        Rectangle rectangle = new Rectangle(topLeft,topRight,bottomLeft,bottomRight);
        System.out.println(rectangle.calculateRectangleArea());

    }
}
