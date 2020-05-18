package com.company;

public class TaxCalculator20 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator20(double taxableIncome) {

        this.taxableIncome = taxableIncome;
    }
    @Override
    public double calculateTax(){
        return taxableIncome*0.3;

    }
}
