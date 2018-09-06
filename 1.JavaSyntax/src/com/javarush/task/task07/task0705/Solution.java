package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arrayBig = new int[20];
        int[] arraySmall1 = new int[10];
        int[] arraySmall2 = new int[10];
        Scanner input  = new Scanner(System.in);
        for(int i = 0; i < arrayBig.length; i++) {
            arrayBig[i] = input.nextInt();
            if (i < 10) arraySmall1[i] = arrayBig[i];
                else arraySmall2[i - 10] = arrayBig[i];
        }
        for(int j = 0; j < arraySmall2.length; j++)
            System.out.println(arraySmall2[j]);
        }
    }

