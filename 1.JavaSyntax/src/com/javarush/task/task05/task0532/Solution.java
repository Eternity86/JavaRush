package com.javarush.task.task05.task0532;

//import java.io.*;

/* 
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        int maximum = Integer.MIN_VALUE;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        //напишите тут ваш код
        for(int i = 0; i < n; i++) {
            //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int m = Integer.parseInt(reader.readLine());
            if(m > maximum) maximum = m;
        }

        System.out.println(maximum);
    }
}
