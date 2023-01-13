package com.java.learning.basics.programs;

import com.java.learning.basics.graphics.Sphere;
import org.junit.Test;

import static org.junit.Assert.*;

public class SphereAreaProgramTest {

    @Test
    public void it_can_calc_area() {
        int radius = 37;

        assertEquals(17203, new Sphere(radius).area(),1);
    }
}