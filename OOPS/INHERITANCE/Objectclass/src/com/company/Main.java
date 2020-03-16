package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        var control =new TextBox();
        control.isEnabled();
        System.out.println(control.isEnabled());

        var box1=new TextBox();
        var box2=box1;
        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());
        System.out.println(box1.equals(box2));
        System.out.println(box1.toString());

    }
}
