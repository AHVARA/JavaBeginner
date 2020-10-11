package com.practice.katas;

import java.util.Scanner;

public class ifStatements {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //System.out.println("Enter 2 numbers ");
        System.out.println("Enter + or - , then enter 2 numbers");

        String sign = input.nextLine();
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();

        if(sign.equals("+")){

            System.out.println("The addition sum of " + firstNum + " " + secondNum + " is " +(firstNum + secondNum));
        }

        else if (sign.equals("-"));
        System.out.println("The subtraction  sum of " + firstNum + " " + secondNum + " is " +(firstNum - secondNum));

    }








}
