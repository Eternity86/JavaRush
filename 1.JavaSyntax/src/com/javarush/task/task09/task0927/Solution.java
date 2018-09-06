package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> myMap = new HashMap<>();
        myMap.put("Murzik", new Cat("Murzik"));
        myMap.put("Pushok", new Cat("Pushok"));
        myMap.put("Snezhok", new Cat("Snezhok"));
        myMap.put("Murchik", new Cat("Murchik"));
        myMap.put("Sharik", new Cat("Sharik"));
        myMap.put("Tom", new Cat("Tom"));
        myMap.put("Thomas", new Cat("Thomas"));
        myMap.put("Dashka", new Cat("Dashka"));
        myMap.put("Murka", new Cat("Murka"));
        myMap.put("Tuzik", new Cat("Tuzik"));

        return myMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код

        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
