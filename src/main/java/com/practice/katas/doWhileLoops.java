package com.practice.katas;

import java.util.Scanner;

public class doWhileLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        do {
            System.out.println("Guess a number between 1-60: ");
            value = scanner.nextInt();

        }

        while (value != 56);
        System.out.println("YOU GUESSED RIGHT!!");


    }


}
