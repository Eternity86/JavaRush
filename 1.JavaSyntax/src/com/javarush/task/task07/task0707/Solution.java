package com.javarush.task.task07.task0707;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> myList = new ArrayList<String>();
        /*Scanner input = new Scanner(System.in);*/
        for(int i = 0; i < 5; i++) {
            myList.add(String.valueOf(Math.random()));
        }
        System.out.println(myList.size());
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));

        }
    }
}
