package com.company;

import java.text.NumberFormat;

public class MortgageReport {
    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    private MortgageCalculator calculator;
    //field refactored for MortgageCalculator class


    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= calculator.getYears() * Main.MONTHS_IN_YEAR; month++) {
//instead of defining twice the calculator instance generate a field named calculator for MortgageCalculator class
            double balance = calculator.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
