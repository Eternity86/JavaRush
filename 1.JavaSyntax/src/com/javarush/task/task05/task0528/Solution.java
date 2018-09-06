package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.util.Calendar;
//import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        //Date date = new Date();

        // Вывод отформатированной даты
        //System.out.printf("%s %te %<tB %<tY", "Сегодняшняя дата:", date);
        //System.out.println("");
        Calendar c = Calendar.getInstance();
        int day = c.get(Calendar.DAY_OF_MONTH);
        //System.out.println(day);
        int month = c.get(Calendar.MONTH) + 1;
        //System.out.println(month + 1);
        int year = c.get(Calendar.YEAR);
        //System.out.println(year);
        System.out.println(day + " " + month + " " + year);
    }
}
