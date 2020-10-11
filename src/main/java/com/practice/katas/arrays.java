package com.practice.katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrays {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("For arrays , an example where you can add a list of names.");
        System.out.println("Enter a number below 10 you want to limit to: ");
        int limitOfHowManyCanBeAdded = input.nextInt(); //
        System.out.println("the number you entered is now stored in memory so i can use it later");
        Thread.sleep(4909);
        String[] nameArray = new String[limitOfHowManyCanBeAdded]; // array
        System.out.println("I used it here to make the box to the limit you wanted");
        Thread.sleep(4909);
        System.out.println("Enter the names you want to add (dont forget to hit enter for each one) :: ");
        for(int i=0; i<limitOfHowManyCanBeAdded; i++) { // looping
            nameArray[i] = input.next();  // adding to array
        }
        System.out.println("OK THANKS I HAVE STORED THEM.");
        ArrayList<String> myList = new ArrayList<>(Arrays.asList(nameArray)); // array in java
        System.out.println("The list of names you entered is now stored in memory so I can use it later");
        System.out.println("Enter one more name to be added:");
        String element = input.next();
        myList.add(element); // adding to array
        nameArray = myList.toArray(nameArray);
        System.out.println("So here are all names together below: ");
        System.out.println(Arrays.toString(nameArray));
        Thread.sleep(4500);
        for(int i=0; i<nameArray.length; i++) { // looping
            String nameFound= nameArray[i];  // gterting from array atr postiiton
            System.out.println("I am looking in position " + i + " and i have found " + nameFound);
            Thread.sleep(2900);
        }
    }}