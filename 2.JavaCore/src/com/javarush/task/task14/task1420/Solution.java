package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int digit1 = 0, digit2 = 0;
        Scanner input = new Scanner(System.in);
        try {
            digit1 = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Вводите только целое число");
            digit1 = input.nextInt();
        }
        try {
            digit2 = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Вводите только целое число");
            digit2 = input.nextInt();
        }
        System.out.println(digit1);
        System.out.println(digit2);
    }
}
