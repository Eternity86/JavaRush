package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        /* напишите тут ваш код */
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = input.nextInt();
        if (age < 18) System.out.println("Подрасти еще");
    }
}
