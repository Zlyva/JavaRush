package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
читаем з файла тільки слова
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        try(BufferedReader reader = new BufferedReader(new FileReader(new BufferedReader(new InputStreamReader(System.in)).readLine()))){
            int count = 0;
            while (reader.ready()){


                String[] split = reader.readLine().split("[^\\w]");
                for (int i = 0; i < split.length; i++) {
                    if(split[i].equals("world")){
                        count++;

                    }

                }

            }
            System.out.println(count);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
