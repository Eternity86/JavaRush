package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] stroka = new String[10];
        Scanner inp = new Scanner(System.in);
        for(int i = 0; i < stroka.length - 2; i++)
            stroka[i] = inp.nextLine();
        for(int j = stroka.length - 1; j >= 0; j--)
            System.out.println(stroka[j]);
    }
}