package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
        var point1=new Point(1,2);
        var point2=new Point(1,2);
       //before overrride
        // System.out.println(point1==point2);  //false
       System.out.println(point1.equals(point2)); //false
        //System.out.println(point1.equals(point1));  //true
    }
}
