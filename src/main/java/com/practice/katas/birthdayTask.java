package com.practice.katas;
import org.joda.time.*;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.MonthDay;
import java.util.*;
public class birthdayTask {
    //    Show me the time remaining for peoples birthdays ....
    //    e.g. if i have a array of peoples names and birthdays ....
    //    i want to see how long left to each of their birthdays
    public static void main(String[] args) {
        // start with names of people
        List<String> names = new ArrayList<>();
        names.add("Anj");
        names.add("Isaac");
        names.add("Mum");
        names.add("Riya");
        names.add("Dad");
        names.add("Jyoti");
        // We of course need todays date so we know when to check from
        Date date = new Date();
        // A format of date cause we in uk
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        // today's date in correct format
        String rightNow = formatter.format(date);
        System.out.println("Right now, it is:   " + rightNow);
        // array of birthdays
        List<MonthDay> bdayDate = new ArrayList<>();
        bdayDate.add(MonthDay.of(Month.JULY, 20));
        bdayDate.add(MonthDay.of(Month.JULY, 23));
        bdayDate.add(MonthDay.of(Month.AUGUST, 3));
        bdayDate.add(MonthDay.of(Month.DECEMBER, 6));
        bdayDate.add(MonthDay.of(Month.JULY, 30));
        bdayDate.add(MonthDay.of(Month.JULY, 7));
        List<Date> listOfDatesInCorrectFormat = new ArrayList<>();
        for (int i = 0; i < bdayDate.size(); i++) {
            Date dateInCorrectFormat = new Date();
            dateInCorrectFormat.setMonth(bdayDate.get(i).getMonthValue() - 1);
            dateInCorrectFormat.setDate(bdayDate.get(i).getDayOfMonth());
            dateInCorrectFormat.setHours(0);
            dateInCorrectFormat.setSeconds(0);
            dateInCorrectFormat.setMinutes(0);
            listOfDatesInCorrectFormat.add(dateInCorrectFormat);
        }
        // map birthdays to names
        HashMap<String, String> bdayToNames = new HashMap<>();
        for (int i = 0; i < listOfDatesInCorrectFormat.size(); i++) {
            bdayToNames.put(names.get(i), formatter.format(listOfDatesInCorrectFormat.get(i)));
        }
        // loop through the map and check time diff between each birthday
        for (Map.Entry<String, String> entry : bdayToNames.entrySet()) {
            try {
                // your loop should go here
                Date d1 = formatter.parse(rightNow);
                DateTime date1 = new DateTime(d1);
                Date d2 = formatter.parse(entry.getValue());
                DateTime birthdate = new DateTime(d2);
                System.out.print(Days.daysBetween(date1, birthdate).getDays() + " days, ");
                System.out.print(Hours.hoursBetween(date1, birthdate).getHours() % 24 + " hours, ");
                System.out.print(Minutes.minutesBetween(date1, birthdate).getMinutes() % 60 + " minutes, ");
                System.out.print(Seconds.secondsBetween(date1, birthdate).getSeconds() % 60 + " seconds ");
                System.out.print("left until " + entry.getKey() + " birthday");
                System.out.println("\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}