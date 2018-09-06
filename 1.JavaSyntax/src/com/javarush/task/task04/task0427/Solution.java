package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        int digit = input.nextInt();
        int length = String.valueOf(digit).length();
        if (digit >= 1 && digit <= 999 && digit % 2 != 0 && length == 1) System.out.println("нечетное однозначное число");
        if (digit >= 1 && digit <= 999 && digit % 2 == 0 && length == 1) System.out.println("четное однозначное число");
        if (digit >= 1 && digit <= 999 && digit % 2 != 0 && length == 2) System.out.println("нечетное двузначное число");
        if (digit >= 1 && digit <= 999 && digit % 2 == 0 && length == 2) System.out.println("четное двузначное число");
        if (digit >= 1 && digit <= 999 && digit % 2 != 0 && length == 3) System.out.println("нечетное трехзначное число");
        if (digit >= 1 && digit <= 999 && digit % 2 == 0 && length == 3) System.out.println("четное трехзначное число");



    }
}
