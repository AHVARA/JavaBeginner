package com.practice.katas;

public class maxValue2 {

    public static void main(String[] args) {

        int firstValue = 3  ;
        int secondValue = 66;

         maxValue(firstValue, secondValue);



    }

    public static void  maxValue(int firstParam, int secondParam) {

        int result;
        if (firstParam > secondParam) {
            result = firstParam;

        } else {
            result = secondParam;


        }
        System.out.println("The maximum value is: " + result);


    }}












