package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        String digit;
        int stringLength;
        Scanner input = new Scanner(System.in);

        if(input.hasNext())
            if(input.hasNextInt()) {
                digit = input.next();
                stringLength = digit.length();
                for(int i = 0; i != stringLength; i++) {
                    int n = Integer.parseInt(String.valueOf(digit.charAt(i)));
                    if(n % 2 == 0) {Solution.even++;}
                        else {Solution.odd++;}
                }
            }
        System.out.println("Even: " + Solution.even + " Odd: " + Solution.odd);
    }
}
