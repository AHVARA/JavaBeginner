package com.practice.katas;

import java.util.Scanner;

public class questionnaire {

    public static void main(String[] args) {
        //name
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name?");
        String name = input.nextLine();
        System.out.println("hi lets start " + name);
        int score = 0;
        int retries = 0;
        boolean isCorrect = false;
        while (!isCorrect && retries < 2) {


            // q1

            System.out.println("How many hours are there in 5 days? ");


            String answer = input.nextLine();

            if (answer.equals("120")) {


                System.out.println("correct!");

                score += 1;
                isCorrect = true;


            } else {
                System.out.println("YOU IDIOT");
                retries++;

            }


        }


        //q2
        retries = 0;
        isCorrect = false;
        while (!isCorrect && retries < 2) {


            System.out.println("how many vowels in the word daughter");


            String vowel = input.nextLine();

            if (vowel.equals("3")) {

                System.out.println("AMAZING!");

                score += 1;
                isCorrect = true;


            } else {
                System.out.println(("DUMBASS"));
                retries++;


            }
        }
















        //q3

        retries = 0;
        isCorrect = false;
        while (!isCorrect && retries < 2) {


            System.out.println(("how many letters in your first name?"));
            String letter = input.nextLine();

            if (Integer.parseInt(letter) == name.length()) {
                System.out.println("good");
                score += 1;
                isCorrect = true;



            } else {

                System.out.println("are you STOOPID");
                retries++;


            }
        }





        //q4
        retries = 0;
        isCorrect = false;
        while (!isCorrect && retries < 2) {

            System.out.println("what team does anjali play for?");
            String team = input.nextLine();
            if (team.equalsIgnoreCase("Hawkesmill")) {
                System.out.println("WELL DONE");
                score += 1;
                isCorrect = true;

            } else {
                System.out.println("GET OUT");
                retries++;

            }
        }


        //q5
        retries = 0;
        isCorrect = false;
        while (!isCorrect && retries < 2) {
            System.out.println("Who is the president of USA");    // print the question
            String president = input.nextLine();     // wait for the answer and store it into string

            if (president.equalsIgnoreCase("Donald Trump")) {      // if true then do this
                System.out.println("NERD");
                score += 1;
                isCorrect = true;

            } else {                // otherwise do this
                System.out.println("DUMBASS");

                retries++;
            }
        }


        // q6
        retries = 0;
        isCorrect = false;
        while (!isCorrect && retries < 2) {
            System.out.println("Where is Mercedes originated from?");
            String mercedes = input.nextLine();

            if (mercedes.equalsIgnoreCase("Germany")) {
                System.out.println("YES DEN MY G");
                score += 1;
                isCorrect = true;


            } else {
                System.out.println("WRONG");
                retries++;


            }
        }

        //q7///////////////////////////////////////////////////////////////////////////////////////////////
        retries = 0;
        isCorrect = false;
        while (!isCorrect && retries < 2) {
            System.out.println("What is the square root of 49?");
            String Brazil = input.nextLine();
            if (Brazil.equalsIgnoreCase("7")) {
                System.out.println("SMARTASS!");
                score += 1;
                isCorrect = true;


            } else {
                System.out.println("WRONG");
                retries++;
            }
        }


        //q8
        retries = 0;
        isCorrect = false;
        while (!isCorrect && retries < 2) {
            System.out.println("what is a 1/4 of 80?");
            String what = input.nextLine();
            if (what.equals("20")) {
                System.out.println("good");
                score += 1;
                isCorrect = true;


            } else {
                System.out.println("DUMBO");
                retries++;

            }
        }
        //q9 /////////
        retries = 0;
        isCorrect = false;
        while (!isCorrect && retries < 2) {

            System.out.println("What is the capital city of Scotland?");
            String prime = input.nextLine();
            if (prime.equalsIgnoreCase("Edinburgh")) {
                System.out.println("YES MY G");
                score += 1;
                isCorrect = true;

            } else {
                System.out.println("WRONG");
                retries++;


            }
        }
        System.out.println("you scored "

                + score);


    }}


