package com.company;

import java.util.Scanner;

public class Console {
    //overloading method(no need to pass min and max values)
    private static Scanner scanner = new Scanner(System.in);   //private since it is implementational detail

    public static double readNumber(String prompt) {
        return scanner.nextDouble();
    }

    public static double readNumber(String prompt,double min,double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}
