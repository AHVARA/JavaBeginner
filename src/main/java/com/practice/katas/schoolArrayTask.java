package com.practice.katas;

import java.time.LocalTime;
import java.util.*;
import java.util.Scanner;

public class schoolArrayTask {

    private static int ilength;

    public static void printMatrix(int size, int row, String[][] matrix) {
        for (int i = 0; i < 20 * size; i++) {
            System.out.print("-");
        }
        System.out.println("-");
        for (int i = 1; i <= matrix[row].length; i++) {
            System.out.format("| " + rightPad(matrix[row][i - 1], 26)); // you may give any value you like 2,3,4,5...etc for length
            // System.out.printf("| %s ",matrix[row][i - 1]);
            ilength++;
        }
        System.out.println(" | ");
        if (row == size - 1) {
            // when we reach the last row,
            // print bottom line "---------"
            for (int i = 0; i < 20 * size; i++) {
                System.out.print("-");
            }
            System.out.println("-");
        }
    }

    public static void printTimetable(String[][] matrix) {
        int rowsLength = matrix.length;
        for (int k = 0; k < rowsLength; k++) {
            printMatrix(rowsLength, k, matrix);
        }
    }

    public static String rightPad(String value, int length) {
        int size = value.length();
        if (size == length) {
            return value;
        } else if (size > length) {
            return value.substring(0, length);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            length = length - size;
            stringBuilder.append(value);
            for (int i = 0; i < length; i++) {
                stringBuilder.append(" ");
            }
            return stringBuilder.toString();
        }
    }

    public static String SubjectAndTeacher(String subject, String teacher) {
        return subject + " (" + teacher + ')';
    }

    /*
     *  TASK: WRITE A PROGRAM THAT LAYS OUT SCHOOL SCHEDULE WITH ALL TIMINGS
     *
     *  NEEDS: ALL LESSONS AND TIMES - BREAK/LUNCHES
     *
     *
     *
     * */
    public static void main(String[] args) {
        HashMap<String, String> subjectAndTeachers = new HashMap<>();
        subjectAndTeachers.put("Maths", SubjectAndTeacher("Maths", "Mr Barlow"));
        subjectAndTeachers.put("Science", SubjectAndTeacher("Science", "Mr Davies"));
        subjectAndTeachers.put("English", SubjectAndTeacher("English", "Mrs Cowley"));
        subjectAndTeachers.put("PE", SubjectAndTeacher("PE", "Mr Corden"));
        subjectAndTeachers.put("RE", SubjectAndTeacher("RE", "Mrs Grayson"));
        subjectAndTeachers.put("Product Design", SubjectAndTeacher("Product Design", "Mr Clarke"));
        subjectAndTeachers.put("Art", SubjectAndTeacher("Art", "Mr Howard"));
        subjectAndTeachers.put("Computer Science", SubjectAndTeacher("Computer Science", "Ms BITCH "));
        subjectAndTeachers.put("Food Tech", SubjectAndTeacher("Food tech", "Mr Lees "));
        // THE SUBJECTS FOR MONDAY
        HashMap<String, String> monSchedule = new HashMap<>();
        monSchedule.put("P1", subjectAndTeachers.get("PE")); // 0
        monSchedule.put("P2", subjectAndTeachers.get("English"));
        monSchedule.put("P3", subjectAndTeachers.get("Computer Science"));
        monSchedule.put("P4", subjectAndTeachers.get("Maths"));
        monSchedule.put("P5", subjectAndTeachers.get("RE"));
        // THE SUBJECTS FOR TUESDAY
        HashMap<String, String> tuesSchedule = new HashMap<>();
        tuesSchedule.put("P1", subjectAndTeachers.get("Art"));
        tuesSchedule.put("P2", subjectAndTeachers.get("Science"));
        tuesSchedule.put("P3", subjectAndTeachers.get("Food Tech"));
        tuesSchedule.put("P4", subjectAndTeachers.get("Maths"));
        tuesSchedule.put("P5", subjectAndTeachers.get("English"));
        // THE SUBJECTS FOR WEDNESDAY
        HashMap<String, String> wedsSchedule = new HashMap<>();
        wedsSchedule.put("P1", subjectAndTeachers.get("Science"));
        wedsSchedule.put("P2", subjectAndTeachers.get("Maths"));
        wedsSchedule.put("P3", subjectAndTeachers.get("RE"));
        wedsSchedule.put("P4", subjectAndTeachers.get("Computer Science"));
        wedsSchedule.put("P5", subjectAndTeachers.get("English"));
        // THE SUBJECTS FOR THURSDAY
        HashMap<String, String> thursSchedule = new HashMap<>();
        thursSchedule.put("P1", subjectAndTeachers.get("Food Tech"));
        thursSchedule.put("P2", subjectAndTeachers.get("Science"));
        thursSchedule.put("P3", subjectAndTeachers.get("English"));
        thursSchedule.put("P4", subjectAndTeachers.get("Product Design"));
        thursSchedule.put("P5", subjectAndTeachers.get("RE"));
        // THE SUBJECTS FOR FRIDAY
        HashMap<String, String> fridaySchedule = new HashMap<>();
        fridaySchedule.put("P1", subjectAndTeachers.get("Maths"));
        fridaySchedule.put("P2", subjectAndTeachers.get("RE"));
        fridaySchedule.put("P3", subjectAndTeachers.get("Art"));
        fridaySchedule.put("P4", subjectAndTeachers.get("Science"));
        fridaySchedule.put("P5", subjectAndTeachers.get("Food Tech"));
        // NEXT THE SCHOOL TIMINGS
        List<LocalTime> timings = new ArrayList<>();
        timings.add(LocalTime.of(9, 10));
        timings.add(LocalTime.of(10, 10));
        timings.add(LocalTime.of(11, 10));
        timings.add(LocalTime.of(11, 35));
        timings.add(LocalTime.of(12, 35));
        timings.add(LocalTime.of(13, 15));
        timings.add(LocalTime.of(14, 15));
        timings.add(LocalTime.of(15, 15));

        String[][] timetable = {
                {" TIME   ", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"},
                {timings.get(0).toString() + "-" + timings.get(1).toString(), monSchedule.get("P1"), tuesSchedule.get("P1"), wedsSchedule.get("P1"), thursSchedule.get("P1"), fridaySchedule.get("P1")},
                {timings.get(1).toString() + "-" + timings.get(2).toString(), monSchedule.get("P2"), tuesSchedule.get("P2"), wedsSchedule.get("P2"), thursSchedule.get("P2"), fridaySchedule.get("P2")},
                {timings.get(2).toString() + "-" + timings.get(3).toString(), "BREAK", "BREAK", "BREAK", "BREAK", "BREAK"},
                {timings.get(3).toString() + "-" + timings.get(4).toString(), monSchedule.get("P3"), tuesSchedule.get("P3"), wedsSchedule.get("P3"), thursSchedule.get("P3"), fridaySchedule.get("P3")},
                {timings.get(4).toString() + "-" + timings.get(5).toString(), "LUNCH", "LUNCH", "LUNCH", "LUNCH", "LUNCH"},
                {timings.get(5).toString() + "-" + timings.get(6).toString(), monSchedule.get("P4"), tuesSchedule.get("P4"), wedsSchedule.get("P4"), thursSchedule.get("P4"), fridaySchedule.get("P4")},
                {timings.get(6).toString() + "-" + timings.get(7).toString(), monSchedule.get("P5"), tuesSchedule.get("P5"), wedsSchedule.get("P5"), thursSchedule.get("P5"), fridaySchedule.get("P5")},


        };
        //printTimetable(timetable);


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day between monday-friday to find out your lessons or enter the word 'timetable' to view your full timetable... ");
        System.out.println("If you would like to find out a specific lesson please enter the day and period, either 'p1' 'p2' 'p3' 'p4' 'p5' ... ");
        String text = input.nextLine().toLowerCase();

        switch (text) {

            case "monday":
                System.out.println(monSchedule);
                break;

            case "tuesday":
                System.out.println(tuesSchedule);
                break;

            case "wednesday":
                System.out.println(wedsSchedule);
                break;

            case "thursday":
                System.out.println(thursSchedule);
                break;

            case "friday":
                System.out.println(fridaySchedule);
                break;


            case "timetable":
                printTimetable(timetable);
                break;

            //monday
            case "monday p1":
                System.out.println(monSchedule.get("P1"));
                System.out.println(timings.get(0).toString() + "-" + timings.get(1).toString());
                break;


            case "monday p2":
                System.out.println(monSchedule.get("P2"));
                System.out.println(timings.get(1).toString() + "-" + timings.get(2).toString());
                break;


            case "monday p3":
                System.out.println(monSchedule.get("P3"));
                System.out.println(timings.get(3).toString() + "-" + timings.get(4).toString());
                break;


            case "monday p4":
                System.out.println(monSchedule.get("P4"));
                System.out.println(timings.get(5).toString() + "-" + timings.get(6).toString());
                break;


            case "monday p5":
                System.out.println(monSchedule.get("P5"));
                System.out.println(timings.get(6).toString() + "-" + timings.get(7).toString());
                break;

            //tuesday
            case "tuesday p1":
                System.out.println(tuesSchedule.get("P1"));
                System.out.println(timings.get(0).toString() + "-" + timings.get(1).toString());
                break;


            case "tuesday p2":
                System.out.println(tuesSchedule.get("P2"));
                System.out.println(timings.get(1).toString() + "-" + timings.get(2).toString());
                break;


            case "tuesday p3":
                System.out.println(tuesSchedule.get("P3"));
                System.out.println(timings.get(3).toString() + "-" + timings.get(4).toString());
                break;

            case "tuesday p4":
                System.out.println(tuesSchedule.get("P4"));
                System.out.println(timings.get(5).toString() + "-" + timings.get(6).toString());
                break;

            case "tuesday p5":
                System.out.println(tuesSchedule.get("P5"));
                System.out.println(timings.get(6).toString() + "-" + timings.get(7).toString());

                //wednesday
            case "wednesday p1":
                System.out.println(wedsSchedule.get("P1"));
                System.out.println(timings.get(0).toString() + "-" + timings.get(1).toString());
                break;


            case "wednesday p2":
                System.out.println(wedsSchedule.get("P2"));
                System.out.println(timings.get(1).toString() + "-" + timings.get(2).toString());
                break;


            case "wednesday p3":
                System.out.println(wedsSchedule.get("P3"));
                System.out.println(timings.get(3).toString() + "-" + timings.get(4).toString());
                break;

            case "wednesday p4":
                System.out.println(wedsSchedule.get("P4"));
                System.out.println(timings.get(5).toString() + "-" + timings.get(6).toString());
                break;

            case "wednesday p5":
                System.out.println(wedsSchedule.get("P5"));
                System.out.println(timings.get(6).toString() + "-" + timings.get(7).toString());


                //thursday
            case "thursday p1":
                System.out.println(thursSchedule.get("P1"));
                System.out.println(timings.get(0).toString() + "-" + timings.get(1).toString());
                break;


            case "thursday p2":
                System.out.println(thursSchedule.get("P2"));
                System.out.println(timings.get(1).toString() + "-" + timings.get(2).toString());
                break;


            case "thursday p3":
                System.out.println(thursSchedule.get("P3"));
                System.out.println(timings.get(3).toString() + "-" + timings.get(4).toString());
                break;

            case "thursday p4":
                System.out.println(thursSchedule.get("P4"));
                System.out.println(timings.get(5).toString() + "-" + timings.get(6).toString());
                break;

            case "thursday p5":
                System.out.println(thursSchedule.get("P5"));
                System.out.println(timings.get(6).toString() + "-" + timings.get(7).toString());
                break;


            //friday

            case "friday p1":
                System.out.println(fridaySchedule.get("P1"));
                System.out.println(timings.get(0).toString() + "-" + timings.get(1).toString());
                break;


            case "friday p2":
                System.out.println(fridaySchedule.get("P2"));
                System.out.println(timings.get(1).toString() + "-" + timings.get(2).toString());
                break;


            case "friday p3":
                System.out.println(fridaySchedule.get("P3"));
                System.out.println(timings.get(3).toString() + "-" + timings.get(4).toString());
                break;

            case "friday p4":
                System.out.println(fridaySchedule.get("P4"));
                System.out.println(timings.get(5).toString() + "-" + timings.get(6).toString());
                break;

            case "friday p5":
                System.out.println(fridaySchedule.get("P5"));
                System.out.println(timings.get(6).toString() + "-" + timings.get(7).toString());
                break;



        }
    }
}