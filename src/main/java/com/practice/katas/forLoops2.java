package com.practice.katas;

public class forLoops2 {

    public static void main(String[] args) {


        int sum = 0;

       for (int i = 1; i <= 100; i++){
           System.out.println("Starting loop number " + i);
           System.out.println("the original sum is " + sum);
           sum = sum + i;
           System.out.println("I have added two numbers together and sum is now " + sum);
//
           System.out.println();
           System.out.println("The sum is now " + sum + " - this is loop number " + i);



       }

        System.out.println("The sum is " + sum);
    }

}
