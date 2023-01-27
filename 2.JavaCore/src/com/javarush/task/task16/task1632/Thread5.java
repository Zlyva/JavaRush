package com.javarush.task.task16.task1632;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thread5 extends Thread {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void run() {
        try {
            int result = 0;
            String str;
            while (!(str = reader.readLine()).equals("N")) {
                result += Integer.parseInt(str);
            }
            System.out.println(result);
        } catch (IOException e) {

        }

    }

}
