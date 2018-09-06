package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        int digit = input.nextInt();
        if (digit < 0 && (digit % 2) != 0) System.out.println("отрицательное нечетное число");
        if (digit < 0 && (digit % 2) == 0) System.out.println("отрицательное четное число");
        if (digit > 0 && (digit % 2) != 0) System.out.println("положительное нечетное число");
        if (digit > 0 && (digit % 2) == 0) System.out.println("положительное четное число");
        if (digit == 0) System.out.println("ноль");
    }
}
