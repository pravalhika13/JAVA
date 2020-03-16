package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        UIControl[] controls={new TextBox(),new CheckBox()};
        for(var control:controls){
            control.render();   //polymorphism render() method defined in UIControl.java class and override render method in textbox and chekcbox
        }
    }
}
