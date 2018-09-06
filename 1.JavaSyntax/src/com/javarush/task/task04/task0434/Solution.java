package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

         int i = 1;
         while (i <= 10)   {
             int  j = 1;
             while (j <= 10) {
                 if (j < 10) System.out.print((i * j) + " ");
                      else if (i < 10) System.out.println(i * j);
                         else System.out.print(i * j);
              j++;
             }
             i++;
        }
    }
}
