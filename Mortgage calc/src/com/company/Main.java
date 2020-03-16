package com.company;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int principal=0;
        byte years=0;
        float annualInterest=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal($1K-$1M): ");
        while (true) {
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 100_000) {
                System.out.println(principal);
                break;
            }
            System.out.println("Enter a number between 1000 and 1,00,000");
        }
        System.out.print("Annual Interest Rate: ");
        while(true) {
            annualInterest = scanner.nextFloat();
            if (annualInterest >= 0 && annualInterest <= 30) {
                break;
            }
            System.out.println("Enter a number between 0 and 30 or equal value");
        }
        System.out.print("Period (Years): ");    // 1 and 30
        while(true) {
            years = scanner.nextByte();
            if (years > 1 && years < 30)
                break;
            }
            System.out.println("Enter a number between 1 and 30 or equal value");
        }
        double mortgage=calculateMortgage(principal,annualInterest,years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
    public static double calculateMortgage(int principal,float annualInterest,byte years){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        short numberOfPayments =(short)years * MONTHS_IN_YEAR;
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;
    }

}
