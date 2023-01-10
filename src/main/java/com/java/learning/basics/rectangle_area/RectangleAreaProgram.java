package com.java.learning.basics.rectangle_area;

import java.io.IOException;
import java.util.Scanner;

public class RectangleAreaProgram {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rectangle area calculator ...");

        System.out.println("Enter the width size: ");
        int width = scanner.nextInt();

        System.out.println("Enter the height size: ");
        int height = scanner.nextInt();;

        System.out.printf("The area of the rectangle is: %s", RectangleAreaCalculator.area(width, height));
    }
}
