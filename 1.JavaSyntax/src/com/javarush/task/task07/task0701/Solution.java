package com.javarush.task.task07.task0701;

import java.io.IOException;
import java.util.Scanner;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int[] arr = new int[20];
        Scanner inp = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++)
            arr[i] = inp.nextInt();
        return arr;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max = array[0];
        for(int j = 1; j < array.length; j++)
            if(array[j] > max) max = array[j];
        return max;
    }
}
