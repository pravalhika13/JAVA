package com.company;

public class Main {

    public static void main(String[] args) {
        //constructor
       var employee=new Employee(50_000,30);   //creating new instance of employee class
        int wage=employee.calculateWage(10);
       System.out.println(wage);
    }
}
