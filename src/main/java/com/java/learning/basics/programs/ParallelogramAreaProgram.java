package com.java.learning.basics.programs;

import com.java.learning.basics.graphics.Parallelogram;

import java.io.IOException;
import java.util.Scanner;

public class ParallelogramAreaProgram {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Parallelogram area calculator ...");

        System.out.println("Enter the base size: ");
        int base = scanner.nextInt();

        System.out.println("Enter the height size: ");
        int height = scanner.nextInt();;

        System.out.printf("The area of the rectangle is: %s", new Parallelogram(base, height).area());
    }
}
