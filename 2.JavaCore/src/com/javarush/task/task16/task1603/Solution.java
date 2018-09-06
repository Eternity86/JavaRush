package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread sThread1 = new SpecialThread();
        Thread thread1 = new Thread(sThread1);

        SpecialThread sThread2 = new SpecialThread();
        Thread thread2 = new Thread(sThread2);

        SpecialThread sThread3 = new SpecialThread();
        Thread thread3 = new Thread(sThread3);

        SpecialThread sThread4 = new SpecialThread();
        Thread thread4 = new Thread(sThread4);

        SpecialThread sThread5 = new SpecialThread();
        Thread thread5 = new Thread(sThread5);

        if (2 < 33.0) System.out.println("Можно1");

        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);
        for (Thread th:
                list) {
            th.start();
        }
        if (2 < 33.0) System.out.println("Можно2");
        if (2 < 33.0) System.out.println("Можно3");
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method " + this.getClass().getName() + " inside SpecialThread");
        }
    }
}
