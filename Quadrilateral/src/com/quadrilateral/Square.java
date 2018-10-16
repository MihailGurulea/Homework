package com.quadrilateral;

public class Square extends Quadrilateral {
    private Point first;
    private Point second;

    public Point getFirst() {
        return first;
    }

    public Point getSecond() {
        return second;
    }


    Square(Point topLeft, Point topRight, Point bottomLeft, Point bottomRight) {
        super(topLeft, topRight, bottomLeft, bottomRight);
        this.first = topLeft;
        this.second = topRight;
    }

    double calculateSquareArea(){
        double distanceBetweenTwoPoints = Math.sqrt(Math.pow((first.getX() - second.getX()),2)
                + Math.pow((first.getY() - second.getY()),2));
        return Math.pow(distanceBetweenTwoPoints,2);
    }
}
