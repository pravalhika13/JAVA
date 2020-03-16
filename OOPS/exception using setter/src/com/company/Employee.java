package com.company;
//binding data and method under same class to achieve encapsulation
public class Employee {
    private int baseSalary;
    public int hourlyRate;
    public int calculateWage(int extraHours){    //since baseSalary and hourlyRate are constant and extraHours might change it is passed as a argument
        return baseSalary+(extraHours*hourlyRate);
    }
    public void setBaseSalary(int baseSalary){
        if(baseSalary<=0)
            throw new IllegalArgumentException("baseSalary cannot be 0 or negative");
        this.baseSalary=baseSalary;
    }
    public int getBaseSalary(){
        return baseSalary;
    }
}
