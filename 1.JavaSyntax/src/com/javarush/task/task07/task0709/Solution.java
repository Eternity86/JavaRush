package com.javarush.task.task07.task0709;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> myList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            myList.add(input.nextLine());
        }
        ArrayList<String> minString = new ArrayList<>();
        int min = myList.get(0).length();
        for (int i = 1; i < myList.size(); i++) {
            if(myList.get(i).length() < min) min = myList.get(i).length();
        }
        for (int i = 0; i < myList.size(); i++) {
            if(myList.get(i).length() == min) minString.add(myList.get(i));
        }
        for (int i = 0; i < minString.size(); i++) {
            System.out.println(minString.get(i));
        }
    }
}

