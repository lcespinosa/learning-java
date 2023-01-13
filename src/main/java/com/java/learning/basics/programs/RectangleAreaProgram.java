package com.java.learning.basics.programs;

import com.java.learning.basics.graphics.Rectangle;

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

        System.out.printf("The area of the rectangle is: %s", new Rectangle(width, height).area());
    }
}
