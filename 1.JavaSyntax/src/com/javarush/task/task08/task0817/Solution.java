package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("Ivanon", "Stepan");
        myMap.put("Petrov", "Taras");
        myMap.put("Sidorov", "Stepan");
        myMap.put("Ushakov", "Ivan");
        myMap.put("Kerzhakov", "Sergei");
        myMap.put("Smirnov", "Aleksandr");
        myMap.put("Kruglov", "Aleksandr");
        myMap.put("Uglov", "Anton");
        myMap.put("Noskov", "Kolya");
        myMap.put("Baskov", "Kolya");

        return myMap;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<>(map.values());
        //System.out.println("");
        //System.out.println(set);

        //System.out.println("");
        ArrayList<String> list = new ArrayList<>(map.values());

        //System.out.println(list);

        //System.out.println("");

        for (String x : set) {
            list.remove(x);
        }

        for(int i = 0; i < list.size(); i++){
            removeItemFromMapByValue(map, list.get(i));
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> myMap = createMap();
        for (HashMap.Entry<String, String> entry :
                myMap.entrySet()) {
            //System.out.println(entry.getKey() + " " + entry.getValue());
        }
        removeTheFirstNameDuplicates(myMap);
        //System.out.println("");
        for (HashMap.Entry<String, String> entry :
                myMap.entrySet()) {
            //System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
