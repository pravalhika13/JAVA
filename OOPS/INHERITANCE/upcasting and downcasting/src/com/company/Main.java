package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var control=new UIControl(true);
        var textBox=new TextBox();
        show(textBox);
        //show(control);
    }

    private static void show(UIControl control) {
     //   if(control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("hello");

       System.out.println(control);
    }

}
