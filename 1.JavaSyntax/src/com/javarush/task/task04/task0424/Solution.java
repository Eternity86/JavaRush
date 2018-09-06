package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        int digit1 = input.nextInt();
        int digit2 = input.nextInt();
        int digit3 = input.nextInt();
        if (digit1 == digit2 && digit1 != digit3) System.out.println(3);
        if (digit1 == digit3 && digit1 != digit2) System.out.println(2);
        if (digit2 == digit3 && digit2 != digit1) System.out.println(1);
    }
}
