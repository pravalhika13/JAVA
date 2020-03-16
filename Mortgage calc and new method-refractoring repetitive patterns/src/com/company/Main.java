package com.company;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int principal=(int)readNumber("principal:",1000,10000);
        float annualInterest=(float)readNumber("Annual Interest Rate:",0,30);
        byte years=(byte)readNumber("Period(Years):",1,30);

        double mortgage=calculateMortgage(principal,annualInterest,years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
    //method introduced for refractoring repetitive while loops
    public static double readNumber(String prompt,double min,double max) {
        double value;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a number between min and max value");


        }
        return value;
    }

    //method for calculating mortgage value
    public static double calculateMortgage(int principal,float annualInterest,byte years){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int  numberOfPayments =years * MONTHS_IN_YEAR;
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;

    }
}

