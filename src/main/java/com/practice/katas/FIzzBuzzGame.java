package com.practice.katas;
import java.util.Scanner;

public class FIzzBuzzGame {
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        System.out.println("Number Input... ");
        int x = a.nextInt();
        System.out.println("FIzzBuzz Numbers... ");
        for (int i = 1; i<= x; i++){
            if (i%3 == 0 && i% 5== 0){ //multiples of 5 and 3
                System.out.println("FizzBuzz");
            }
            else if (i%3 == 0){//mutliple of 3
                System.out.println("Fizz!");
        }
            else if (i%5==0){//multiple of 5
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);

            }
            System.out.println("");

    }
        a.close();
}}
