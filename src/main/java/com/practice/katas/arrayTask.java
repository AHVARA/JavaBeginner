package com.practice.katas;

import java.util.Arrays;
import java.util.Scanner;

public class arrayTask {



    public static void main(String[] args) throws InterruptedException {
        /*
         * user inputs 10 different numbers,  it then gets stored into an array .....
         * and then you print out the sum of them 10 numbers...
         * Long story short, you type in 10 numbers , press enter , you sse the sum of all them 10 numbers
         * */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers (each on a separate line) to find the sum of them: ");
        int numArray[] = new int[10]; // array of numbers
        for (int i=0; i<10; i++) { // looping through 10 times
            numArray[i] = input.nextInt();  // adding to array
        }
        System.out.println("So here are all the numbers together below: ");
        System.out.println(Arrays.toString(numArray));
        int sum = 0;
        System.out.println("THE SUM BEFORE THE LOOP IS " + sum);
        for(int i=0; i<numArray.length; i++) { // looping
            int numFound = numArray[i];  // getting from array atr position
            sum = sum + numFound; // this is where i keep adding to the sum
            Thread.sleep(500);
        }
        System.out.println("THE SUM AFTER THE LOOP IS " + sum);

    }






        }




