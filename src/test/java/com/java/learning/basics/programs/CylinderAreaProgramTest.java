package com.java.learning.basics.programs;

import com.java.learning.basics.graphics.Cylinder;
import org.junit.Test;

import static org.junit.Assert.*;

public class CylinderAreaProgramTest {

    @Test
    public void it_can_calc_volume() {
        int radius = 38;
        int height = 35;

        assertEquals(158776, new Cylinder(radius, height).volume(),1);
    }
}