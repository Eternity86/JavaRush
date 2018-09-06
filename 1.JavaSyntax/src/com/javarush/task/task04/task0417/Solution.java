package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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
        if (digit1 == digit2 && digit2 == digit3) System.out.println(digit1 + " " + digit2 + " " + digit3);
            else if (digit1 == digit2) System.out.println(digit1 + " " + digit2);
                    else if (digit1 == digit3) System.out.println(digit1 + " " + digit3);
                            else if (digit2 == digit3) System.out.println(digit2 + " " + digit3);
    }
}