package com.practice.katas;

import java.util.Scanner;

public class guess {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean isCorrect = false;
        while (!isCorrect) {

            System.out.println("guess a number between 0-10 ");

            int number = input.nextInt();

            if (number == 5) {

                System.out.println("correct");
                isCorrect = true;

            }

            if (number > 10) {
                System.out.println("not a number between 0-10!!!");


            }


        }


    }
}
