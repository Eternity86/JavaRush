package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arrayList = new ArrayList[5];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = new ArrayList<>();
            arrayList[i].add("string_" + i + "_" + i);
            arrayList[i].add("string_" + i + "_" + (i + 1));
            arrayList[i].add("string_" + (i + 1 + "_" + i));
        }

        return arrayList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        // выводим последовательно все значения массива "массива строк" от первого до последнего
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
        // выводим построчно значения каждого "массива строк" в массиве
        for (int i = 0; i < arrayOfStringList.length; i++) {
            System.out.println(arrayOfStringList[i]);
        }
    }
}