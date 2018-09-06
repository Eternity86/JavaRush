package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.WriteAbortedException;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        Scanner in = new Scanner(System.in);
        String s;
        while (true) {
            s = in.nextLine();
            if (s.equals("exit")) break;
            try {
                if (s.contains(".")) {
                    print(Double.valueOf(s));
                } else if (Integer.valueOf(s) <= 0 || Integer.valueOf(s) >= 128) {
                    print(Integer.valueOf(s));
                } else if (Short.valueOf(s) > 0 && Short.valueOf(s) < 128) {
                    print(Short.valueOf(s));
                }
            } catch (NumberFormatException e) {
                print(s);
            }
        }

    }


    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
