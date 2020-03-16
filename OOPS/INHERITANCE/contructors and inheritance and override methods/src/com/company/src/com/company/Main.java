package com.company.src.com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        var control = new TextBox();
        control.isEnabled();
        System.out.println(control.isEnabled());
        var textBox=new TextBox();
        textBox.setText("hello");
        System.out.println(textBox.toString());

    }
}
