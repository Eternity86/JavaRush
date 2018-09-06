package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        /*printCats(cats);
        System.out.println("");*/
        //напишите тут ваш код. step 3 - пункт 3
        cats.remove(cats.toArray()[0]);

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> cats = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            cats.add(new Cat());
        }
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat i : cats) {
            System.out.println(i);
        }
        //cats.forEach(System.out::println); //вывод содержимого Set через лямбда-выражения
    }

    // step 1 - пункт 1
    public static class Cat {
        public Cat() {

        }
    }
}
