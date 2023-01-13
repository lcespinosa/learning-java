package com.java.learning.basics.graphics;

public class Pentagon implements Shape {
    final double base;
    final double height;

    public Pentagon(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 5.0 / 2.0 * base * height;
    }
}
