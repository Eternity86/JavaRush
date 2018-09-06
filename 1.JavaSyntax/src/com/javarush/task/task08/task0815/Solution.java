package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("Surname", "Name");
        myMap.put("Surhash", "Name");
        myMap.put("Suname", "Namir");
        myMap.put("Suriname", "Name");
        myMap.put("Gurname", "Name");
        myMap.put("Sunrame", "Name");
        myMap.put("Surmane", "Namer");
        myMap.put("Surmame", "Mane");
        myMap.put("Surnane", "Mamet");
        myMap.put("Sunname", "Name");

        return myMap;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        Integer nameQuantity = 0;
        for (Map.Entry<String, String> entry :
                map.entrySet()) {
            if (entry.getValue().equals(name)) nameQuantity++;
        }
        return nameQuantity;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        Integer surnameQuantity = 0;
        for (Map.Entry<String, String> entry :
                map.entrySet()) {
            if (entry.getKey().equals(lastName)) surnameQuantity++;
        }
        return surnameQuantity;
    }

    public static void main(String[] args) {
        HashMap<String, String> mapPersons = createMap();
        /*for (Map.Entry<String, String> entry :
                mapPersons.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(getCountTheSameFirstName(mapPersons, "Name"));
        System.out.println(getCountTheSameLastName(mapPersons, "Surname"));*/
    }
}
