package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        for(int x = 1; x < 11; x++)
        {
            for(int y = 0; y < x; y++)
            {
                System.out.print("8");
            }
            if (x < 10) System.out.println();
                else System.out.print("");
        }

    }
}
