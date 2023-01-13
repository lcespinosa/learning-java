package com.java.learning.basics.graphics;

public class Sphere implements Body, Shape {
    final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return 4.0 / 3.0 * Math.PI * radius * radius * radius;
    }

    @Override
    public double area() {
        return 4.0 * Math.PI * radius * radius;
    }
}
