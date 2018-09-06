package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();

        // конструкция "try с ресурсами" для наследников интерфейса Closeable, которые автоматически закрываются после использования
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {

            String text;

            // чтение построчно
            do {
                text = br.readLine();

                bw.write(text + System.getProperty("line.separator"));
                bw.flush();
            }
            while (!text.equals("exit"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        input.close();
    }
}
