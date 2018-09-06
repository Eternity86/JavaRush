package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        int digit = 0;
        double sum = 0, i = 0, mid = 0;
        for (;;){
            digit = input.nextInt();
            if (digit == -1) break;
                else {
                    sum = sum + digit;
                    i++;
            }
        }
        if (i > 0) mid = sum / i;
        System.out.println(mid);
    }
}

