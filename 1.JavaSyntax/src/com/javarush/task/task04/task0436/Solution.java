package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print(8);
            if (i < m) System.out.println();

        }
    }
}