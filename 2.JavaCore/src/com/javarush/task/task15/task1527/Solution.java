package com.javarush.task.task15.task1527;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        String newURL = new Scanner(System.in).nextLine();

        String temp = null; // в temp теперь хранится значение всех параметров после '?'

        /* теперь нужно распарсить строку в temp на отдельные параметры (разделены '&') */
        String[] subStr = newURL.substring(newURL.indexOf('?') + 1).split("&");
        ArrayList<String> myList = new ArrayList<>();
        for (int i = 0; i < subStr.length; i++) {
            if (subStr[i].contains("=")) {
                if (subStr[i].substring(0, subStr[i].indexOf('=')).equals("obj")) {
                    temp = subStr[i].substring(subStr[i].indexOf('=') + 1);
                }
                myList.add(subStr[i].substring(0, subStr[i].indexOf('=')));
            } else myList.add(subStr[i]);
        }
        for (String s :
                myList) {
            System.out.print(s + " ");
        }
        System.out.println();
        try {
            if (temp != null) alert(Double.valueOf(temp));
        } catch (NumberFormatException e) {
            alert(temp);
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
