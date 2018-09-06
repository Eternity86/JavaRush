package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            strings.add(i, input.nextLine());
        }
        int max = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length() > max) max = strings.get(i).length();
        }
        ArrayList<String> maxStringList = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length() == max) maxStringList.add(strings.get(i));
        }
        for (int i = 0; i < maxStringList.size(); i++) {
            System.out.println(maxStringList.get(i));
        }
    }
}
