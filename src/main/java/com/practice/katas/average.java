package com.practice.katas;

import java.util.Scanner;

public class average {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter 3 numbers to find out the mean: ");

        int firstVariable = input.nextInt();
        int secondVariable = input.nextInt();
        int thirdVariable = input.nextInt();


        int mean = (firstVariable + secondVariable + thirdVariable) /3;

        System.out.println("The mean of " + firstVariable + " , " + secondVariable + " , " + thirdVariable + " is " + mean);

    }



}
