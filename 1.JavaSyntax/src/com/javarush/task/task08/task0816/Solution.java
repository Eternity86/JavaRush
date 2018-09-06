package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> myMap = new HashMap<String, Date>();
        myMap.put("Stallone", df.parse("JUNE 01 1980"));
        myMap.put("Stalone", df.parse("SEPTEMBER 05 1980"));
        myMap.put("Stallonne", df.parse("JULY 10 1980"));
        myMap.put("Stallonee", df.parse("JUNE 01 1980"));
        myMap.put("Staplone", df.parse("JANUARY 01 1980"));
        myMap.put("Stalpone", df.parse("AUGUST 01 1980"));
        myMap.put("Stollone", df.parse("MARCH 01 1980"));
        myMap.put("Stolloonee", df.parse("FEBRUARY 01 1980"));
        myMap.put("Staellone", df.parse("JUNE 11 1980"));
        myMap.put("Steellone", df.parse("OCTOBER 12 1980"));

        //напишите тут ваш код
        return myMap;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();

        while(iter.hasNext()){
            HashMap.Entry<String, Date> s = iter.next();
            if(s.getValue().getMonth() > 4 & s.getValue().getMonth() < 8){
                iter.remove();
            }
        }

    }

    public static void main(String[] args) throws ParseException{
        HashMap<String, Date> map = createMap();
        for (HashMap.Entry<String, Date> iter :
                map.entrySet()) {
            //System.out.println(iter.getKey() + " " + iter.getValue());
        }
        //System.out.println("");
        removeAllSummerPeople(map);
        for (HashMap.Entry<String, Date> iter :
                map.entrySet()) {
            //System.out.println(iter.getKey() + " " + iter.getValue());
        }

    }
}
