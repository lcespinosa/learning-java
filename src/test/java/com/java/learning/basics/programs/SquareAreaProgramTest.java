package com.java.learning.basics.programs;

import com.java.learning.basics.graphics.Square;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareAreaProgramTest {

    @Test
    public void it_can_calc_area() {
        int width = 13;

        assertEquals(169, new Square(width).area(),1);
    }
}