package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        byte number = scanner.nextByte();
        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 3 == 0)
            System.out.println("Fizz");
        else if (number % 5 == 0)
            System.out.println("Buzz");
        else

            System.out.println(number);
    }

    }

