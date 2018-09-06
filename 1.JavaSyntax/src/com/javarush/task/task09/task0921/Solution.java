package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {

        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> digits = new ArrayList<>();
        try {
            while (true) {
                digits.add(input.nextInt());
            }
        }
        catch (InputMismatchException e) {
            for (int i = 0; i < digits.size(); i++) {
                System.out.println(digits.get(i));
            }
        }
    }
}
