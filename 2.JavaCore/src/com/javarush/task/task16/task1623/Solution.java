package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {

        public GenerateThread() {
            super(String.valueOf(++countCreatedThreads));
            start();
            /*try {
                join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }

        public void run() {
            /*  while == размножение почкованием, но в акте рождения могут вылупиться потоки-близнецы...которые в свою очередь народят новых
                такой вариант не соответствует условию и сути задания
                if == размножение почкованием, в акте рождения рождается одна! почка, которая и становится мамой-веточкой для новой почки*/
            if (countCreatedThreads < Solution.count) {
                System.out.println(new GenerateThread());
            }
        }

        public String toString() {
            return (getName() + " created");
        }

    }
}
