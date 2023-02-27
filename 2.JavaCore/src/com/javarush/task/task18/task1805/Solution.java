package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
            TreeSet<Integer> set = new TreeSet<>();
            while (fileInputStream.available() > 0) {
                set.add(fileInputStream.read());
            }
            set.forEach(o -> {
                System.out.print(o + " ");
            });
        }
    }
}
