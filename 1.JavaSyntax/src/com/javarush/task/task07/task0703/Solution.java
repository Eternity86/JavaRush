package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] stroka = new String[10];
        int[] digit = new int[10];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < stroka.length; i++) {
            stroka[i] = input.nextLine();
            //digit[i] = stroka[i].length();
            //System.out.println(digit[i]);
        }
        for(int j = 0; j < digit.length; j++) {
            digit[j] = stroka[j].length();
            System.out.println(digit[j]);
        }
    }
}
