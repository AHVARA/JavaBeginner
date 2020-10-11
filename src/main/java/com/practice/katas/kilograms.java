package com.practice.katas;

import java.util.Scanner;

public class kilograms {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in kilograms ");



        Double kilograms = input.nextDouble();

        Double grams = (kilograms *1000 / 5);

        System.out.println("the number of grams are " + grams);



    }
}
