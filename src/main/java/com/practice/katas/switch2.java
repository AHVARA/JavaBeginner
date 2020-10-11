package com.practice.katas;

import java.util.Scanner;

public class switch2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a command: ");

        String text = input.nextLine().toLowerCase();

        switch (text) {
            case "start":
                System.out.println("Device starting...");
                break;

            case "stop":
                System.out.println("Device turning off...");
                break;

            default:
                System.out.println("Command not valid, only input start or stop");

        }

    }
}
