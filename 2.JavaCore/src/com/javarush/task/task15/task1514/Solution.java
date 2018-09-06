package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();
    static {
        labels.put(2.0, "dd");
        labels.put(3.0, "string");
        labels.put(4.2, "strrrring");
        labels.put(5.1, "tetsting");
        labels.put(6.2, "stop");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
