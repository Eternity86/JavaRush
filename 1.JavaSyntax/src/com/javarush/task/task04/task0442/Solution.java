package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        int digit = 0, i = 0;
        /*do {
            digit = input.nextInt();
            i = i + digit;
        } while (digit != -1);*/
        while (true) {
            digit = input.nextInt();
            i = i + digit;
            if (digit == -1) break;
        }
        System.out.println(i);
    }
}
