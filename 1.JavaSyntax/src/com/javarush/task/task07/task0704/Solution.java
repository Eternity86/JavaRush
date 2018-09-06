package com.javarush.task.task07.task0704;

import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //int maxSize = 10;
        int[] arr = new int[10];
        Scanner inp = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++)
            arr[i] = inp.nextInt();
        for(int i = arr.length - 1; i >= 0; i--)
            System.out.println(arr[i]);

    }
}

