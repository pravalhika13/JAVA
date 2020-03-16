package com.company;
//binding data and method under same class to achieve encapsulation
public class Employee {
    private int baseSalary;
    private int hourlyRate;
    private int extraHours;

    public Employee(int baseSalary,int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }
    public Employee(int baseSalary){
       this(baseSalary,0);
    }
    public int calculateWage(int extraHours){    //since baseSalary and hourlyRate are constant and extraHours might change it is passed as a argument

        return baseSalary+(extraHours*hourlyRate);
    }
    private void setBaseSalary(int baseSalary){
        if(baseSalary<=0)
            throw new IllegalArgumentException("baseSalary cannot be 0 or negative");
        this.baseSalary=baseSalary;
    }
    private int getBaseSalary()
    {
        return baseSalary;

    }
    private void setHourlyRate(int hourlyRate){
        if(hourlyRate<0)
            throw new IllegalArgumentException("hourlyRate cannot be 0 or negative");
        this.hourlyRate=hourlyRate;

    }


}


