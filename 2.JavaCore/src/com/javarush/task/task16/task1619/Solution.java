package com.javarush.task.task16.task1619;

/* 
А без interrupt слабо?
*/

public class Solution {
    public static boolean isSolutionRun = true;
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        Solution.isSolutionRun = false;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (Solution.isSolutionRun) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                /*if (!Solution.isSolutionRun) {
                    return;*/
            }


        }
    }
}
