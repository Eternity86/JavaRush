package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        String nameMonth = input.nextLine();
        HashMap<Integer, String> listMonth = new HashMap<>();
        listMonth.put(1, "January");
        listMonth.put(2, "February");
        listMonth.put(3, "March");
        listMonth.put(4, "April");
        listMonth.put(5, "May");
        listMonth.put(6, "June");
        listMonth.put(7, "July");
        listMonth.put(8, "August");
        listMonth.put(9, "September");
        listMonth.put(10, "October");
        listMonth.put(11, "November");
        listMonth.put(12, "December");

        Integer numberMonth = -1;

        for (Map.Entry<Integer, String> entry:
        listMonth.entrySet()){
            if (entry.getValue().equals(nameMonth)) {
                numberMonth = entry.getKey();
                break;
            }
        }

        System.out.println(nameMonth + " is the " + numberMonth + " month");
    }
}
