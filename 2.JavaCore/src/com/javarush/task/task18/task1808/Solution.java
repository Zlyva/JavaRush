package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.Scanner;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileInputStream inputStream = new FileInputStream(scanner.nextLine());
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream(scanner.nextLine());
        FileOutputStream outputStream2 = new FileOutputStream(scanner.nextLine());

        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            int countall = inputStream.read(buffer);
            int count1 = countall / 2 + (countall % 2);
            int count2 = countall - count1;
            outputStream.write(buffer, 0, count1);
            outputStream2.write(buffer, count1, count2);

        }

        inputStream.close();
        outputStream.close();
        outputStream2.close();
    }
}
