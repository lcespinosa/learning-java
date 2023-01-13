package com.java.learning.basics.programs;

import com.java.learning.basics.graphics.Parallelogram;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParallelogramAreaProgramTest {

    @Test
    public void it_can_calc_area() {
        int base = 4;
        int height = 18;

        assertEquals(72, new Parallelogram(base, height).area(),1);
    }
}