package com.java.learning.basics.programs;

import com.java.learning.basics.graphics.Sphere;
import org.junit.Test;

import static org.junit.Assert.*;

public class SphereVolumeProgramTest {

    @Test
    public void it_can_calc_volume() {
        int radius = 48;

        assertEquals(463246, new Sphere(radius).volume(),1);
    }
}