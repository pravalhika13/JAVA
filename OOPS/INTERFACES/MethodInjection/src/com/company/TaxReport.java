package com.company;

public class TaxReport {


    private TaxCalculator calculator;

    //constructor injection
   // public TaxReport(TaxCalculator calculator) {

        //this.calculator=calculator;
    //}
    //method injection
    public void show(TaxCalculator calculator){
        var tax=calculator.calculateTax();
        System.out.println(tax);
    }

    //setter injection
    //public void setCalculator(TaxCalculator calculator) {

      //  this.calculator = calculator;
    }



