package com.javarush.task.task05.task0529;

import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum = 0;
        String s = null;
        Scanner input = new Scanner(System.in);

        while(input.hasNext()) {
            if(input.hasNextInt()) sum = sum + input.nextInt();
            if(input.hasNextLine()) {
                s = input.nextLine();
                if(s.equals("сумма")) break;
            }
        }
        System.out.println(sum);
    }
}
