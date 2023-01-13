package com.java.learning.basics.graphics;

public class Cylinder implements Body {

    final double radius;

    final double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
