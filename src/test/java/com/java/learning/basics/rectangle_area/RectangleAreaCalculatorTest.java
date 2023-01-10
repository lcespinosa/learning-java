package com.java.learning.basics.rectangle_area;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleAreaCalculatorTest {

    @Test
    public void it_can_calc_area() {
        int width = 10;
        int height = 20;

        assertEquals(200, RectangleAreaCalculator.area(width, height));
    }
}