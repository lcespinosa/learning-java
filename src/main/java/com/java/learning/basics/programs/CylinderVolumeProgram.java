package com.java.learning.basics.programs;

import com.java.learning.basics.graphics.Cylinder;

import java.io.IOException;
import java.util.Scanner;

public class CylinderVolumeProgram {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cylinder volume calculator ...");

        System.out.println("Enter the radius size: ");
        int radius = scanner.nextInt();

        System.out.println("Enter the height size: ");
        int height = scanner.nextInt();;

        System.out.printf("The volume of the cylinder is: %s", new Cylinder(radius, height).volume());
    }
}
