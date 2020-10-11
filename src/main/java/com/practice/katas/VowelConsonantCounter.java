package com.practice.katas;

import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a word/sentence to find out the number of vowels/consonants...");
        String input = scanner.nextLine();
        System.out.println("Counting the vowels and consonants in: [" + input + "]");
        //replaces spaces                           //converts to lower case
        String str = input.replaceAll("\\s", "").toLowerCase();
        scanner.close();
        int vowelCount = 0;
        int consonantCount = 0;
        StringBuilder stringToPrint = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' ||    //if statement, says if the input includes any vowels, add to the vowel count
                    str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u') {
                //adds to no of vowels
                vowelCount++;


            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                //adds to no of consonants
                consonantCount++;
                stringToPrint.append(str.charAt(i));
            }
        }
        //output
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("[" + input + "] without any vowels is '" + stringToPrint + "'");
    }
}
