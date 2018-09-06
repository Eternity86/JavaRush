package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Solution {

    public static void main(String[] args) throws IOException {

        try {
            divisionByZero();
        }
        catch (Exception e) {
            e.printStackTrace();
            /*StringWriter sw = null;
            try {
                sw = new StringWriter();
                e.printStackTrace(new PrintWriter(sw));
                String stackTrace = sw.toString();
                System.out.println(stackTrace);
            }
            finally {
                if (sw != null) {
                    sw.close();
                }
            }*/

        }
    }

    public static void divisionByZero () {
        int i = 42 / 0;
        System.out.println(i);
    }
}
