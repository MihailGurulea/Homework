package com.quadrilateral;

public class Rectangle extends Quadrilateral {
    private Point topLeft;
    private Point topRight;
    private Point bottomLeft;

    public Rectangle(Point topLeft, Point topRight, Point bottomLeft, Point bottomRight) {
        super(topLeft, topRight, bottomLeft, bottomRight);
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
    }

    double calculateRectangleArea(){
        double topLeftToTopRight = Math.sqrt(Math.pow((topLeft.getX() - topRight.getX()),2)
                + Math.pow((topLeft.getY() - topRight.getY()),2));

        double topLeftToBottomLeft = Math.sqrt(Math.pow((topLeft.getX() - bottomLeft.getX()),2)
                + Math.pow((topLeft.getY() - bottomLeft.getY()),2));

        return topLeftToBottomLeft * topLeftToTopRight;
    }
}
