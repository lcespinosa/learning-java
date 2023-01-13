package com.java.learning.basics.programs;

import com.java.learning.basics.graphics.Pentagon;
import com.java.learning.basics.graphics.Rectangle;

import java.io.IOException;
import java.util.Scanner;

public class PentagonAreaProgram {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pentagon area calculator ...");

        System.out.println("Enter the base size: ");
        int base = scanner.nextInt();

        System.out.println("Enter the height size: ");
        int height = scanner.nextInt();;

        System.out.printf("The area of the pentagon is: %s", new Pentagon(base, height).area());
    }
}
