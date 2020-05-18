package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        var calculator=new TaxCalculator20(100_000);
        var report=new TaxReport(calculator);
        report.show();
    }

}
