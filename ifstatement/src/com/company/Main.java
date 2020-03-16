package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter temperature of the day:");
        int temperature=scanner.nextInt();
        if (temperature>20)
                System.out.println("its hot and drink lot of water");
        else if (temperature>20&&temperature<=30)
                System.out.println("its good");
        else
            System.out.println("it's cold");



    }
}
