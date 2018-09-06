package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        ArrayList<String> myStringArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myStringArray.add(input.nextLine());
        }
        //int min = myStringArray.get(0).length();
        for (int i = 1; i < myStringArray.size(); i++) {
            if (myStringArray.get(i - 1).length() > myStringArray.get(i).length()) System.out.println(i);
        }
    }
}

