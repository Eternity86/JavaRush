package com.javarush.task.task04.task0428;

/* 
Положительное число
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
        int i = 0;
        if (digit1 > 0) i++;
        if (digit2 > 0) i++;
        if (digit3 > 0) i++;
        System.out.println(i);


    }
}
