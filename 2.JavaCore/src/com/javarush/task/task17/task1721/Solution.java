package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
FileReader
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {
        Scanner scan = new Scanner(System.in);
        String nameOne = scan.nextLine();
        String nameTwo = scan.nextLine();
        try(BufferedReader file1 = new BufferedReader(new FileReader(nameOne));
            BufferedReader file2 = new BufferedReader(new FileReader(nameTwo))){
            while (file1.ready()){
                allLines.add(file1.readLine());
            }
            while (file2.ready()){
                forRemoveLines.add(file2.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Solution object = new Solution();
        object.joinData();
        scan.close();
    }

    public void joinData() throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
