package com.company;
//binding data and method under same class to achieve encapsulation
public class Employee {
    public int baseSalary;
    public int hourlyRate;
    public int calculateWage(int extraHours){    //since baseSalary and hourlyRate are constant and extraHours might change it is passed as a argument
        return baseSalary+(extraHours*hourlyRate);
    }
}
