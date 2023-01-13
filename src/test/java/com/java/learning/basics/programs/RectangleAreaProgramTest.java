package com.java.learning.basics.programs;

import com.java.learning.basics.graphics.Rectangle;
import org.junit.Test;

import static org.junit.Assert.*;
public class RectangleAreaProgramTest {

    @Test
    public void it_can_calc_area() {
        int width = 10;
        int height = 20;

        assertEquals(200, new Rectangle(width, height).area(),1);
    }
}