package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        int digit1 = input.nextInt();
        int digit2 = input.nextInt();
        int digit3 = input.nextInt();
        int digit4 = input.nextInt();
        int max = 0, max1 = 0, max2 = 0;
        if (digit1 >= digit2) max1 = digit1;
            else max1 = digit2;
        if (digit3 >= digit4) max2 = digit3;
            else max2 = digit4;
        if (max1 >= max2) max = max1;
            else max = max2;
        System.out.println(max);
    }
}
