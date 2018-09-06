package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner input  = new Scanner(System.in);
        int digit1 = input.nextInt();
        int digit2 = input.nextInt();
        int min = 0;
        if (digit1 <= digit2) min = digit1;
            else min = digit2;
        System.out.println(min);


    }
}