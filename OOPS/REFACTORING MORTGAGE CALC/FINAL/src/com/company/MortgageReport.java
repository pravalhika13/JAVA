package com.company;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currencyInstance;
    public MortgageReport(MortgageCalculator calculator) {

        this.calculator = calculator;
        currencyInstance = NumberFormat.getCurrencyInstance();
    }

    private MortgageCalculator calculator;
    //field refactored for MortgageCalculator class


    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for(double balance:calculator.getRemainingBalances())
            //NumberFormat.getCurrencyInstance is duplicated therefore extract field and use this in both places where used
            System.out.println(currencyInstance.format(balance));
        //sincle this is calculation part shifted to MortgageCalculator class and defined a method getRemainingBalances() method.
        //for (short month = 1; month <= calculator.getYears() * MortgageCalculator.MONTHS_IN_YEAR; month++) {
//instead of defining twice the calculator instance generate a field named calculator for MortgageCalculator class
            //double balance = calculator.calculateBalance(month);
            //System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }


    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currencyInstance.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
