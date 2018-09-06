package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("арбуз", "ягода");
        myMap.put("банан", "трава");
        myMap.put("вишня", "ягода");
        myMap.put("груша", "фрукт");
        myMap.put("дыня", "овощ");
        myMap.put("ежевика", "куст");
        myMap.put("жень-шень", "корень");
        myMap.put("земляника", "ягода");
        myMap.put("ирис", "цветок");
        myMap.put("картофель", "клубень");

        printKeysValues(myMap);
    }

        public static void printKeysValues(Map<String, String> myMap) {
            //напишите тут ваш код
            for (Map.Entry<String, String> pair :
                    myMap.entrySet()) {
                System.out.println(pair.getKey() + " - " + pair.getValue());
            }
        }


}
