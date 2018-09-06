package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        String myString = input.nextLine();

        char[] myCharList = myString.toCharArray();
        ArrayList<Character> myVovelsList = new ArrayList<>();
        ArrayList<Character> myConsonantsList = new ArrayList<>();
        for (int i = 0; i < myCharList.length; i++) {
            if (myCharList[i] == ' ') continue;
                else if (isVowel(myCharList[i])) myVovelsList.add(myCharList[i]);
                    else myConsonantsList.add(myCharList[i]);
        }
        /*for (int i = 0; i < myVovelsList.size(); i++) {
            System.out.print(myVovelsList.get(i) + " ");
        }
        System.out.println("");*/

        for (Character d :
                myVovelsList) {
            System.out.print(d + " ");
        }
        System.out.println();

        /*for (int i = 0; i < myConsonantsList.size(); i++) {

            System.out.print(myConsonantsList.get(i) + " ");
        }
        System.out.println("");*/
        for (Character d :
                myConsonantsList) {
            System.out.print(d + " ");
        }
        System.out.println();

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}