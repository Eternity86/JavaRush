package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> myList = new ArrayList<>();
        Integer n = Integer.parseInt(reader.readLine()); //общее количество необходимых строк
        Integer m = Integer.parseInt(reader.readLine()); //количество строк, которые нужно переставить в конец
        for (int i = 0; i < n; i++) {
            myList.add(reader.readLine());
        }
        for (int i = 0; i < m; i++) {
            myList.add(myList.get(0));
            myList.remove(0);
        }
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

    }
}
