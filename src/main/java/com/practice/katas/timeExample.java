package com.practice.katas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class timeExample {
    public static void main(String[] args) throws ParseException {

        String time1 = "16:00:00";
        String time2 = "19:00:00";

        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date date1 = format.parse(time1);
        Date date2 = format.parse(time2);
        long difference = date2.getTime() - date1.getTime();

        System.out.println(date1);

    }
}
