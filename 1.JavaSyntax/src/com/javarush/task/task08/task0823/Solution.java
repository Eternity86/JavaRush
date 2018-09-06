package com.javarush.task.task08.task0823;

import java.io.IOException;
import java.util.Scanner;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        char[] arrString = s.toCharArray();

        for (int i = 0; i < arrString.length; i++) {
            if (Character.isLetter(arrString[i]) && i == 0 || Character.isLetter(arrString[i]) && Character.isSpaceChar(arrString[i - 1])) arrString[i] = Character.toUpperCase(arrString[i]);
        }
        s = new String(arrString);
        System.out.println(s);
        //напишите тут ваш код
    }
}
