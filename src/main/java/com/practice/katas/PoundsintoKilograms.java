package com.practice.katas;

import java.util.Scanner;

public class  PoundsintoKilograms {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");

        double pounds = input.nextDouble();

        double kilograms = (pounds * 454);
        System.out.println(pounds + " in kilograms is " + kilograms);


    }
}
