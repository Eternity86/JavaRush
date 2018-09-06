package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> myList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            myList.add(input.nextLine());
        }
        int min = myList.get(0).length();
        int max = myList.get(0).length();
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < myList.size(); i++) {
            if(myList.get(i).length() < min) {
                min = myList.get(i).length();
                minIndex = i;
            }
            if(myList.get(i).length() > max) {
                max = myList.get(i).length();
                maxIndex = i;
            }
        }
        if(minIndex > maxIndex) System.out.println(myList.get(maxIndex));
            else System.out.println(myList.get(minIndex));

    }
}
