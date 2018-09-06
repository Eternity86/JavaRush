package com.javarush.task.task05.task0530;



/* 
Шеф, что-то не пашет
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String inpA = reader.readLine();
        //String inpB = reader.readLine();

        //int a = Integer.parseInt(reader.readLine());
        //int b = Integer.parseInt(reader.readLine());


        //int sum = a + b;
        int sum = Integer.parseInt(reader.readLine()) + Integer.parseInt(reader.readLine());
        System.out.println("Sum = " + sum);
    }
}
