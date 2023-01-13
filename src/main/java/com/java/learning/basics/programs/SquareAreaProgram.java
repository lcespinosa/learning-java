package com.java.learning.basics.programs;

import com.java.learning.basics.graphics.Square;

import java.io.IOException;
import java.util.Scanner;

public class SquareAreaProgram {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Square area calculator ...");

        System.out.println("Enter the side size: ");
        int width = scanner.nextInt();

        System.out.printf("The area of the square is: %s", new Square(width).area());
    }
}
