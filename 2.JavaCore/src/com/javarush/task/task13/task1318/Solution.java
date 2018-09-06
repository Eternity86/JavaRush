package com.javarush.task.task13.task1318;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException, InterruptedException {
        // напишите тут ваш код

        // Считать с консоли имя файла
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathName = reader.readLine();
        reader.close();

        // Вывести в консоль(на экран) содержимое файла.
        FileInputStream input = new FileInputStream(pathName); // чтение из файла pathName
        while (input.available() > 0) {
            System.out.print((char)input.read());
        }

        // Закрыть поток чтения с файла и поток ввода с клавиатуры.
        input.close();

    }
}