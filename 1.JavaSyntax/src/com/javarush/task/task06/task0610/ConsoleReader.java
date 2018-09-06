package com.javarush.task.task06.task0610;

import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        return s;

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        return s;

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        double s = scan.nextDouble();
        return s;

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        boolean s = scan.nextBoolean();
        return s;

    }

    public static void main(String[] args) {

    }
}
