package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int n = input.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(s);
            i++;
        }
    }
}
