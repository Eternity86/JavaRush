package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("Ivanov", 200);
        myMap.put("Petrov", 800);
        myMap.put("Sidorov", 1000);
        myMap.put("Putin", 450);
        myMap.put("Smith", 300);
        myMap.put("Cage", 900);
        myMap.put("Blade", 500);
        myMap.put("O'Connor", 100);
        myMap.put("O'Hara", 200);
        myMap.put("Mishima", 300);

        return myMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            if ((int)entry.getValue() < 500) {
                iter.remove();
            }
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> myMap = createMap();
        //System.out.println(myMap);
        removeItemFromMap(myMap);
        //System.out.println(myMap);

    }
}