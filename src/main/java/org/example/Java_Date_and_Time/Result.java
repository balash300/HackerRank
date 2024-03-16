package org.example.Java_Date_and_Time;

import java.util.Calendar;

public class Result {
    public static String findDay(int month, int day, int year) {

        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, month-1);
        c.set(Calendar.DAY_OF_MONTH, day);
        c.set(Calendar.YEAR, year);

        String[] day_of_week = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY","SATURDAY"};

        return day_of_week[c.get(Calendar.DAY_OF_WEEK)-1];

    }
}
