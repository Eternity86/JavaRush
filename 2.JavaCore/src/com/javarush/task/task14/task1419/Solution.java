package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e1) {
            exceptions.add(e1);
        }

        //напишите тут ваш код
        try {
            throw new NullPointerException();
        } catch (Exception e2) {
            exceptions.add(e2);
        }

        try {
            throw new NumberFormatException();
        } catch (Exception e3) {
            exceptions.add(e3);
        }

        try {
            throw new RuntimeException();
        } catch (Exception e4) {
            exceptions.add(e4);
        }

        try{
            throw new IOException();
        } catch (Exception e5) {
            exceptions.add(e5);
        }

        try {
            throw new IllegalArgumentException();
        } catch (Exception e6) {
            exceptions.add(e6);
        }

        try {
            throw new IndexOutOfBoundsException();
        } catch (Exception e7) {
            exceptions.add(e7);
        }

        try {
            throw new FileNotFoundException();
        } catch (Exception e8) {
            exceptions.add(e8);
        }

        try {
            throw new SocketException();
        } catch (Exception e9) {
            exceptions.add(e9);
        }

        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (Exception e10) {
            exceptions.add(e10);
        }
    }
}
