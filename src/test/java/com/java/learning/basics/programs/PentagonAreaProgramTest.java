package com.java.learning.basics.programs;

import com.java.learning.basics.graphics.Pentagon;
import org.junit.Test;

import static org.junit.Assert.*;

public class PentagonAreaProgramTest {

    @Test
    public void it_can_calc_area() {
        int base = 13;
        int height = 5;

        assertEquals(162.5, new Pentagon(base, height).area(),1);
    }
}