package com.practice.katas;

import java.util.Scanner;

public class fahrenheitToCelsius {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Fahrenheit: ");

        double fahrenheit = input.nextDouble();



        //celsius = (5.0 / 9) * (fahrenheit -32)
        double celsius = (5.0 / 9) * (fahrenheit - 32 );

        System.out.println("Fahrenheit " + fahrenheit + "is " + celsius + " in celsius");




    }





}
