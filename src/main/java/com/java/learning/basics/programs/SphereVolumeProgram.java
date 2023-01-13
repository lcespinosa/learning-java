package com.java.learning.basics.programs;

import com.java.learning.basics.graphics.Sphere;

import java.io.IOException;
import java.util.Scanner;

public class SphereVolumeProgram {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sphere volume calculator ...");

        System.out.println("Enter the radius size: ");
        int radius = scanner.nextInt();

        System.out.printf("The volume of the sphere is: %s", new Sphere(radius).volume());
    }
}
