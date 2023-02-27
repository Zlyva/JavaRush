package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
minByte
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
            int minInt = Integer.MAX_VALUE;
            while (fileInputStream.available() > 0) {
                int value = fileInputStream.read();
                if (value < minInt) {
                    minInt = value;
                }
            }
            System.out.println(minInt);
        }
    }
}
