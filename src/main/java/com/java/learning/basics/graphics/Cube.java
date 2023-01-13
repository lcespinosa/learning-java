package com.java.learning.basics.graphics;

public class Cube implements Body {

    final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}
