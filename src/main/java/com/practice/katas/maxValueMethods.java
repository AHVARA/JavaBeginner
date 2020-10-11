package com.practice.katas;

public class maxValueMethods {

    public static void main(String[] args) {

        int firstValue = 77;
        int secondValue = 9;

        int result = maxValue(firstValue, secondValue);

        System.out.println("The maximum value is: " + result);

    }

    public static int maxValue(int firstParam, int secondParam) {

        int result;
        if (firstParam > secondParam) {
            result = firstParam;

        } else {
            result = secondParam;


        }
        return result;
    }
}

