package com.javarush.task.task15.task1506;

/* 
Что-то лишнее
*/

public class Solution {
    public static void main(String[] args) {
        print((short) 1); //print (double i)
        print((Number) 1); //print (Object i)
        print(1);           //print (double i)
        print((Integer) 1); //print (Integer i)
        print((int) 1);     //print (double i)
    }

    public static void print(Integer i) {
        System.out.println("Это Integer");
    }

    /*public static void print(int i) {
        System.out.println("Это Integer");
    }*/

    /*public static void print(Short i) {
        System.out.println("Это Object");
    }*/

    public static void print(Object i) {
        System.out.println("Это Object");
    }

    public static void print(double i) {
        System.out.println("Это double");
    }

    public static void print(Double i) {
        System.out.println("Это double");
    }

    /*public static void print(float i) {
        System.out.println("Это Double");
    }*/
}