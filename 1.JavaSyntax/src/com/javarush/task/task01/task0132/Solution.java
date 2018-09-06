package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int digit1 = number % 10;
        int digit2 = ((number - digit1) % 100) / 10;
        int digit3 = ((number - digit1-digit2) % 1000) / 100;

        return digit1 + digit2 + digit3;
    }
}