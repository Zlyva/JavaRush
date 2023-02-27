package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
maxByte
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
            int maxInt = Integer.MIN_VALUE;
            while (fileInputStream.available() > 0) {
                int value = fileInputStream.read();
                if (value > maxInt) {
                    maxInt = value;
                }
            }
            System.out.println(maxInt);
        }
    }
}
