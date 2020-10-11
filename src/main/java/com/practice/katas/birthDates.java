package com.practice.katas;
import java.util.ArrayList;
import java.util.List;

public class birthDates {

    public static void main(String[] args) {

        System.out.println("TODAY is 24th April");

        // LIST OF BIRTH DATES
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(1); // 0 position
        listOfNumbers.add(25); // 1 position
        listOfNumbers.add(15); // 2 position
        listOfNumbers.add(12); // 3 position
        listOfNumbers.add(27); // 4 position
        listOfNumbers.add(23); // 5 position
        listOfNumbers.add(26); // 6 position
        listOfNumbers.add(24); // 7 position
        listOfNumbers.add(29); // 8 position


        int dateOfToday = 24;

        for (int i = 0; i < listOfNumbers.size(); i++) {
            System.out.println("I am checking position " + i);
            if (listOfNumbers.get(i) > dateOfToday) {
                System.out.println("This is in future: " + listOfNumbers.get(i));
            }
        }

        System.out.println("I AM OUT OF THE LOOP - BECAUSE LOOP FINISHED");


    }


}
