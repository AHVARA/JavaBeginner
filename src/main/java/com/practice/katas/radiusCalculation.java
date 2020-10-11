package com.practice.katas;

import java.util.Scanner;

public class radiusCalculation{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double radius;
        double area;

        System.out.println("Provide value for radius: ");



        radius = input.nextDouble();


        area = radius * radius * 3.14159;




        //output
        System.out.println("the area for the circle radius " + radius + " is " + area );

    }










}
