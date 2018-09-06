package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();
        int listSize = 10;
        for (int i = 0; i < listSize; i++) {
            myList.add(input.nextInt());
        }
        /*for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }*/
        int maxLong = 1;
        int currentLong = 1;
        if (!myList.isEmpty()) {
            for (int i = 0; i < listSize - 1; i++) {
                if (myList.get(i).equals(myList.get(i + 1))) currentLong++; // сравнение объектов только через .equals, через == не работает с числами выше 127
                    else {
                        if (currentLong > maxLong) maxLong = currentLong;
                        currentLong = 1;
                        continue;
                    }
            }
            if (currentLong > maxLong) maxLong = currentLong;
        }
        System.out.println(maxLong);

    }
}