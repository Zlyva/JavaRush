package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/* 
читаєм з файла тільки цифри, та записуєм їх в 2 файл
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileForRead = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileForWrite = new BufferedWriter(new FileWriter(reader.readLine())))
        {
            while (fileForRead.ready()){
                String[] s = fileForRead.readLine().split(" ");
                for (String str: s){
                    if(str.matches("\\b\\d+?\\b")){
                        fileForWrite.write(str + " ");
                    }
                }


            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
