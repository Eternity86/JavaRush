package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        int digit1 = input.nextInt();
        int digit2 = input.nextInt();
        int digit3 = input.nextInt();
        int pos = 0, neg = 0;
        if (digit1 > 0) pos++;
            else if (digit1 < 0 ) neg++;
        if (digit2 > 0) pos++;
            else if (digit2 < 0 ) neg++;
        if (digit3 > 0) pos++;
            else if (digit3 < 0 ) neg++;
        System.out.println("количество отрицательных чисел: " + neg);
        System.out.println("количество положительных чисел: " + pos);

    }
}
