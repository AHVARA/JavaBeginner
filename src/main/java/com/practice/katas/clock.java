package com.practice.katas;

import java.util.Scanner;

public class clock {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter 24hr time to find out 12hr time");

        String timestring = input.nextLine();

        int hour = Integer.parseInt(timestring.substring(0,2));
        int minutes = Integer.parseInt(timestring.substring(3));
        if (hour > 12) {

            hour = hour - 12;


        } else {
            hour = hour;
        }


        String timeOfDay;
        int hourOfDay = Integer.parseInt(timestring.substring(0,2));
        if (hourOfDay < 12) {

            timeOfDay = "am";
        } else {

            timeOfDay = "pm";
        }


        System.out.println(timestring + " in 12hr time is " + hour + ":"+ minutes + timeOfDay);


    }


}
