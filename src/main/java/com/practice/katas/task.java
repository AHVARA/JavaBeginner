package com.practice.katas;

import java.util.Scanner;

public class task {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("input some text: ");//user input
        String text = input.nextLine();
        customMethod(text); // calls method

    }
    public static void customMethod(String text) {

        String s = text;
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i)); //prints each char(letter on sep lines)
           DashFile.printDash();
        }


    }


}



