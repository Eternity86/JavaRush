package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> addList3 = new ArrayList<>();
        ArrayList<Integer> addList2 = new ArrayList<>();
        ArrayList<Integer> addListOther = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            mainList.add(input.nextInt());
        }
        for (int i = 0; i < mainList.size(); i++) {
            if (mainList.get(i) % 3 != 0 && mainList.get(i) % 2 != 0) addListOther.add(mainList.get(i));
                else {
                        if (mainList.get(i) % 3 == 0) addList3.add(mainList.get(i));
                        if (mainList.get(i) % 2 == 0) addList2.add(mainList.get(i));
            }
        }


        printList(addList3);
        printList(addList2);
        printList(addListOther);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
