package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(input.nextLine());
        }

        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> myList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            myList.add(list.get(i));
            myList.add(list.get(i));
        }
        return myList;
    }
}
