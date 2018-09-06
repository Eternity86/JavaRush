package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        //double max = Double.MIN_VALUE, min = Double.MAX_VALUE , mid = 0;
        if(a < b) {
            double temp;
            temp = a;
            a = b;
            b = temp;
        }
        if(b < c) {
            double temp;
            temp = b;
            b = c;
            c = temp;
        }
        if(a < b) {
            double temp;
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println(a + " " + b + " " + c);
    }
}
