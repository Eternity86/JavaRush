package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Scanner;

public class Solution {

    static int[] digit = new int[3];

    public static void swap(int a, int b) {
        int temp = digit[a];
        digit[a] = digit[b];
        digit[b] = temp;
    }
    public static void selectionSort() {
        int out, in, min;
        for(out = 0; out < digit.length; out++) {
            min = out;
            for(in = out + 1; in < digit.length; in++)
                if(digit[in] < digit[min])
                    min = in;
            swap(out, min);
        }

    }
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < digit.length; i++) {
            digit[i] = input.nextInt();
        }
        selectionSort();
        System.out.println(digit[1]);
    }
}
