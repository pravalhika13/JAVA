package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       var employee=new Employee();   //creating new instance of employee class
       employee.setBaseSalary(50_000);//employee.baseSalary passes data to new instanciated class
       employee.getBaseSalary();
        employee.hourlyRate=20;
        int wage=employee.calculateWage(10);
       System.out.println(wage);
    }
}
