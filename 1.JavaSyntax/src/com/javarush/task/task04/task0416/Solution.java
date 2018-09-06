package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        //float t = 0;
        //try {
        float t = input.nextFloat();
        //} catch (InputMismatchException e) {
            //t = input.nextFloat();
        //}
        float b = t % 5;
        //System.out.println(b);
        if (b >= 0.0 && b < 3.0) System.out.println("зелёный");
            else if (b >= 3.0 && b < 4.0) System.out.println("жёлтый");
                else if (b >= 4.0 && b < 5.0)  System.out.println("красный");
    }
}