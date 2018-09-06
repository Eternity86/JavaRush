package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> myMap = new HashMap<>();
        myMap.put("Connor", "John");
        myMap.put("Connor", "Sarah");
        myMap.put("Smith", "Will");
        myMap.put("Farrel", "Will");
        myMap.put("Ivanov", "Ivan");
        myMap.put("Petrov", "Ivan");
        myMap.put("Sidorov", "Ivan");
        myMap.put("Petrov", "Petr");
        myMap.put("Sidorov", "Ivan");
        myMap.put("Sidorov", "Stepan");

        return myMap;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
