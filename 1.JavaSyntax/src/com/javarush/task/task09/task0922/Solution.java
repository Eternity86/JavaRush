package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws ParseException {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        String date = input.nextLine();
        SimpleDateFormat oldDateFormat = new SimpleDateFormat("y-MM-dd", Locale.ENGLISH); //дата в формате ГГГГ-ММ-ДД (на английском YYYY-MM-DD)
        Date inputDate = null;
        try {
            inputDate = oldDateFormat.parse(date);
        } catch (ParseException e) {
            System.out.println("Невозможно распознать формат даты. Введите в формате ГГГГ-ММ-ДД");
            date = input.nextLine();
            inputDate = oldDateFormat.parse(date);
        }

        SimpleDateFormat newDateFormat = new SimpleDateFormat("MMM dd, y", Locale.ENGLISH); //создаем новый паттерн МММ ДД, ГГГГ (на английском - МММ dd, yyyy)
        String newDate = newDateFormat.format(inputDate); //переводим дату в формате YYYY-MM-DD в формат Mmm dd, yyyy

        //теперь нужно краткое название месяца Mmm (к примеру, Aug) получить из newDate и преобразовать в MMM (т.е. в AUG)
        newDate = newDate.toUpperCase(); //в лоб - все символы преобразованной строки переводим в верхний регистр


        //преобразовали и теперь выводим на консоль
        System.out.println(newDate);

    }
}
