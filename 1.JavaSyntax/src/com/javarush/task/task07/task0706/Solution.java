package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] house = new int[15];
        int odd = 0, even = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < house.length; i++) {
            house[i] = input.nextInt();
            if(i == 0) even = even + house[i];
                else if(i % 2 == 0) even = even + house[i];
                        else odd = odd + house[i];

        }
        if(even > odd) System.out.println("В домах с четными номерами проживает больше жителей.");
            else if(odd > even) System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
