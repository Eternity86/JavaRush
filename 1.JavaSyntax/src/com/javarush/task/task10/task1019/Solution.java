package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner reader = new Scanner(System.in);
        HashMap<String, Integer> myMap = new HashMap<>();
        int id;
        String name;
        while (true) {
            String tempId = reader.nextLine();
            if (tempId.isEmpty()) {
                break;
            } else id = Integer.parseInt(tempId);

            name = reader.nextLine();
            if (name.isEmpty()) {
                myMap.put(name, id);
                break;
            } else myMap.put(name, id);
        }
        for (Map.Entry<String, Integer> s:
            myMap.entrySet()){
            System.out.println(s.getValue() + " " + s.getKey());
        }
    }
}
