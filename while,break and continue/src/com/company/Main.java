package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //if user types quit it has to  exit
        Scanner scanner=new Scanner(System.in);
        String input="";
        while(true){
            System.out.println("input:");
            input=scanner.next().toLowerCase();
            if(input.equals("pass"))
                continue;
                if(input.equals("quit"))
                    break;
                System.out.println(input);

        }


    }
}
