package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
читаєм з файла текст, та записуєм його в 2 файл, стираючи всі знаки пунктуації replaceAll "\\p{P}"
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileForRead = new BufferedReader(new FileReader(reader.readLine()));
            BufferedWriter fileForWrite = new BufferedWriter(new FileWriter(reader.readLine())))
        {


            fileForWrite.write(fileForRead.readLine().replaceAll("\\p{P}",""));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
