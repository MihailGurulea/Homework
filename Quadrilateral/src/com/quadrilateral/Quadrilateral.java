package com.quadrilateral;

public class Quadrilateral{
    private Point topLeft;
    private Point topRight;
    private Point bottomLeft;
    private Point bottomRight;

    Quadrilateral(Point topLeft, Point topRight, Point bottomLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
