package com.java.learning.basics.graphics;

public class Rectangle implements Shape {
    final double width;
    final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
