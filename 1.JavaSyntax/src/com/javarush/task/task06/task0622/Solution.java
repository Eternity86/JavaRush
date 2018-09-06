package com.javarush.task.task06.task0622;

import java.io.IOException;
import java.util.Scanner;

/* 
Числа по возрастанию
*/

public class Solution {

    private static int maxSize = 5;
    private static int[] digit = new int[maxSize];

    public static void swap(int a, int b) {
        int temp = digit[a];
        digit[a] = digit[b];
        digit[b] = temp;

        // Перестановка местами двух элементов без использования дополнительной переменной
        //digit[a] = digit[a] + digit[b];
        //digit[b] = digit[a] - digit[b];
        //digit[a] = digit[a] - digit[b];
        //
    }
    public static void selectionSort() {
        int out, in, min;
        for(out = 0; out < maxSize - 1; out++) {
            min = out;
            for(in = out + 1; in < maxSize; in++)
                if(digit[in] < digit[min])
                    min = in;
                swap(out, min);
        }
    }

    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner reader = new Scanner(System.in);

        for(int i = 0; i < digit.length; i++) {
            digit[i] = reader.nextInt();
        }
        //напишите тут ваш код
        selectionSort();
        for(int j = 0; j < maxSize; j++)
            System.out.println(digit[j]);


    }
}
