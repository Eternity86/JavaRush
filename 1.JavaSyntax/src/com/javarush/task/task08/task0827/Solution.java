package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {

        System.out.println(isDateOdd("JANUARY 2 2016"));
    }

    public static boolean isDateOdd(String date) throws ParseException {

        byte[] numberDayInMonth = new byte[]{31,28,31,30,31,30,31,31,30,31,30,31};

        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Date inputDate = df.parse(date);
        LocalDate localDate = inputDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        int numberDayInYear = 0;
        if (localDate.isLeapYear()) numberDayInMonth[1]++;
        for (int i = 0; i < localDate.getMonthValue() - 1; i++) {
            numberDayInYear += numberDayInMonth[i];
        }
        numberDayInYear += localDate.getDayOfMonth();
        //System.out.println(numberDayInYear);
        if (numberDayInYear % 2 != 0) return true;
            else return false;
    }
}
