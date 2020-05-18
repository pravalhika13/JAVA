package com.company;

public class TaxReport {


    private TaxCalculator20 calculator;

    //constructor injection
    public TaxReport(TaxCalculator20 calculator) {

        this.calculator=calculator;
    }
    public void show(){
        var tax=calculator.calculateTax();
        System.out.println(tax);
    }
    //setter injection
    public void setCalculator(TaxCalculator20 calculator) {

        this.calculator = calculator;
    }
}
